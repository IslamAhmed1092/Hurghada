package com.example.hurghada;

public class Restaurant {
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String restaurantTitle;
    private String foodType;
    private float rating;

    public Restaurant(int imageResourceId, String restaurantTitle, String foodType, float rating) {
        this.imageResourceId = imageResourceId;
        this.restaurantTitle = restaurantTitle;
        this.foodType = foodType;
        this.rating = rating;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getRestaurantTitle() {
        return restaurantTitle;
    }

    public void setRestaurantTitle(String restaurantTitle) {
        this.restaurantTitle = restaurantTitle;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

}
