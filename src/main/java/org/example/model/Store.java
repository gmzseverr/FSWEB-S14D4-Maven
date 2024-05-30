package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[]{
                new Bread("Bread","Fresh and hot bread", 15, 150,"Wholewheat"),
                new Coke("Coke", "Drink Cold!", 13, 1, "Zero"),
                new Chocolate("Chocolate", "Tasty Chocolate",7,true)
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

    }
}