package com.itheima.Service;

import com.itheima.Mapper.UserMapper;
import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yn
 * @version 1.0
 * @date 2020/4/22 23:19
 */
@Service
public class UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
