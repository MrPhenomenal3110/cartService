package org.premshah.cartservice.Services;

import org.premshah.cartservice.Models.Cart;
import org.premshah.cartservice.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@Service
public class FakeStoreCartService implements CartService {

    RestTemplate restTemplate = new RestTemplate();
    @Override
    public Cart getSingleCart(int id) {
        String url = "https://fakestoreapi.com/carts/" + id;

        Cart cart = restTemplate.getForObject(
                url,
                Cart.class
        );

        if(cart == null){
            return new Cart();
        }

        return cart;
    }

    @Override
    public List<Cart> getAllCarts() {
        return null;
    }

    @Override
    public List<Cart> getInDateRange(Date start, Date end) {
        return null;
    }

    @Override
    public List<Cart> getUserCart(int userId) {
        return null;
    }

    @Override
    public Cart createCart(int userId, Date date, List<Product> products) {
        return null;
    }

    @Override
    public Cart updateCart(int id, int userId, Date date, List<Product> products) {
        return null;
    }

    @Override
    public Cart deleteCart(int id) {
        return null;
    }
}
