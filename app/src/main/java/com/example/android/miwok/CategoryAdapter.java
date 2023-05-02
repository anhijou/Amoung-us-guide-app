package com.example.android.miwok;

/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link CategoryAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Category} objects.
 */
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {

    /**
     * Resource ID for the background color for this list of words
     */
    Class Activity;
    private Context mContext;
    private List<Category> words;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param mContext is the current context (i.e. Activity) that the adapter is being created in.
     * @param words    is the list of {@link Category}s to be displayed.
     */
    public CategoryAdapter(Context mContext, List<Category> words) {
        this.mContext = mContext;
        this.words = words;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.clist_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        //holder.Category_title.setText(words.get(position).getcategorytitle());

        if (words.get(position).hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            holder.Category_thumbnail.setImageResource(words.get(position).getcategoryImageResourceId());            // Make sure the view is visible
            holder.Category_thumbnail.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            holder.Category_thumbnail.setVisibility(View.GONE);
        }



        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity = words.get(position).getcategoryclass();
                Intent intent = new Intent(mContext, Activity);


                // start the activity
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return words.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        //TextView Category_title;
        ImageView Category_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            //Category_title = (TextView) itemView.findViewById(R.id.cmiwok_text_view);
            Category_thumbnail = (ImageView) itemView.findViewById(R.id.cimage);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);


        }
    }
}