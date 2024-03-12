# Cart Services

#### (using [FakeStoreAPI](https://fakestoreapi.com/) and [Spring Boot](https://spring.io/projects/spring-boot))


---

## Table of Contents

- [Introduction](#introduction)
- [Technologies](#technologies)
- [Setup](#setup)
- [Usage](#usage)
- [Endpoints](#endpoints)

---

## Introduction

This is a simple cart service ( or a fake API endpoint ) that uses the [FakeStoreAPI](https://fakestoreapi.com/) to get carts, update the carts and delete the carts. The service is built using [Spring Boot](https://spring.io/projects/spring-boot).

---

## Technologies

- Java
- Spring Boot
- Maven

---

## Setup

To run this project, you will need to have Java installed on your machine. You can download it [here](https://www.java.com/en/download/).

You will also need to have IntelliJ Idea Ultimate installed on your device.

To run this project locally, clone this repository, open it in IntelliJ Idea Ultimate, and run the `CartServicesApplication` class ( [path](/src/main/java/org/premshah/cartservice/CartServiceApplication.java) ).

Now you can run the project using the run icon and navigate to the [localhost:8080](http://localhost:8080) (The default port is `8080`) to see the project running.

---

## Usage

This project is a simple cart service that uses the [FakeStoreAPI](https://fakestoreapi.com/) to get carts, update the carts and delete the carts. The creation, updation and deletion of the carts does not actually take place, but we get a response from the [FakeStoreAPI](https://fakestoreapi.com/) as if it did.
For more information on the updation and deletion of the carts, please refer to the [FakeStoreAPI documentation](https://fakestoreapi.com/docs).

---

## Endpoints

The following are the endpoints that are available in this project:

- `GET /carts` - This endpoint returns all the carts from the [FakeStoreAPI](https://fakestoreapi.com/).

    - ![Postman response](/assets/getAllCarts.png)


- `GET /carts/{id}` - This endpoint returns a specific cart based on the cartID.

    - ![Postman response](/assets/getSingleCart.png)

- `GET /carts/user/{userId}` - This endpoint returns all the carts associated with a particular user, based on the userID.

    - ![Postman response](/assets/getUserCart.png)

- `GET/carts?startdate={startDate}&enddate={endDate}` - This endpoint returns all the carts that were created between the start date and the end date.

    - ![Postman response](/assets/getInDateRange.png)

- `POST /carts` - This endpoint allows you to create a new cart, and returns the newly created cart.

    - ![Postman response](/assets/createCart.png)

- `PUT /carts/{id}` - This endpoint allows you to update a specific cart based on the cartID, and returns the updated cart.

    - ![Postman response](/assets/updateCart.png)


- `DELETE /carts/{id}` - This endpoint deletes a specific cart based on the cartID, and returns the cart that was deleted.

    - ![Postman response](/assets/deleteCart.png)

---
