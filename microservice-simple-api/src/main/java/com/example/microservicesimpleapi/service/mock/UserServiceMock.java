package com.example.microservicesimpleapi.service.mock;

import com.example.microservicesimpleapi.bean.entity.User;
import com.example.microservicesimpleapi.service.IUserService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserServiceMock implements IUserService {

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserByUserName(String username) {
        return null;
    }
}
