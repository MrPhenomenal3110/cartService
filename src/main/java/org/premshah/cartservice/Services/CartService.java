package org.premshah.cartservice.Services;

import org.premshah.cartservice.Models.Cart;
import org.premshah.cartservice.Models.Product;

import java.util.Date;
import java.util.List;

public interface CartService {
    public Cart getSingleCart(int id);
    public List<Cart> getAllCarts();
    public List<Cart> getInDateRange(Date start, Date end);
    public List<Cart> getUserCart(int userId);
    public Cart createCart(int userId, Date date, List<Product> products);

    public Cart updateCart(int id, int userId, Date date, List<Product> products);
    public Cart deleteCart(int id);

}
