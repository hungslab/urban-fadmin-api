package io.github.hungslab.UrbanFireProtection.service;

import io.github.hungslab.UrbanFireProtection.pojo.EmailDetails;

/**
 * @author admin
 * @date 2024/1/22
 * @Description 邮箱服务类，具体邮箱发送的接口定义
 */

// Interface
public interface EmailService {

    // Method
    // To send a simple email
    String sendSimpleMail(EmailDetails details);

    // Method
    // To send an email with attachment
    // String sendMailWithAttachment(EmailDetails details);
}

