package com.springboot.di.app.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Ticket {
    @Value("${ticket.description}")
    private String description;
    @Autowired
    private Client client;
    @Autowired
    private List<ItemTicket> items;

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
