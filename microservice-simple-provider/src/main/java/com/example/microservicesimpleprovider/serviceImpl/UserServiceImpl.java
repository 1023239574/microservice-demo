package com.example.microservicesimpleprovider.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.microservicesimpleapi.bean.entity.User;
import com.example.microservicesimplecommon.utils.RedisUtil;
import com.example.microservicesimpleprovider.mapper.UserMapper;
import com.example.microservicesimpleapi.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author twx
 * @since 2019-11-13
 */
@Service
@RequestMapping("/provider/users/")
@ResponseBody
@ApiIgnore
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    @PostMapping("getAllUsers")
    public List<User> getAllUsers() {
        return super.list();
    }

    @Override
    @PostMapping("getUserByUserName")
    public User getUserByUserName(String username) {
        User user=userMapper.getUserByUsername(username);
        if (user != null){
            RedisUtil.publish(RedisUtil.TEST_CHANNEL,user);
        }
        return user;
    }
}
