package com.e.ggmap.model;

import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class OpeningHours {

    @SerializedName("open_now")
    private boolean openNow;

    public void setOpenNow(boolean openNow) {
        this.openNow = openNow;
    }

    public boolean getOpenNow() {
        return this.openNow;
    }


}