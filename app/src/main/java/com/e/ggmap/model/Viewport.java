package com.e.ggmap.model;

import com.e.ggmap.model.Northeast;
import com.e.ggmap.model.Southwest;
import com.google.gson.annotations.SerializedName;

public class Viewport {

    @SerializedName("northeast")
    private Northeast northeast;
    @SerializedName("southwest")
    private Southwest southwest;

    public void setNortheast(Northeast northeast) {
        this.northeast = northeast;
    }

    public Northeast getNortheast() {
        return this.northeast;
    }

    public void setSouthwest(Southwest southwest) {
        this.southwest = southwest;
    }

    public Southwest getSouthwest() {
        return this.southwest;
    }


}