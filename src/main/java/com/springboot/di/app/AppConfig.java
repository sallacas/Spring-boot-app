package com.springboot.di.app;

import com.springboot.di.app.models.service.HardService;
import com.springboot.di.app.models.service.IService;
import com.springboot.di.app.models.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Primary
    @Bean("HardService")
    public IService hardService(){
        return new HardService();
    }
    @Bean("SimpleService")
    public IService simpleService(){
        return new MyService();
    }
}
