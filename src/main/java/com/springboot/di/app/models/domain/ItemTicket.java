package com.springboot.di.app.models.domain;

public class ItemTicket {
    private Item item;
    private Integer amount;

    public ItemTicket(Item item, Integer amount) {
        this.item = item;
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer importCalculate(){
        return amount * item.getPrice();
    }
}
