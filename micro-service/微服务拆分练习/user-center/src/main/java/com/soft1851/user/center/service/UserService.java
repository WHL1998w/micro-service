package com.soft1851.user.center.service;

import com.soft1851.user.center.domain.dto.UserDto;
import com.soft1851.user.center.dao.UserMapper;
import com.soft1851.user.center.domain.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/09/20
 **/
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserMapper userMapper;

    public UserDto getUserDto(int id){
        User user = userMapper.selectByPrimaryKey(id);
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUserName(user.getUserName());
        userDto.setAvatarUrl(user.getAvatarUrl());
        return userDto;
    }
}
