package com.example.microservicesimpleapi.service;

import com.example.microservicesimpleapi.bean.entity.User;
import com.example.microservicesimpleapi.service.mock.UserServiceMock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author twx
 * @since 2019-11-13
 */
@FeignClient(name = "microservice-simple-provider", path="/provider/users",fallback = UserServiceMock.class)
public interface IUserService {

    @RequestMapping(value = "getAllUsers",method = RequestMethod.POST)
    List<User> getAllUsers();

    @RequestMapping(value = "getUserByUserName",method = RequestMethod.POST)
    User getUserByUserName(@RequestParam("username") String username);


}
