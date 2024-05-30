package org.example.model;

public class Coke extends ProductForSale{
    private double litre;
    private String kind;

    public Coke(String type, String description, double price) {
        super(type, description, price);
    }



    public Coke(String type, String description, double price, double litre, String kind) {
        super(type, description, price);
        this.litre = litre;
        this.kind=kind;
    }

    public double getLitre() {
        return litre;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: "+getType());
        System.out.println(getDescription());
        System.out.println("The price is " + getPrice() + " TL.");
        System.out.println("It is a" + getPrice() + " Coke.");


    }

}
