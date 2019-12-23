package com.example.microservicesimpleprovider.controller;


import com.example.microservicesimpleapi.bean.JsonResult;
import com.example.microservicesimpleapi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author twx
 * @since 2019-11-13
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("getAllUsers")
    public JsonResult getAllUsers(){
        return JsonResult.SUCCESS(userService.getAllUsers());
    }

    @PostMapping("getUserByUserName")
    public JsonResult getUserByUserName(@RequestParam("username") String username){
        return JsonResult.SUCCESS(userService.getUserByUserName(username));
    }

}

