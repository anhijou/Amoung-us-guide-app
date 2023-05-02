package com.example.lesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.miwok.LessonForm;
import com.example.android.miwok.MyAdapter;
import com.example.android.miwok.R;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;

public class Locationslesson extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson);

        ArrayList<LessonForm> lstinfos = new ArrayList<LessonForm>();

        lstinfos.add(new LessonForm("Admin", "On The Skeld, Admin is a small room located under the Cafeteria, slightly to the right with only one entrance. A table in the center of the room features both the Admin panel on its left side and the Swipe Card task on its right side.\n" +
                "\n" +
                "A vent is situated in the lower-left corner (connected to both Cafeteria and right corridor vents). One of the two O2 keyboards is used to fix the O2 sabotage, in the upper right corner.\n" +
                "\n" +
                "MIRA HQ\n" +
                "On MIRA HQ, Admin is located under Greenhouse, where it consists of the Admin table and the Enter Id Code task. \n" +
                "\n" +
                "POLUS\n" +
                "Unlike the rest of the Admin rooms, the Admin room on Polus is much larger and features no tasks. It features a similar Admin table as The Skeld, which here can be used on either side. It has a vent in the left-bottom corner, in a corridor-like formation, which leads directly outside the left wall or far off near Laboratory's entrance. Right below the Admin table is one of the two entrances to Specimen Room via Decontamination.", R.drawable.admin));
        lstinfos.add(new LessonForm("Balcony", "Balcony is located at the bottom of MIRA HQ, with the Clear Asteroids task on the left, the Measure Weather task on the right, and a vent in the middle between the two automatic sliding doors.", R.drawable.balcony));
        lstinfos.add(new LessonForm("Boiler Room", "Boiler Room is a small room located on Polus. It is located on the bottom left-hand side of the map, south of O2, and contains the tasks Replace Water Jug and Open Waterways.", R.drawable.boilerroom));
        lstinfos.add(new LessonForm("Cafeteria", "In The Skeld, the Cafeteria is the main spawn point of the players at the start of the game and after the Discussion Time. It is the largest room with blue circular tables and has three doors: left, which leads to the Upper Engine, passing MedBay; right, which leads to Weapons; and the bottom, which leads to Storage, passing Admin. A vent is located near the right door, and the Emergency Button is located on the middle table.\n" +
                "\n" +
                "MIRA HQ\n" +
                "In MIRA HQ, the Cafeteria is the main spawn point of the players after the Discussion Time as well, however, it is not where the players begin the game. It is located in the right corridor and is smaller than its predecessor. It is also near the Storage and the Balcony, and the tables are cubic instead of circular and are light brown. A vent is located near the entrance, and the emergency button is located on the left table. It is also not advised to kill in the cafeteria.", R.drawable.cafeteria));
        lstinfos.add(new LessonForm("Communications", "When near Communications, players will hear radio chatter. Sometimes, a Morse code message will play. The radio chatter is an audio file on loop.\n" +
                "\n" +
                " THE SKELD\n" +
                "Communications on The Skeld is a medium-sized room in the lower-right hand corner, located between Storage and Shields. It features two tasks and the panel used to fix Comms Sabotage.\n" +
                "\n" +
                "MIRA HQ\n" +
                "Communications on MIRA HQ is a medium-sized room in the bottom of the map, above MedBay. Only one task is present, Accept Diverted Power. This room houses one panel used to fix Comms Sabotage and view Doorlog, marking all players that pass through Hallway.\n" +
                "\n" +
                "POLUS\n" +
                "Communications on Polus is a medium-sized room that is not directly connected to any other room but is located above Weapons. It contains two tasks, including Reboot Wifi and Upload Data. At the exterior of the room, there is a dial to fix Comms Sabotage.", R.drawable.comms));
        lstinfos.add(new LessonForm("Dropship", "On Polus, the Dropship acts as the spawn room. It is a dead end located at the top of the map, slightly left from the middle, and leads directly outside. There are two tasks inside the Dropship: Chart Course and Insert Keys. The Fuel Engines task is also located on the exterior.\n" +
                "\n" +
                "OTHER APPEARANCES\n" +
                "LOBBY\n" +
                "The Dropship is used as the lobby while waiting for players to join. It has two large metal crates and a single small one. There is a laptop on the small one, which lets players customize their color, hat, skin, and pet. They can also view round settings, but only the host of the game can edit them. The lobby does not have anything near the seats, but two tasks appear when the lobby transforms into the dropship.\n" +
                "\n" +
                "The options of the game have taken the place of the task list. These show players the different parts of the game. Each attribute can be changed by the host if wanted to.\n" +
                "\n" +
                "MIRA HQ\n" +
                "The Dropship can be seen in the Launch Trailer for MIRA HQ, in which it is approaching the building. The Dropship is located at the top of the Launchpad when the round begins.", R.drawable.dropship));
        lstinfos.add(new LessonForm("Electrical", "On The Skeld, Electrical is a room with wires on the floor and other electrical appliances, such as a distributor and a generator. There is a vent located under the Download Data panel, which is connected to those of Security and MedBay.\n" +
                "\n" +
                "POLUS\n" +
                "On Polus, Electrical is a room connected to Security and O2, having an exposed area that contains electric generators. A vent is located at the end of the corridor, near the Security door and connects to a vent outside of Electrical and O2.\n" +
                "\n" +
                "HENRY STICKMIN MAP\n" +
                "Electrical was confirmed to be on the Henry Stickmin Map by Marcus Bromander on November 6, 2020 on his Twitter account, saying that it \"might be scarier than Skeld.\"", R.drawable.electrical));
        lstinfos.add(new LessonForm("Greenhouse", "MIRA HQ :The Greenhouse is a tall room with pots full of shrubs, flowers, and plants, and a large oxygen filter with a tree inside. The roof contains several dry plants that sway slowly, and a vent is located above the filter. The floor is entirely made of some transparent material (possibly glass).", R.drawable.greenhouse));
        lstinfos.add(new LessonForm("Hallway", "Hallway is an upside-down Y-shaped and has doorlog sensors at each of its exits. It has one task at its bottom left, which is Fix Wiring. At its bottom right, there is a vent.\n" +
                "\n" +
                "Hallway is one of the busiest locations on MIRA HQ, so it is risky for An Impostor to kill there. However, by using the vent at the bottom-right near Cafeteria correctly, it is possible to escape after a kill.", R.drawable.hallway_center));
        lstinfos.add(new LessonForm("Laboratory", "MIRA HQ\n" +
                "On MIRA HQ, Laboratory is a medium-sized room, located across Reactor past Decontamination. It features a one-way window that can only be looked through on the hallway side. It also includes a vent directly connected to other vents near Decontamination, Reactor, and Office, and is part of MIRA HQ's vent network.\n" +
                "\n" +
                "POLUS\n" +
                "Laboratory on Polus is a massive room encompassing several smaller rooms. In its center is the main laboratory room, which features several tasks. Right below is Bathroom, which has a vent inside one of the stalls, leading directly to Outside and indirectly into Office.\n" +
                "\n" +
                "On the left are both the weather station and the laser drill pod. Each features several tasks connected to a hallway right below them, which is the left entrance to Laboratory. The entrance and the drill pod have a Security camera right outside.\n" +
                "\n" +
                "On the right is MedBay, featuring a scanner for Submit Scan. Right below is the upper Decontamination, with its entrance facing Bathroom, which leads to the Specimen Room.", R.drawable.labcenter));
        lstinfos.add(new LessonForm("Launchpad", "MIRA HQ\n" +
                "The Launchpad is the spawn point for players in MIRA HQ until an Emergency Meeting is called. It is the place where the crew's ship is perched, along with several boxes, a diagnostic computer, and another device that serves to fill the engines. It has a vent in the upper left corner with is connected to all the other vents in the MIRA HQ map.", R.drawable.launchpad_room));
        lstinfos.add(new LessonForm("Lobby", "The lobby is a small spaceship with ten seats (five on each side), which are the spawning locations for players, and an entrance door at the top. There are two large, green crates in the lower half and a smaller crate, on which there is a laptop to customize your character. This laptop is also where the host can edit the game settings.\n" +
                "\n" +
                "The lobby is the Dropship from Polus. The only differences are the absence of the three crates and the inclusion of the Chart Course and Insert Keys tasks. This ship can also be seen beyond the Launchpad in MIRA HQ.\n" +
                "\n" +
                "The players can see the options in the upper left corner and the room code at the bottom. The bottom right will tell you how many players are in the game. At the bottom left will be a button, telling you if the room is public or private. The host can change this by pressing the button. The host will also see a start button at the bottom. It will be translucent and unusable if there are fewer than four players. If the game starts at four players, there will be a warning saying that it will not be fun to play and very difficult for the Crewmates to win.", R.drawable.dropshiplobby));
        lstinfos.add(new LessonForm("Locker Room", "MIRA HQ\n" +
                "There are two parts to Locker Room: the hallway side of the room, which contains three sets of four lockers, a bench, and a rug, an additional bench, and the entrance from Hallway, and the decontamination site, which contains the entrance to Decontamination, along with the button to open Decontamination, and a Fix Wiring task.\n" +
                "\n" +
                "There is also a vent on the bottom left corner which leads to the vents in Decontamination, Launchpad, and MedBay.", R.drawable.lockerroom));
        lstinfos.add(new LessonForm("Lower Engine", "The Lower Engine is a small room that contains three Tasks and a single vent. This location is connected to the Reactor/Security hallway, as well as the Electrical/Storage hallway. The vent is connected to Reactor.", R.drawable.lowerengine));
        lstinfos.add(new LessonForm("MedBay", "THE SKELD\n" +
                "On The Skeld, MedBay is a medium-sized room that contains a vent, scanner, and four hospital beds. It houses two tasks, and its vent leads to Security and Electrical.\n" +
                "\n" +
                "MIRA HQ\n" +
                "On MIRA HQ, MedBay is a medium-sized room that contains a scanner and seven futuristic hospital beds. It houses two tasks and a vent that directly leads to Locker Room and Balcony.\n" +
                "\n" +
                "POLUS\n" +
                "On Polus, MedBay is a medium-sized room that is only mentioned in tasks. Otherwise, it's encompassed by the Laboratory. It contains a scanner and hospital beds. The beds look like they have a table next to them. It also has two tasks in it.", R.drawable.medbay));
        lstinfos.add(new LessonForm("Navigation", "THE SKELD\n" +
                "Navigation is a small room located at the very right side of the map, which serves as the ship's control room with various navigation equipment. It contains two vents, with the upper one going to Weapons, and the lower one going to Shields. It has five tasks, four in the main area, and a Fix Wiring task in the hall to the left. It is similar to the Reactor, being at polar opposites of the map with 2 vents that lead to another room.", R.drawable.navigation));
        lstinfos.add(new LessonForm("Nodes", "POLUS\n" +
                "Nodes consist of dark blue cones on metal cylinders, surrounded by turquoise circles. There are a total of 6 weather nodes scattered on the map. Most of the nodes are located close to openings, giving Impostors a good excuse to be close to openings.", R.drawable.nodegi));
        lstinfos.add(new LessonForm("O2", "THE SKELD\n" +
                "On The Skeld, O2 is a tiny room towards the map's top-right corner, below Weapons. It features three short tasks and a number pad to stop an O2 sabotage. It appears that a plant is inside the box with the number pad, possibly helping produce oxygen to the ship. To the right of O2 is a security camera, which also captures the entrance to Navigation.\n" +
                "\n" +
                "POLUS\n" +
                "On Polus, O2 takes up the space of three rooms, two medium-sized and one small. It is located above Boiler Room. The top-left room contains the first stage of the Upload Data task, the Monitor Tree task, and a vent. The main room contains the Empty Garbage and Fix Wiring tasks, and the small room contains the Fill Canisters task.", R.drawable.o2));
        lstinfos.add(new LessonForm("Office", "MIRA HQ\n" +
                "The office is a medium-sized room located at the end of the North Hallway, across from Admin. It has a \"The Henry Stickmin Collection\" poster at the top right corner. It is in the upper area of the map. It has a vent in the upper left corner. Two short tasks are found here. The lights and one part of the Comms sabotages can be fixed there.\n" +
                "\n" +
                "POLUS\n" +
                "The office takes up the space of two long rooms: one labeled as \"Office,\" which features the Emergency Button and the second part of Replace Water Jug, and another housing vitals and all the other tasks. There is also the \"See something, Say something\" poster. During emergency meetings, players spawn in the left part of the office, huddled around the button.", R.drawable.office));
        lstinfos.add(new LessonForm("Outside", "POLUS\n" +
                "The Outside is the outer area of the planetary base, being located practically from the right exit of the Office, with a lava pit, several pilasters of climatic modules, among other things. There is a metal plank leading out to the lava, which is used to vote off and kill suspected impostors during the ejection scene. However, whilst playing, players cannot fall into the lava. This area can also be seen in the security cameras.", R.drawable.exterior));
        lstinfos.add(new LessonForm("Reactor", "THE SKELD\n" +
                "On The Skeld, Reactor is a room located in the corridor across from Security. It contains two vents that connect to only one location, which are Upper Engine and Lower Engine, whichever is closest to the vent. While the reactor glows typically blue, it will begin to glow red if sabotaged, with paths to the hand scanners lighting up.\n" +
                "\n" +
                "MIRA HQ\n" +
                "On MIRA HQ, Reactor is connected to Laboratory, which contains a massive reactor with a claw that emits a laser (which can change color if the reactor is sabotaged), several computers, and two hand palms that are used to repair the sabotage of the reactor, just like on The Skeld. To get to Reactor, Crewmates must first go through Decontamination. A vent is located on the left below. Several one-way windows can also be seen through from the hallway side of Reactor.", R.drawable.reactor));
        lstinfos.add(new LessonForm("Security (location)", "THE SKELD\n" +
                "The Security room is a small room across from Reactor with a vent in the lower right corner. Above that is a desk and on the north side is a computer where players can access security. When near Security, ambient sound is heard.\n" +
                "\n" +
                "POLUS\n" +
                "The Security room is a tiny room on the upper left side of the map. It has a computer screen that allows access to security.", R.drawable.security));
        lstinfos.add(new LessonForm("Seismic Stabilizers", "POLUS\n" +
                "On Polus, Seismic Stabilizers contain no tasks, as they are used solely to fix Reset Seismic Stabilizers. They are separated from Polus's main ground via long bridges and rest on small, isolated platforms. These platforms are found on both sides of Dropship. While one bridge is located near Electrical, the other is located near Laboratory.", R.drawable.polusseismicstabaliser));
        lstinfos.add(new LessonForm("Shields", "THE SKELD\n" +
                "Shields is a small room located at the far southeastern corner on The Skeld near Navigation and Communications, which has several lamps with lights. A vent is located near the Prime Shields panel, which connects to the vents in Navigation and the northern hallway leading to Navigation.", R.drawable.shields));
        lstinfos.add(new LessonForm("Specimen Room", "Specimen Room is located near the bottom right of the map. To access it, players must pass through one of the small Decontamination rooms in either Admin or Laboratory, then walk through a long, empty hallway. The room features windows that let players see Outside from within.", R.drawable.specimenroom));
        lstinfos.add(new LessonForm("Storage", "THE SKELD\n" +
                "In The Skeld map, Storage has large containers in the middle of the room which only allow for movement around the walls of the room. On the bottom left of the pile of containers, there is a red gas canister, which is used in the first part of the Fuel Engines Task. In the bottom right corner of the room, there is a lever and a hatch where the garbage is flushed away for the second stage of the Empty Garbage Task, which is a visual task.\n" +
                "\n" +
                "MIRA HQ\n" +
                "In this map, Storage is located near the Cafeteria. Inside the room is a bookcase which contains old materials, including the watering can, which is used to water the plants.\n" +
                "\n" +
                "POLUS\n" +
                "Here, Storage is a small, utterly isolated room with only a gallon of fuel and a few boxes, along with a hole, which is connected to the holes in the Office and the one near Communications. There is a window which be viewed both inside and outside storage located at the bottom of the structure.", R.drawable.storageskeld));
        lstinfos.add(new LessonForm("Upper Engine", "Upper Engine is a small room on The Skeld that contains three tasks and a single vent. This location is connected to the hallway containing the Reactor and Security hallway, as well as the hallway containing MedBay.", R.drawable.upperengine));
        lstinfos.add(new LessonForm("Weapons", "THE SKELD\n" +
                "On The Skeld, Weapons is a medium-sized room located to the right of Cafeteria and above O2. In the middle of the room is a chair sitting on a platform with a holographic screen, used for Clear Asteroids. There are also panels for Download Data and Accept Diverted Power, located at the top and to the right, respectively. A vent lies just below the Download Data panel.\n" +
                "\n" +
                "POLUS\n" +
                "On Polus, Weapons is a medium-sized room with two tasks: Clear Asteroids and Download Data. The room is inside a pod, located at the bottom of the Polus base, with an entrance at the top. The Download Data panel is on a short wall perpendicular to the pod's entrance. Clear Asteroids is in the top-right corner and is accessed via a PC on a desk, which fires a laser outside the pod, into outer space.", R.drawable.weapons));





        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstinfos, Locationslesson.this);
        pager.setAdapter(adapter);
    }
}
