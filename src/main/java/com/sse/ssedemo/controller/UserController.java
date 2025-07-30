package com.sse.ssedemo.controller;

import com.sse.ssedemo.entity.UserEntity;
import com.sse.ssedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.UUID;

/**
 * @author niuheng
 * @date 2023年11月27日 17:41
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void addUser(@RequestBody UserEntity userEntity) {
        if (Objects.nonNull(userEntity)) {
            userEntity.setId(UUID.randomUUID().toString());
            userService.save(userEntity);
        }
    }
}
