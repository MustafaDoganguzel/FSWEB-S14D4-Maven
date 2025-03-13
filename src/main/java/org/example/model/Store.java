package org.example.model;

public class Store {
    public static void main(String[] args) {

        Chocolate a = new Chocolate("dark", 10, "bitter");
        Coke c = new Coke("cCola", 20, "Coca-Cola");
        Bread b = new Bread("white", 3 , "default bread");

        ProductForSale[] products = {a,c,b};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product: products) {
            product.showDetails();
        }
    }
}