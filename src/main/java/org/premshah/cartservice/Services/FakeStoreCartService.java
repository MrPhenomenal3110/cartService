package org.premshah.cartservice.Services;

import org.premshah.cartservice.Models.Cart;
import org.premshah.cartservice.Models.Product;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
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
        ParameterizedTypeReference<List<Cart>> responseType = new ParameterizedTypeReference<>(){};

        String url = "https://fakestoreapi.com/carts";

        ResponseEntity<List<Cart>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                responseType
        );

        List<Cart> carts = responseEntity.getBody();
        if(carts == null){
            return new ArrayList<>();
        }
        return carts;
    }

    @Override
    public List<Cart> getInDateRange(LocalDate start, LocalDate end) {
        String startDate = start.toString();
        String endDate = end.toString();

        String url = "https://fakestoreapi.com/carts?startdate=" + startDate + "&enddate=" + endDate;

        ParameterizedTypeReference<List<Cart>> responseType = new ParameterizedTypeReference<>(){};

        ResponseEntity<List<Cart>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                responseType
        );

        List<Cart> carts = responseEntity.getBody();

        if(carts == null){
            return new ArrayList<>();
        }
        return carts;
    }

    @Override
    public List<Cart> getUserCart(int userId) {
        return null;
    }

    @Override
    public Cart createCart(int userId, LocalDate date, List<Product> products) {
        return null;
    }

    @Override
    public Cart updateCart(int id, int userId, LocalDate date, List<Product> products) {
        return null;
    }

    @Override
    public Cart deleteCart(int id) {
        return null;
    }
}
