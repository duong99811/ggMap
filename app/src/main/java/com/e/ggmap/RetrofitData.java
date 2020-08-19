package com.e.ggmap;

import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitData {
    private static retrofit2.Retrofit instance = null;

    public static retrofit2.Retrofit getInstance() {
        if (instance == null) {
            instance = new retrofit2.Retrofit.Builder()
                    .baseUrl("https://maps.googleapis.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return instance;
        }
        return instance;
    }
}