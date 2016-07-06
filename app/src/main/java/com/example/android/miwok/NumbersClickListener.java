package com.example.android.miwok;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

/**
 * This is the onClick listener for NumbersActivity
 */
public class NumbersClickListener implements View.OnClickListener
{
    @Override
    public void onClick(View v)
    {
        Intent i = new Intent(v.getContext(), NumbersActivity.class);
        v.getContext().startActivity(i);
    }
}
