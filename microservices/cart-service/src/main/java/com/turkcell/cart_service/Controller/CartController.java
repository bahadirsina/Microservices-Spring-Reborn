package com.turkcell.cart_service.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/carts")
public class CartController {

    @GetMapping()
    public String Hello() {
        return "Hello";
    }
}