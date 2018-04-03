package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Place {

    /**
     * Address text for the place
     */
    private int mAddressText;

    /**
     * Title text for the place
     */
    private int mTitleText;

    /**
     * Image resource ID for the place
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this place
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     *
     * @param addressText is the address text
     * @param titleText   is the tittle text
     */
    public Place(int addressText, int titleText) {
        mAddressText = addressText;
        mTitleText = titleText;
    }

    /**
     * Create a new Place object.
     *
     * @param addressText     is the address text
     * @param titleText       is the tittle text
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     */
    public Place(int addressText, int titleText, int imageResourceId) {
        mAddressText = addressText;
        mTitleText = titleText;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the place.
     */
    public int getAddressText() {
        return mAddressText;
    }

    /**
     * Get the title text.
     */
    public int getTitleText() {
        return mTitleText;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}