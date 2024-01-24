package io.github.hungslab.UrbanFireProtection.controller;

import io.github.hungslab.UrbanFireProtection.pojo.User;
import io.github.hungslab.UrbanFireProtection.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Hungs
 * @date 2024/1/22
 * @Description 注册相关 API 管理器
 */

@RestController
@Slf4j
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/apr/regist")
    public Map<String, Object> registAccount(User user) {
        return userService.registAccount(user);
    }

}
