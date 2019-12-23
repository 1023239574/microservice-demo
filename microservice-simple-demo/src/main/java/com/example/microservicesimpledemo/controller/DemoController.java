package com.example.microservicesimpledemo.controller;

import com.example.microservicesimpleapi.bean.requset.LoginParams;
import com.example.microservicesimpleapi.service.IUserService;
import com.example.microservicesimpleapi.bean.JsonResult;
import com.example.microservicesimpleapi.bean.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private IUserService userService;

    @PostMapping("login")
    public JsonResult login(@RequestBody LoginParams loginParams){
        String username=loginParams.getUsername();
        String password=loginParams.getPassword();
        User user= userService.getUserByUserName(username);
        if (user==null){
            return JsonResult.COMMON_ERROR("用户名不存在");
        }
        if (password.equals(user.getPassword())){
            return JsonResult.SUCCESS("登录成功");
        }else {
            return JsonResult.COMMON_ERROR("密码错误");
        }
    }

    @PostMapping("getUser")
    public JsonResult getUser(@RequestParam("username")String username){
        User user=userService.getUserByUserName(username);
        return JsonResult.SUCCESS(user);
    }
}
