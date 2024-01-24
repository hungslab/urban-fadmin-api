package io.github.hungslab.UrbanFireProtection;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
// 指定当前项目中的Mapper接口的位置，在项目启动的时候会自动加载所有接口
@MapperScan("io.github.hungslab.UrbanFireProtection.Mapper")
@EnableCaching
@EnableScheduling
@Slf4j
public class UrbanFireProtectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrbanFireProtectionApplication.class, args);
	}

}
