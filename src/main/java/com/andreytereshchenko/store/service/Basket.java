package com.andreytereshchenko.store.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Long> items = new ArrayList<>();

    public void add(List<Long> items) {
        this.items.addAll(items);
    }

    public List<Long> getall() {
        return getall();
    }

}
