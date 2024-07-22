package com.andreytereshchenko.store.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public void add(List<Long> items) {
        basket.add(items);
    }

    public List<Long> getall() {
        return basket.getall();
    }

}
