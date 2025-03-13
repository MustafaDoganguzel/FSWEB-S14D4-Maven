package org.example.model;

public class Chocolate extends ProductForSale{

    private String brand;
    public Chocolate(String type, double price, String description){
        super(type, price, description);
        brand = "Coca-cola";
    }

    @Override
    public void showDetails() {
        System.out.println("Chocalate brand is " + brand);
    }
}
