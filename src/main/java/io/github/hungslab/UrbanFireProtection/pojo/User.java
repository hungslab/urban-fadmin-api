package io.github.hungslab.UrbanFireProtection.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Hungs
 * @date 2024/1/22
 * @Description 用户信息类
 */
@TableName(value = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 登录名
     */
    private String username;

    /**
     * 登录密码-md5 + salt加密
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 邮箱确认码
     * */
    private String confirmCode;

    /**
     * 激活码有效时间
     * */
    private LocalDateTime activationTime;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 加密盐值
     */
    private String salt;


    /**
     * 用户头像
     */
    private String userPhoto;

    /**
     * 用户性别;0-男 1-女
     */
    private Integer userSex;

    /**
     * 用户状态;0-正常
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
