package com.example.recyclerviewbynirala.Models;

public class RecipeModel {
    int picture;
    String text;

    public RecipeModel(int picture, String text) {
        this.picture = picture;
        this.text = text;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
