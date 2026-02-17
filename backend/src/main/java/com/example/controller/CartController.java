package com.example.controller;

import com.example.model.Cart;
import com.example.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/{id}")
public class CartController {
    @Autowired
    CartService cartService;

    @GetMapping("/cart")
    public Cart getCart(@PathVariable Long id){
        return cartService.getCartByUserId(id);
    }
}
