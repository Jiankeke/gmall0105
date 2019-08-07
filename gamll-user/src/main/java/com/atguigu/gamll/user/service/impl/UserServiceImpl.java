package com.atguigu.gamll.user.service.impl;

import com.atguigu.gamll.user.bean.UmsMember;
import com.atguigu.gamll.user.mapper.UserMapper;
import com.atguigu.gamll.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.getAllUser();
        return umsMembers;
    }
}
