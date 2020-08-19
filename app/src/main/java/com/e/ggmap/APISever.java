package com.e.ggmap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APISever {
        @GET("/maps/api/place/nearbysearch/json?location=21.027763,105.834160&radius=500&types=food&key=AIzaSyCmxFS2arHibTbROQAfTkZAJRkEpz8LErU")
        Call<RootClass>getLocation(@Query("name")String name);
}