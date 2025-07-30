package com.sse.ssedemo.config;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author niuheng
 * @date 2023年11月27日 17:37
 */
@EnableConfigurationProperties(MybatisPlusProperties.class)
@MapperScan(basePackages = {"com.sse.ssedemo.mapper"})
public class MybatisConfig {
}
