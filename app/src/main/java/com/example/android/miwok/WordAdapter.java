package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tommy on 7/6/2016.
 */
public class WordAdapter extends ArrayAdapter<Word>
{

    public WordAdapter(Activity context, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    /* These are all passed by ListView. Position is the position number of the View, convertView
    is the recycled View (can be empty), parent is the ViewGroup which is the ListView */
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        //Recycled View
        View listItemView = convertView;

        //Inflate a view from the list_item
        if (listItemView == null)
        {
            //false means do not attach the list_item view to the parent view
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        //Find Miwok TextView in list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //Find default TextView in list_item.xml layout with the ID version_name
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        //Find ImageView in list_item.xml layout with resource ID and set it to the image displayed
        ImageView wordImageView = (ImageView) listItemView.findViewById(R.id.image_icon);
        wordImageView.setImageResource(currentWord.getImageResourceId());

        //Return the whole list item layout containing the views so it can be shown in ListView
        return listItemView;
    }
}
