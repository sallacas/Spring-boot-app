package com.springboot.di.app;

import com.springboot.di.app.models.domain.Item;
import com.springboot.di.app.models.domain.ItemTicket;
import com.springboot.di.app.models.service.HardService;
import com.springboot.di.app.models.service.IService;
import com.springboot.di.app.models.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

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
    @Bean("itemsTicket")
    public List<ItemTicket> insertItems(){
        Item item = new Item("Water",1000);
        Item item2 = new Item("Monster",1000);

        ItemTicket line1 = new ItemTicket(item,2);
        ItemTicket line2 = new ItemTicket(item2,4);
        return Arrays.asList(line1,line2);
    }
}
