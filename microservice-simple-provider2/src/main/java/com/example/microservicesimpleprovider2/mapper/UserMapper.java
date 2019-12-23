package com.example.microservicesimpleprovider2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.microservicesimpleapi.bean.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author twx
 * @since 2019-11-13
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    User getUserByUsername(@Param("username") String username);

}
