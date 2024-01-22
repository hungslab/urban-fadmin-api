package io.github.hungslab.UrbanFireProtection.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Hungs
 * @date 2024/1/22
 * @Description 用户信息类
 */
@TableName(value = "user")
@Data
public class User {
    /**
     *
     *
     **/
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     *
     *
     **/
    private String username;
    private String password;

    @TableField(exist = false)
    private String email;
    private String phone;
}
