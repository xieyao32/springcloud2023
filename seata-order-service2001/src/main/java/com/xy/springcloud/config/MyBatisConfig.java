package com.xy.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.xy.springcloud.dao"})
public class MyBatisConfig {
}
