package com.ms1.explorebangalore;

/**
 * Created by ms1 on 25-03-2018.
 */

public class Location {

    private String mAttractionName;
    private String mAttractionDescription;
    private int mImageResource;

    public Location(String attractionName, String attractionDesc, int imageResource)
    {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDesc;
        mImageResource = imageResource;
    }

    public String getmAttractionName() {
        return mAttractionName;
    }

    public String getmAttractionDescription() {
        return mAttractionDescription;
    }

    public int getmImageResource() {
        return mImageResource;
    }
}
