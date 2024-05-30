package org.example.model;

public class Bread extends ProductForSale{
    private int gram;
    private String ingredient;


    public Bread(String type, String description, double price) {
        super(type, description, price);
    }



    public Bread(String type, String description, double price, int gram,String ingredient) {
        super(type, description, price);
        this.gram = gram;
        this.ingredient=ingredient;
    }

    public int getGram() {
        return gram;
    }

    public String getIngredient() {
        return ingredient;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: "+getType());
        System.out.println("Description: "+ getDescription());
        System.out.println("Price: " + getPrice() + "TL");
        System.out.println("Gram: " + getGram() +"gr");
        System.out.println("Ingredient: " + getIngredient());

    }


}
