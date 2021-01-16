package com.example.recyclerviewbynirala.Models;

public class RecipeModel {
    int picture;
    String text;

    public RecipeModel(int picture, String text) {
        this.picture = picture;
        this.text = text;
    }



    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getPicture() {
        return picture;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
