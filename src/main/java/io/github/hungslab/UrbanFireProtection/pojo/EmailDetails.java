package io.github.hungslab.UrbanFireProtection.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Hungs
 * @date 2024/1/22
 * @Description 邮箱内容描述类，其中包含 收件人、msgBody、主题和附件等字段
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmailDetails {
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;


}
