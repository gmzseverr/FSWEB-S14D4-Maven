package org.example.model;

public class Chocolate extends ProductForSale{
    private boolean isDarkChocolate;
    public Chocolate(String type, String description, double price) {
        super(type, description, price);
    }

    public Chocolate(String type, String description, double price, boolean isDarkChocolate) {
        super(type, description, price);
        this.isDarkChocolate = isDarkChocolate;
    }

    public boolean isDarkChocolate() {
        return isDarkChocolate;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: "+getType());
        System.out.println(getDescription());
        System.out.println("Price is " + getPrice() + "TL");
        System.out.println("Is dark chocolate: " + (isDarkChocolate ? "Yes" : "No"));

    }

}
