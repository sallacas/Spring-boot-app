package com.springboot.di.app.models.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@Component
@RequestScope
public class Ticket {

    @Value("${ticket.description}")
    private String description;
    @Autowired
    private Client client;
    @Autowired
    private List<ItemTicket> items;
    @PostConstruct
    public void init(){
        client.setName(client.getName().concat(" ").concat("Pete"));
        description = description.concat(" of client: ").concat(client.getName());
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Ticket destroyed ".concat(description));
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<ItemTicket> getItems() {
        return items;
    }

    public void setItems(List<ItemTicket> items) {
        this.items = items;
    }
}
