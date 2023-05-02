package com.example.lesson.color;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.miwok.LessonForm;
import com.example.android.miwok.MyAdapter;
import com.example.android.miwok.R;
import com.example.lesson.taskslesson;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;

public class Skinslesson extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessoncolor);

        ArrayList<LessonForm> lstinfos = new ArrayList<LessonForm>();

        lstinfos.add(new LessonForm("Astronaut", "" , R.drawable.astronaut));
        lstinfos.add(new LessonForm("Captain", "", R.drawable.captain));
        lstinfos.add(new LessonForm("Mechanic", "", R.drawable.mechanic));
        lstinfos.add(new LessonForm("Military", "", R.drawable.militaryman));
        lstinfos.add(new LessonForm("Police", "", R.drawable.police));
        lstinfos.add(new LessonForm("Doctor", "", R.drawable.doctor));
        lstinfos.add(new LessonForm("Black Suit ", "", R.drawable.blacksuit));
        lstinfos.add(new LessonForm("White Suit", "", R.drawable.whitesuit));
        lstinfos.add(new LessonForm("Wall Guard Suit", "", R.drawable.wallguard));
        lstinfos.add(new LessonForm("MIRA Hazmat", "", R.drawable.mirahazmat));
        lstinfos.add(new LessonForm("MIRA Security Guard", "", R.drawable.mirasecuritycap));
        lstinfos.add(new LessonForm("MIRA Landing", "", R.drawable.miralanding));
        lstinfos.add(new LessonForm("Miner Gear", "", R.drawable.minergear ));
        lstinfos.add(new LessonForm("Winter Gear", "", R.drawable.wintergear ));
        lstinfos.add(new LessonForm("Archaeologist ", "", R.drawable.archaeologist ));






        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstinfos, Skinslesson.this);
        pager.setAdapter(adapter);
    }
}
