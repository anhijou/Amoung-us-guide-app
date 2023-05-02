package com.example.lesson.color;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.miwok.LessonForm;
import com.example.android.miwok.MyAdapter;
import com.example.android.miwok.R;
import com.example.lesson.taskslesson;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;

public class Colorslesson extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessoncolor);

        ArrayList<LessonForm> lstinfos = new ArrayList<LessonForm>();

        lstinfos.add(new LessonForm("red", "Red is one of the colors in Among Us that players can select and customize. It is considered the main mascot of the game, appearing on several promotional photos and app icons.", R.drawable.redcrew));
        lstinfos.add(new LessonForm("blue", "Blue, also known as Dark Blue by some players, is one of the colors in Among Us that players can select and customize.", R.drawable.bluecrew));
        lstinfos.add(new LessonForm("brown", "Brown is one of the colors in Among Us that players can select and customize.", R.drawable.browncrew));
        lstinfos.add(new LessonForm("cyan ", "Cyan, wrongfully known as Light Blue by many, is one of the main colors in Among Us.", R.drawable.cyancrew ));
        lstinfos.add(new LessonForm("green", "Green, also known as Dark Green by many, is one of the colors in Among Us that players can select and customize. Green seems to be a close acquaintance with Orange and Cyan.", R.drawable.greencrew));
        lstinfos.add(new LessonForm("lime", "Lime, wrongfully known as Light Green by many players, is one of the colors in Among Us that players can select and customize.", R.drawable.limecrew));
        lstinfos.add(new LessonForm("orange", "Orange is one of the colors in Among Us that players can select and customize. They appear to be a close acquaintance with Green and Cyan.", R.drawable.orangecrew));
        lstinfos.add(new LessonForm("yellow", "Yellow is one of the colors in Among Us that players can select and customize.", R.drawable.yellowcrew));
        lstinfos.add(new LessonForm("pink", "Pink is one of the colors in Among Us that players can select and customize.", R.drawable.pinkcrew));
        lstinfos.add(new LessonForm("purple", "Purple is one of the colors in Among Us that players can select and customize.", R.drawable.purplecrew));
        lstinfos.add(new LessonForm("black", "Black is one of the colors in Among Us that players can select and customize. According to statistics, Black is the most likely color to be used by a new Among Us player.[citation needed]", R.drawable.blackcrew));
        lstinfos.add(new LessonForm("white", "White is one of the colors in Among Us that players can select and customize.", R.drawable.whitecrew));











        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstinfos, Colorslesson.this);
        pager.setAdapter(adapter);
    }
}
