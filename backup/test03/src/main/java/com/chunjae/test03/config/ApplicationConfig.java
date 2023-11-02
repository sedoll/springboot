package com.chunjae.test03.config;

import com.chunjae.test03.persistence.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    public UserMapper userMapper;
}
