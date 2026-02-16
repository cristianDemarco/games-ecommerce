package com.example.service;

import com.example.model.Cart;
import com.example.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Cart saveCart(Cart cart){
        return cartRepository.save(cart);
    }

    public Cart getCartById(Long id){
        return cartRepository.findById(id).orElse(null);
    }
}
