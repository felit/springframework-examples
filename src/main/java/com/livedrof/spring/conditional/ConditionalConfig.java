package com.livedrof.spring.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfig {
    @Bean
    @Conditional(MagicExistsConditional.class) //条件化的创建bean
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
