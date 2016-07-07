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

    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /*Get default translation of the word*/
    public String getmDefaultTranslation()
    {
        return mMiwokTranslation;
    }

    /*Get Miwok translation of the word*/
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

}
