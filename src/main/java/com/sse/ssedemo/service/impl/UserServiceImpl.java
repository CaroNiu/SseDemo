package com.sse.ssedemo.service.impl;

import com.sse.ssedemo.entity.UserEntity;
import com.sse.ssedemo.mapper.UserMapper;
import com.sse.ssedemo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author niuheng
 * @date 2023年11月27日 17:40
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {
}
