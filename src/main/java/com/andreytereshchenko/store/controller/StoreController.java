package com.andreytereshchenko.store.controller;

import com.andreytereshchenko.store.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("item") List<Long> item) {
        storeService.add(item);
    }

    @GetMapping("/get")
    public List<Long> get() {
        return storeService.getall();
    }

}
