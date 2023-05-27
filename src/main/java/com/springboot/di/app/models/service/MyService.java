package com.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("service")
public class MyService implements IService{
    @Override
    public String operation(){
        return "executing important process...";
    }
}
