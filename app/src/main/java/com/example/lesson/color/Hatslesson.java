package com.example.lesson.color;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.miwok.LessonForm;
import com.example.android.miwok.MyAdapter;
import com.example.android.miwok.R;
import com.example.lesson.taskslesson;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;

public class Hatslesson extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessoncolor);

        ArrayList<LessonForm> lstinfos = new ArrayList<LessonForm>();

        lstinfos.add(new LessonForm("", "Antenna", R.drawable.antenna));
        lstinfos.add(new LessonForm("", "Backwards Cap", R.drawable.backwardscap));
        lstinfos.add(new LessonForm("", "Balloon", R.drawable.ballon));
        lstinfos.add(new LessonForm("", "Banana Hat", R.drawable.bananahat));
        lstinfos.add(new LessonForm("", "Beanie", R.drawable.beanie));
        lstinfos.add(new LessonForm("", "Bear Ears", R.drawable.bearears));
        lstinfos.add(new LessonForm("", "Bird Nest", R.drawable.birdnest));
        lstinfos.add(new LessonForm("", "Black Bandanna", R.drawable.blackbandanna));
        lstinfos.add(new LessonForm("", "Black Fedora", R.drawable.blackfedora));
        lstinfos.add(new LessonForm("", "Caution Sign Hat", R.drawable.cautionhignhat));
        lstinfos.add(new LessonForm("", "CCC Cap", R.drawable.ccccap));
        lstinfos.add(new LessonForm("", "Cheese Hat", R.drawable.cheesehat));
        lstinfos.add(new LessonForm("", "Chef Hat", R.drawable.chefhat));
        lstinfos.add(new LessonForm("", "Cherry Hat", R.drawable.cherryhat));
        lstinfos.add(new LessonForm("", "Do-rag", R.drawable.dorag));
        lstinfos.add(new LessonForm("", "Dum Sticky Note", R.drawable.dumstickynote));
        lstinfos.add(new LessonForm("", "Egg Hat", R.drawable.egghat));
        lstinfos.add(new LessonForm("", "Fez", R.drawable.fez));
        lstinfos.add(new LessonForm("", "Flamingo Hat", R.drawable.flamingohat));
        lstinfos.add(new LessonForm("", "Flat Cap", R.drawable.flatcap));
        lstinfos.add(new LessonForm("", "Flower Hat", R.drawable.flowerhat));
        lstinfos.add(new LessonForm("", "General Hat", R.drawable.generalhat));
        lstinfos.add(new LessonForm("", "Green Fedora", R.drawable.greenfedora));
        lstinfos.add(new LessonForm("", "Hunter Hat", R.drawable.hunterhat));
        lstinfos.add(new LessonForm("", "Knight Helmet", R.drawable.knighthelmet));
        lstinfos.add(new LessonForm("", "Medical Mask", R.drawable.medicalmask));
        lstinfos.add(new LessonForm("", "Military Helmet", R.drawable.militaryhelmet));
        lstinfos.add(new LessonForm("", "Ninja Mask", R.drawable.ninjamask));
        lstinfos.add(new LessonForm("", "Plant Hat", R.drawable.planthat));
        lstinfos.add(new LessonForm("", "Plunger", R.drawable.plunger));
        lstinfos.add(new LessonForm("", "Pompadour", R.drawable.pompadour));
        lstinfos.add(new LessonForm("", "Safari Hat", R.drawable.safarihat));
        lstinfos.add(new LessonForm("", "Ski Goggles", R.drawable.skigoggles));
        lstinfos.add(new LessonForm("", "Snow Crewmate", R.drawable.snowrewmate));
        lstinfos.add(new LessonForm("", "Straw Hat", R.drawable.strawhat));
        lstinfos.add(new LessonForm("", "Toilet Paper Hat", R.drawable.toiletpaperhat));
        lstinfos.add(new LessonForm("", "Yellow Party Hat", R.drawable.yellowpartyhat));
        lstinfos.add(new LessonForm("", "Ram Horns", R.drawable.ramhorns));
        lstinfos.add(new LessonForm("", "Sheriff Hat", R.drawable.sheriffhat));





        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstinfos, Hatslesson.this);
        pager.setAdapter(adapter);
    }
}
