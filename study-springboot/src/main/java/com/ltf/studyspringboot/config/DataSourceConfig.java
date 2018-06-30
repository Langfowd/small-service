package com.ltf.studyspringboot.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource masterDatasource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        DataSource dataSource = dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver").url("jdbc:mysql://47.104.75.209:3306/newlife")
                .username("root").password("rootroot").build();
        return dataSource;
    }
}
