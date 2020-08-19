package com.e.ggmap.model;

import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PlusCode {

    @SerializedName("compound_code")
    private String compoundCode;
    @SerializedName("global_code")
    private String globalCode;

    public void setCompoundCode(String compoundCode) {
        this.compoundCode = compoundCode;
    }

    public String getCompoundCode() {
        return this.compoundCode;
    }

    public void setGlobalCode(String globalCode) {
        this.globalCode = globalCode;
    }

    public String getGlobalCode() {
        return this.globalCode;
    }


}