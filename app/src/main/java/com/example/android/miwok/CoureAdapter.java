package com.example.android.miwok;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import android.os.Bundle;


import static android.support.v4.content.ContextCompat.startActivity;

/**
 * {@link CoureAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Coure} objects.
 */
public class CoureAdapter  {

    /*private static Context context = null;
    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;
    Class Activity,b;
    String c;
    private ArrayList<Coure> words;


    /**
     * Create a new {@link CoureAdapter} object.
     *
     * @param Context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Coure}s to be displayed.

    public CoureAdapter(Context Context, ArrayList<Coure> words) {
        super(Context, 0, words);
       this.context = Context;

    }
    static class RowHolder
    {
        TextView Test;
        TextView Lesson;
    }
    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        RowHolder holder;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.courlist, parent, false);


        }

        // Get the {@link Word} object located at this position in the list
        final Coure currentCour = getItem(position);
        holder = new RowHolder();

        holder.Test = (TextView) listItemView.findViewById(R.id.TestTitle);
        holder.Lesson = (TextView) listItemView.findViewById(R.id.LessonTitle);

        holder.Test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity = currentCour.getLessonClass();
                Intent intent = new Intent(context, currentCour.getLessonClass());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(intent);


            }
        });
        holder.Lesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity = currentCour.getLessonClass();

                Intent intent = new Intent(context, currentCour.getLessonClass());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(intent);
            }
        });

        listItemView.setTag(holder);
        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView CoureTitle = (TextView) listItemView.findViewById(R.id.CoureTitle);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        CoureTitle.setText(currentCour.getCoureTitle());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView LessonTitle = (TextView) listItemView.findViewById(R.id.LessonTitle);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        LessonTitle.setText(currentCour.getLessonTitle());


        TextView TestTitle = (TextView) listItemView.findViewById(R.id.TestTitle);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        TestTitle.setText(currentCour.getTestTitle());


        //
        // TextView Test = (TextView) listItemView.findViewById(R.id.TestTitle);        // Find the ImageView in the list_item.xml layout with the ID image.

        // Set the theme color for the list item
        // Find the color that the resource ID maps to
        // Set the background color of the text container View

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }*/
}