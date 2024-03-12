package org.premshah.cartservice.Controllers;

import org.premshah.cartservice.Models.Cart;
import org.premshah.cartservice.Services.FakeStoreCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    private FakeStoreCartService cartService;

    public CartController(FakeStoreCartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/carts/{id}")
    public Cart getSingleCart(@PathVariable("id") int id) {
        return cartService.getSingleCart(id);
    }

    @GetMapping("/carts")
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }

}
