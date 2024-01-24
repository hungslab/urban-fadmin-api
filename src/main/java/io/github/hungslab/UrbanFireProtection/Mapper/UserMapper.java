package io.github.hungslab.UrbanFireProtection.Mapper;

import io.github.hungslab.UrbanFireProtection.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Hungs
 * @date 2024/1/22
 * @Description 用户信息相关的数据库操作
 */
@Mapper
public interface UserMapper {

    /**
     * 新增用户
     * @param user
     * @return
     */
    @Insert("INSERT INTO user (username, password, email, confirm_code, activation_time, satus, salt)" +
            "VALUES (#{username}, #{password}, #{email}, #{confirm_code}, #{activation_time}, #{satus}, #{salt})")
    int insterUser(User user);

    /**
     * 根据确认码查询用户
     * @param confirmcode
     * @return
     */
    @Select("SELECT email, activation_time FROM user WHERE confirm_code = #{confirm_code}")
    User selectUserByConfirmCode(@Param("confirm_code") String confirmcode);

    /**
     * 根据确认码查询用户并修改状态值为 1 （可用）
     * @param confirmCode
     * @return
     */
    @Update("UPDATE user SET satus = 1 WHERE confirm_code = #{confirmCode}")
    int updateUserByConfirmcode(@Param("confirmCode") String confirmCode);

    /**
     * 根据邮箱查询用户
     * @param email
     * @return
     */
    @Select("SELECT email, password, salt FROM user WHERE email = #{email} AND staus = 1")
    List<User> selectUserByEmail(@Param("email") String email);


}
