package org.example.model;

public class Bread extends ProductForSale{
private int weight;
    public Bread(String type, double price, String description){

        super(type, price, description);
        weight = 200;
    }
    @Override
    public void showDetails(){
        System.out.println("Bread weight is " + weight);
    }
}
