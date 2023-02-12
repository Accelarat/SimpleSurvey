package com.simplesurvey.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.simplesurvey")
@EnableJpaRepositories("com.simplesurvey.repository")
public class MainConfig {
}
