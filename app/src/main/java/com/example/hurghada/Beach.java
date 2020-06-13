package com.example.hurghada;

public class Beach {
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String beachName;
    private String description;

    public Beach(int imageResourceId, String beachName, String description) {
        this.imageResourceId = imageResourceId;
        this.beachName = beachName;
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getBeachName() {
        return beachName;
    }

    public void setBeachName(String beachName) {
        this.beachName = beachName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

}
