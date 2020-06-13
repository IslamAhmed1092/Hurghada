package com.example.hurghada;

public class Activity {
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String activity;

    public Activity(int imageResourceId, String activity) {
        this.imageResourceId = imageResourceId;
        this.activity = activity;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
