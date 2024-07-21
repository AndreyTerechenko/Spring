package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.StoreService;

import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService bsaketService;

    public StoreController(StoreService bsaketService) {
        this.bsaketService = bsaketService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("item") List<Long> item) {
        bsaketService.add(item);
    }

    @GetMapping("/get")
    public Set<Long> get() {
        return bsaketService.getall();
    }

}
