package io.github.hungslab.UrbanFireProtection.controller;

import io.github.hungslab.UrbanFireProtection.pojo.EmailDetails;
import io.github.hungslab.UrbanFireProtection.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hungs
 * @date 2024/1/22
 * @Description  邮箱相关 API 管理器
 */

@RestController
@Slf4j
@CrossOrigin(origins = "*",maxAge = 3600)
public class EmailController {

    @Autowired
    private EmailService emailService;

    // 发送邮件
    @PostMapping("/api/sendMail")
    public String sendMail(@RequestBody EmailDetails details)
    {
        String status = emailService.sendSimpleMail(details);
        return status;
    }
}
