package io.github.hungslab.UrbanFireProtection.service;

import io.github.hungslab.UrbanFireProtection.pojo.User;

import java.util.Map;

/**
 * @author admin
 * @date 2024/1/22
 * @Description Description of the file.
 */

public interface UserService {
    /**
     * 注册账号
     * @param user
     * @return
     */
    Map<String, Object> registAccount(User user);
}
