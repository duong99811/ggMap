package com.e.ggmap.model;

import com.e.ggmap.model.Geometry;
import com.e.ggmap.model.OpeningHours;
import com.e.ggmap.model.Photos;
import com.e.ggmap.model.PlusCode;

public class Results {

    private String businessStatus;
    private Geometry geometry;
    private String icon;
    private String name;
    private OpeningHours openingHours;
    private Photos[] photos;
    private String placeId;
    private PlusCode plusCode;
    private double rating;
    private String reference;
    private String scope;
    private String[] types;
    private int userRatingsTotal;
    private String vicinity;

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOpeningHours(OpeningHours openingHours) {
        this.openingHours = openingHours;
    }

    public OpeningHours getOpeningHours() {
        return this.openingHours;
    }

    public void setPhotos(Photos[] photos) {
        this.photos = photos;
    }

    public Photos[] getPhotos() {
        return this.photos;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getPlaceId() {
        return this.placeId;
    }

    public void setPlusCode(PlusCode plusCode) {
        this.plusCode = plusCode;
    }

    public PlusCode getPlusCode() {
        return this.plusCode;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return this.rating;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return this.reference;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getScope() {
        return this.scope;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public String[] getTypes() {
        return this.types;
    }

    public void setUserRatingsTotal(int userRatingsTotal) {
        this.userRatingsTotal = userRatingsTotal;
    }

    public int getUserRatingsTotal() {
        return this.userRatingsTotal;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public String getVicinity() {
        return this.vicinity;
    }


}