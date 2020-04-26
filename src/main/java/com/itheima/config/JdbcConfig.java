package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author yn
 * @version 1.0
 * @date 2020/4/22 22:10
 */

//@Configuration
public class JdbcConfig {

/*
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {

        return new DruidDataSource();
    }*/
}