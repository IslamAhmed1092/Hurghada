package com.example.hurghada;

public class Hotel {
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String hotelTitle;
    private int price;
    private float rating;
    private int noOfStars;

    public Hotel(int imageResourceId, String hotelTitle, int price, float rating, int noOfStars) {
        this.imageResourceId = imageResourceId;
        this.hotelTitle = hotelTitle;
        this.price = price;
        this.rating = rating;
        this.noOfStars = noOfStars;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getHotelTitle() {
        return hotelTitle;
    }

    public void setHotelTitle(String hotelTitle) {
        this.hotelTitle = hotelTitle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getNoOfStars() {
        return noOfStars;
    }

    public void setNoOfStars(int noOfStars) {
        this.noOfStars = noOfStars;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

}
