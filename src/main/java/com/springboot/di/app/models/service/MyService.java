package com.springboot.di.app.models.service;

public class MyService implements IService{
    @Override
    public String operation(){
        return "Executing simple process...";
    }
}
