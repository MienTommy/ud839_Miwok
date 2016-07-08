package com.example.android.miwok;

/**
 * Contains both Miwok translation and English translation
 */
public class Word
{
    /*Default translation for the word*/
    private String mDefaultTranslation;

    /*Miwok translation for the word*/
    private String mMiwokTranslation;

    /*Image resource ID*/
    private int mImageResourceId;

    /*
    @param defaultTranslation is the word in a language the user is speaking (English)
    @param miwokTranslation is the translated English word
     */
    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /*
    @param defaultTranslation is the word in a language the user is speaking (English)
    @param miwokTranslation is the translated English word
    @imageResourceId is the resource id for the image to be displayed along with the two translation words
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /*Get default translation of the word*/
    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    /*Get Miwok translation of the word*/
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    /*Get image resource id*/
    public int getImageResourceId() { return mImageResourceId; }
}
