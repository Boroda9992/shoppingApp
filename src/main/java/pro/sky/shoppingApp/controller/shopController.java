package pro.sky.shoppingApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingApp.service.shopService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class shopController {


    private final shopService shopService;

    public shopController(pro.sky.shoppingApp.service.shopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("add")
    public Set<Integer> add (@RequestParam List<Integer> goods){
        return shopService.add(goods);
    }

    @GetMapping("get")
    public Set<Integer> get() {
        return shopService.get();
    }
}
