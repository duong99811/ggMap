package com.e.ggmap.model;

import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Photos {

    @SerializedName("height")
    private int height;
    @SerializedName("html_attributions")
    private String[] htmlAttributions;
    @SerializedName("photo_reference")
    private String photoReference;
    @SerializedName("width")
    private int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHtmlAttributions(String[] htmlAttributions) {
        this.htmlAttributions = htmlAttributions;
    }

    public String[] getHtmlAttributions() {
        return this.htmlAttributions;
    }

    public void setPhotoReference(String photoReference) {
        this.photoReference = photoReference;
    }

    public String getPhotoReference() {
        return this.photoReference;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }


}