package com.e.ggmap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.e.ggmap.R;
import com.e.ggmap.model.Geometry;
import com.e.ggmap.model.Results;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        APISever apiSever = RetrofitData.getInstance().create(APISever.class);
        apiSever.getLocation(String.valueOf(name)).enqueue(new Callback<RootClass>() {
            @Override
            public void onResponse(Call<RootClass> call, Response<RootClass> response) {
                RootClass rootClass = response.body();
                Results[] list = rootClass.getResults();
                for (int i = 0; i < list.length; i++) {
                    Geometry geometry = list[i].getGeometry();

                    Log.e("A", "Resuilt"+list[i]);
                }
            }
            @Override
            public void onFailure(Call<RootClass> call, Throwable t) {

            }
        });

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng sydney = new LatLng(21.0382644, 105.7473491);
        mMap.addMarker(new MarkerOptions().position(sydney).title("My Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}