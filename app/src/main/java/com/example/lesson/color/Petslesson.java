package com.example.lesson.color;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.miwok.LessonForm;
import com.example.android.miwok.MyAdapter;
import com.example.android.miwok.R;
import com.example.lesson.taskslesson;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;

public class Petslesson extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessoncolor);

        ArrayList<LessonForm> lstinfos = new ArrayList<LessonForm>();

        lstinfos.add(new LessonForm("Squig", "Slightly bobs side to side.", R.drawable.squig));
        lstinfos.add(new LessonForm("Bedcrab", "Body bobs up and down. Reference to the headcrab from the Half-Life series.", R.drawable.bedcrab));
        lstinfos.add(new LessonForm("Brainslug", "Jiggles up and down. Reference to the Brain Slug from the TV series 'Futurama'", R.drawable.brainslug));
        lstinfos.add(new LessonForm("UFO", "Hovers up and down, lights flashing.", R.drawable.ufo));
        lstinfos.add(new LessonForm("Dog", "Wags tail, mouth moves up and down", R.drawable.dog));
        lstinfos.add(new LessonForm("Hamster", "Hamster stays still inside a light blue, clear ball.", R.drawable.hamster));
        lstinfos.add(new LessonForm("Mini Crewmate", "A small version of a player, matching their color.", R.drawable.minicrewmate));
        lstinfos.add(new LessonForm("Robot", "A Wall-E like character, head tilts up and down occasionally.", R.drawable.robot));
        lstinfos.add(new LessonForm("Henry", "A mini version of Henry Stickmin, the main character from the Henry Stickmin series.", R.drawable.henry));
        lstinfos.add(new LessonForm("Ellie", "A mini version of Ellie Rose, a character from the Henry Stickmin series." , R.drawable.ellie));

        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstinfos, Petslesson.this);
        pager.setAdapter(adapter);
    }
}
