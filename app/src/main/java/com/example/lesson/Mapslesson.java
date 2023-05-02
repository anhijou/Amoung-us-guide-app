package com.example.lesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.miwok.LessonForm;
import com.example.android.miwok.MyAdapter;
import com.example.android.miwok.R;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;

public class Mapslesson extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson);

        ArrayList<LessonForm> lstinfos = new ArrayList<LessonForm>();

        lstinfos.add(new LessonForm("THE SKELD", "The Skeld is the oldest map in Among Us, and it's ideal for new players. That's because it's a great place to get to grips with Among Us' tasks, and try your hand as a devious Imposter. \n" +
                "\n" +
                "It features security cameras that show you a live feed of specific zones. Routinely checking these via the terminal in Security could see you catching an Imposter in the act, or noticing a dead body before another Crewmate finds it. It's a good idea to stop by this room on your way to other tasks. The cameras display a red light when in use, so keep an eye out for these when playing as the Imposter to avoid getting caught.", R.drawable.map1));
        lstinfos.add(new LessonForm("MIRA HQ", "The MIRA HQ map is the only one that doesn't feature security cameras, but it does use a different system called 'doorlogs'. Crewmates can scroll through these to monitor how other players are moving around the station. Once you're familiar with the map, you'll be able to spot when someone is moving erratically: This could be an Imposter using Vents to navigate the ship.\n" +
                "\n" +
                "You can monitor the doorlogs in the Communications room, but when the Imposter sabotages the communications, all doorlogs will be erased. Bear in mind that the Imposter cannot lock the doors on this map, either.", R.drawable.map2));
        lstinfos.add(new LessonForm("POLUS", "Feel the temperature dropping? Then you've arrived on Polus. This is the newest and largest of Among Us' maps, and as you can see from the layout below, there's far more space between each of its rooms. \n" +
                "\n" +
                "Polus has a Vitals kiosk that lets you see which players are alive. Green vitals mean a Crewmate is alive, whereas a red outline means they've been killed since the last meeting. Both Imposters and Crewmates can use this feature to check on others. Polus also has security cameras, but you have to switch between each feed on a single screen.      ", R.drawable.map3));







        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstinfos, Mapslesson.this);
        pager.setAdapter(adapter);
    }
}
