package org.premshah.cartservice.Services;

import org.premshah.cartservice.Models.Cart;
import org.premshah.cartservice.Models.Product;

import java.time.LocalDate;
import java.util.List;

public interface CartService {
    public Cart getSingleCart(int id);
    public List<Cart> getAllCarts();
    public List<Cart> getInDateRange(LocalDate start, LocalDate end);
    public List<Cart> getUserCart(int userId);
    public Cart createCart(Cart cart);

    public Cart updateCart(int id, Cart cart);
    public Cart deleteCart(int id);

}
