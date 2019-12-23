package com.example.microservicesimpledemo.controller;

import com.example.microservicesimpleapi.bean.JsonResult;
import com.example.microservicesimplecommon.utils.KafkaUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafkaTest")
public class kafkaTestController {

    @RequestMapping(value = "kafkaSendMessage",method = RequestMethod.POST)
    public JsonResult sendMessage(@RequestParam("message")String message){
        KafkaUtil.sendMessage("kafkaTest",message);
        return JsonResult.SUCCESS(true);
    }


}
