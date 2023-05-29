package com.springboot.di.app.models.service;

public class HardService implements IService{
    @Override
    public String operation() {
        return "Executing hard process...";
    }
}
