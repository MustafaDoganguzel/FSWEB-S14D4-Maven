package org.example.model;

public class Coke extends ProductForSale{
    private String volume;
    public Coke(String type, double price, String description) {
        super(type, price, description);
        volume = "100 ml";
    }

    @Override
    public void showDetails() {
        System.out.println("Coke volume is " + volume );
    }
}
