package io.github.hungslab.UrbanFireProtection.service.impl;

import io.github.hungslab.UrbanFireProtection.core.common.utils.EmailVerCodeGenerateUtil;
import io.github.hungslab.UrbanFireProtection.pojo.EmailDetails;
import io.github.hungslab.UrbanFireProtection.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author admin
 * @date 2024/1/22
 * @Description 邮箱服务类接口的实现
 */

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}") private String sender;
    public String sendSimpleMail(EmailDetails details)
    {
        // Try block to check for exceptions
        try {
            // 创建一个简单的mail message对象
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            // 设置必要信息
            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getRecipient());
            mailMessage.setSubject("您本次的验证码是");
            String verCode = EmailVerCodeGenerateUtil.generateVerCode();
            mailMessage.setText("尊敬的xxx,您好:\n"
                    + "\n本次请求的邮件验证码为:" + verCode + ",本验证码 5 分钟内效，请及时输入。（请勿泄露此验证码）\n"
                    + "\n如非本人操作，请忽略该邮件。\n(这是一封通过自动发送的邮件，请不要直接回复）");
            // 发送邮件
            javaMailSender.send(mailMessage);
            return "Mail Sent Successfully...";
        }

        // Catch block to handle the exceptions
        catch (Exception e) {
            return "Error while Sending Mail";
        }
    }
}