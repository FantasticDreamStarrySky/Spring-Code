package com.fantasticdreamstarrysky.springbootmybatis.service;

import com.fantasticdreamstarrysky.springbootmybatis.pojo.User;

/**
 * @author 🌃梦幻◎星空🌃
 */
public interface UserService {

    /**
     * 根据用户ID查找用户对象
     * @param id ID
     * @return User
     */
    User findById(Integer id);

}
