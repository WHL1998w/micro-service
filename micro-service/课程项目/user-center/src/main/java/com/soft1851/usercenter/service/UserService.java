package com.soft1851.usercenter.service;

import com.soft1851.usercenter.domain.entity.User;

/**
 * @ClassName
 * @Description TODO
 * @Author wanghuanle
 * @Date
 **/
public interface UserService {
    /**
     * 根据id获得用户详情
     * @param id
     * @return User
     */
    User findById(Integer id);
}
