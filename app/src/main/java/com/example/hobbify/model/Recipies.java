package com.example.hobbify.model;

public class Recipies {

    private String RecipieName;
    private String RecipieIngredients;
    private String RecipieMethodTitle;
    private String Recipie;
    private int Thumbnail;

    public Recipies(String name, String recipieIngredients, String recipieMethodTitle, String recipie, int thumbnail) {
        RecipieName = name;
        RecipieIngredients = recipieIngredients;
        Recipie = recipie;
        RecipieMethodTitle = recipieMethodTitle;
        Thumbnail = thumbnail;

    }

    public String getRecipieName() {
        return RecipieName;
    }

    public String getRecipieIngredients() {
        return RecipieIngredients;
    }

    public String getRecipieMethodTitle() {
        return RecipieMethodTitle;
    }

    public String getRecipie() {
        return Recipie;
    }

    public int getThumbnail() {
        return Thumbnail;
    }
}
