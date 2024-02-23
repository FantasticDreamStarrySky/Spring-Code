package com.fantasticdreamstarrysky.springbootmybatis.service.impl;

import com.fantasticdreamstarrysky.springbootmybatis.mapper.UserMapper;
import com.fantasticdreamstarrysky.springbootmybatis.pojo.User;
import com.fantasticdreamstarrysky.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 🌃梦幻◎星空🌃
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户ID查找用户对象
     *
     * @param id ID
     * @return User
     */
    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
