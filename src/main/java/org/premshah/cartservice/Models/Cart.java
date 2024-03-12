package org.premshah.cartservice.Models;

import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Cart {
    int id;
    int userId;
    Date date;
    List<Product> products;
}
