package com.turkcell.order_service.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RequestMapping("/api/v1/orders")
@RestController
public class OrderController {

    @GetMapping()
    public String Hello() {
        return "Hello";
    }
    
    @PostMapping
    public String createOrder() {
        return "Order service disabled";
    }
}
