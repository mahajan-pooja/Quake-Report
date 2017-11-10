package com.example.android.quakereport;

/**
 * Created by Akshay on 7/14/17.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    //private String mDate;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMiliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMiliseconds;
        mUrl = url;
    }

    public double getmMagnitude(){

        return mMagnitude;
    }

    public String getmLocation(){

        return mLocation;
    }
    public long getTimeInMiliSeconds(){

        return mTimeInMilliseconds;
    }

    public String getUrl(){
        return mUrl;
    }
}
