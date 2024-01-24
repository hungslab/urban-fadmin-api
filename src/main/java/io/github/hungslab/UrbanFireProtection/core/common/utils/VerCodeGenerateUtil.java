package io.github.hungslab.UrbanFireProtection.core.common.utils;

import cn.hutool.core.util.IdUtil;
import lombok.experimental.UtilityClass;

/**
 * @author Hungs
 * @date 2024/1/22
 * @Description 邮箱随机验证码生成
 */
@UtilityClass
public class VerCodeGenerateUtil {

    public String generateEmailConfirmCode() {
        // 雪花算法生成确认码
        String confirmCode = IdUtil.getSnowflake(1, 1).nextIdStr();
        return confirmCode;
    }
}
