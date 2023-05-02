package com.example.lesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.miwok.LessonForm;
import com.example.android.miwok.MyAdapter;
import com.example.android.miwok.R;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import java.util.ArrayList;


public class Groupslesson extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson);

        ArrayList<LessonForm> lstinfos = new ArrayList<LessonForm>();


        lstinfos.add(new LessonForm("CREWMATE", "Crewmates, also known as Crewmembers or The Crew, are one of the two possible randomly assigned roles in Among Us. \n" +
                                "\n" + "The primary goal of a Crewmate is to complete all tasks while not being killed by The Impostor(s), with the secondary goal being to find The Impostor and ejecting them off the ship. Crewmates who have been killed by An Impostor or ejected become Ghosts.\n" +
                "\n" +
                "There are three ways for the Crewmates to win the game:\n" +
                "\n" +
                "The Crewmates vote out The Impostor(s).\n" +
                "The Crewmates complete all their tasks.\n" +
                "All Impostors leave/disconnect from the game.\n" +
                "The Crewmates are assigned a variety of tasks such as Fix Wiring, Upload Data, Fuel Engines, etc.", R.drawable.crewmate));
        lstinfos.add(new LessonForm("IMPOSTOR", "The Impostor is the main antagonist of Among Us and one of the two possible randomly assigned roles in the game.\n" + "\n" +"The primary goal of The Impostor is to kill enough Crewmates to have an equal amount of Impostors and Crewmates before all tasks are completed and to have their true identity remain hidden.\n" +
                "\n" +
                "The Impostor cannot complete any tasks; however, they are given a fake task list as general guidance on how to feign the behavior of a Crewmate and blend in with them. Impostors have the ability to sabotage to force Crewmates to perform specific tasks, which, if failed by the Crewmates, will lead to a win for The Impostors (If reactor or O2 is sabotaged). This ability can be used in many different ways, like luring Crewmates away from a body or concealing a kill.\n" +
                "\n" +
                "There are 2 ways that Impostors can win:\n" +
                "\n" +
                "By enacting a critical sabotage that is not fixed in time\n" +
                "By killing the majority of the Crewmates, leaving only one alive per Impostor", R.drawable.imposters));
        lstinfos.add(new LessonForm("GHOSTS", "Ghosts are players who have been killed by An Impostor or ejected by other players.\n" + "\n" +"Ghosts have no collision and can freely travel through walls. They are invisible to both alive Crewmates and Impostors, but can be seen by other ghosts. They also have unlimited vision, which is not restricted by walls or sabotages. Ghosts cannot assist during sabotages, such as a Reactor Meltdown or O2 deprivation.\n" +
                "\n" +
                "Ghosts can see and use the chat simultaneously, even outside of Emergency Meetings. However, messages will not be shown to alive players; only fellow ghosts will see them. This allows Ghosts to chat with each other throughout the game, although ghosts cannot vote or kick other players during emergency meetings. They also cannot report bodies or call meetings.", R.drawable.ghosts));




        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstinfos, Groupslesson.this);
        pager.setAdapter(adapter);
    }

}
