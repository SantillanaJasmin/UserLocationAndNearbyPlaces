package com.example.jasmin.userlocation;

import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;

/**
 * Created by Jasmin on 4/21/2017.
 */
public class Constants {

    public static final int MY_PERMISSIONS_REQUEST_LOCATION = 99;
    public static final ArrayList<Marker> markers = new ArrayList<>();

    //lat and long of current location
    public static double latitude;
    public static double longitude;

    public static int currentRadius;
}
