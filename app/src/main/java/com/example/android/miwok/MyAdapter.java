package com.example.android.miwok;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by reale on 4/20/2017.
 */

public class MyAdapter extends PagerAdapter {

    ArrayList<LessonForm> lstinfo;
    Context context;
    LayoutInflater layoutInflater;

    public MyAdapter(ArrayList<LessonForm> lstinfo, Context context) {
        this.lstinfo = lstinfo;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return lstinfo.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }



    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.card_item,container,false);



        TextView miwokTextView = (TextView) view.findViewById(R.id.miwok_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        miwokTextView.setText(lstinfo.get(position).getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) view.findViewById(R.id.default_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        defaultTextView.setText(lstinfo.get(position).getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);

        imageView.setImageResource(lstinfo.get(position).getImageResourceId());




        container.addView(view);
        return view;
    }


}
