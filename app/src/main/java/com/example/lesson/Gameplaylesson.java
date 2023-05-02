package com.example.lesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.miwok.LessonForm;
import com.example.android.miwok.MyAdapter;
import com.example.android.miwok.R;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;

public class Gameplaylesson extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson);

        ArrayList<LessonForm> lstinfos = new ArrayList<LessonForm>();

        lstinfos.add(new LessonForm("Game Play", "The premise of Among Us is quite simple: you’re one of 4 to 10 players on a space ship. One of these is an Impostor whose main goal is to kill everyone else. The remainder of the players are part of the regular crew who’s just trying to escape unharmed. To do this, they have to complete several tasks or (better yet) find the Impostor and vote them out Survivor style. If they’re successful, the Crew wins. If the Impostor manages to kill them all, he or she wins.", R.drawable.gamepaly));


        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstinfos, Gameplaylesson.this);
        pager.setAdapter(adapter);
    }
}
