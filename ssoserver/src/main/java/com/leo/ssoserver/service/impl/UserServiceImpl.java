package com.leo.ssoserver.service.impl;

import com.leo.ssoserver.mapper.UserMapper;
import com.leo.ssoserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
}
