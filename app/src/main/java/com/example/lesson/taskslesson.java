package com.example.lesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.miwok.LessonForm;
import com.example.android.miwok.MyAdapter;
import com.example.android.miwok.R;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;

public class taskslesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson);

        ArrayList<LessonForm> lstinfos = new ArrayList<LessonForm>();

        lstinfos.add(new LessonForm("Align Engine Output", "Align Engine Output is a short task in Among Us, available in The Skeld.\n" + "GAMEPLAY\n" +
                "Align Engine Output begins with an engine facing either upwards or downwards with a horizontal line in the screen's middle. Crewmates must move the engine close enough to align with the middle line of the object. The task contains two parts, which are done at the Upper Engine and Lower Engine, in either order. The engines are moved using the slider on the right side of the panel that pops up when the task is started. This is a two-part task.", R.drawable.alignengineoutput ));
        lstinfos.add(new LessonForm("Align Telescope", "Align Telescope is a short task in Among Us, completed on Polus.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "Align Telescope involves moving the telescope until it is pointed at whichever the correct astronomical object is. A slight beeping sound will increase in speed as the telescope's alignment is closer to the right object. Once the telescope is pointed towards the correct object, the telescope will turn green, and the task will be completed.\n" +
                "\n" +
                "A few of the objects Crewmates may identify are:\n" +
                "\n" +
                "A black hole\n" +
                "A dyson sphere\n" +
                "An alien spaceship\n" +
                "A gas giant\n" +
                "A galaxy\n" +
                "Another planet\n" +
                "A nebula", R.drawable.align_telescope ));
        lstinfos.add(new LessonForm("Assemble Artifact", "Assemble Artifact is a short task in Among Us, completed on MIRA HQ and located in Laboratory.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "To complete the task, the player must assemble a gem's five shattered pieces together by clicking and dragging (just dragging for mobile players) the pieces appropriately. The pieces' arrangement is static and never changes. When the player puts a piece in the right location, all the placed pieces will flash.", R.drawable.assembleartifact));
        lstinfos.add(new LessonForm("Buy Beverage", "Buy Beverage is a short task in Among Us, introduced in MIRA HQ.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "Located in the Cafeteria, the player must order an item from a vending machine using a keypad to select the right item. The player's exact item needs to order is shown on a piece of paper located under the keypad. The vending machine separates its items by a letter followed by a number (Example: B2). If the player enters the \"code\" for the wrong item, the vending machine will dispense the item out, allowing the player to attempt to enter the right code again.", R.drawable.beverage));
        lstinfos.add(new LessonForm("Calibrate Distributor", "Calibrate Distributor is a short task in Among Us, completed on The Skeld, and located in Electrical.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "Calibrate Distributor is based on timing. A node rotates counter-clockwise around a ring. When it reaches its rightmost point, the player must tap or click the button under the bar, advancing to the next. There are three nodes total, and if a mistake is made, the player must restart from the first and directions that the nodes face will change.", R.drawable.calibratedistributor ));
        lstinfos.add(new LessonForm("Chart Course", "Chart Course is a short task in Among Us, present in all three maps.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "The player must go to the panel and drag the ship displayed across the four points to complete this task. The points are located at different points on the screen each time.", R.drawable.chartcourse ));
        lstinfos.add(new LessonForm("Clean O2 Filter", "Clean O2 Filter is a short task in Among Us, introduced in The Skeld.\n" +
                "GAMEPLAY\n" +
                "In this task, the player must drag six leaves to the trash to complete the task. When you drag the leaves, they retain the motion towards their direction, so essentially you don't need to keep dragging the leaves. You need a slight shove or pull towards the trash container since the machine will suck in the nearby leaves close to the trash container. As you drag the leaves towards the opening, lights flash inside the arrows beside it, giving you a visual indicator. Once all the leaves are in, the arrows will turn green, and the task will be completed and closed.", R.drawable.clean_o2_filter_task));
        lstinfos.add(new LessonForm("Clear Asteroids", "Clear Asteroids is a long task in Among Us, completed on all currently available maps.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "When opened, a translucent green screen appears, showing meteors flying from the right edge of the screen to the left. The player must tap or click on each asteroid to destroy it. When a total of 20 asteroids have been destroyed, the task is completed. There is no penalty for missing asteroids. If a Crewmate misses too many asteroids, the green screen will disappear and they will have to reopen the task to finish it. The number of destroyed asteroids does not reset, and continues from where the Crewmate last left off. Since this task saves player progress, Crewmates can exit the task at any time. Because Clear Asteroids is a visual task on both The Skeld and Polus, players watching a Crewmate can confirm that they are innocent if visual tasks are enabled in the game's options.\n" +
                "\n" +
                "On The Skeld and Polus, Clear Asteroids is located in Weapons. On MIRA HQ, Clear Asteroids is located at Balcony, but it is not a visual task here.", R.drawable.clear_asteroids));
        lstinfos.add(new LessonForm("Divert Power", "Divert Power is a short task in Among Us, completed on The Skeld and MIRA HQ.\n" + "GAMEPLAY\n" +
                "STAGE 1: DIVERT POWER\n" +
                "The first stage of the task requires the player to flip a switch in Electrical or Reactor, depending on the map. They must move the highlighted switch all the way up. Moving the switch towards the bottom decreases the power, which is the opposite of what Crewmates must do to complete the task.\n" +
                "\n" +
                "STAGE 2: ACCEPT DIVERTED POWER\n" +
                "In the second stage, the player needs to travel to the respective room to accept diverted power. The rooms that accept the power are:\n" +
                "\n" +
                "Location\n" +
                "Admin\tMIRA HQ only\n" +
                "Cafeteria\tMIRA HQ only\n" +
                "Communications\tBoth Maps\n" +
                "Greenhouse\tMIRA HQ only\n" +
                "Laboratory\tMIRA HQ only\n" +
                "Launchpad\tMIRA HQ only\n" +
                "Lower Engine\tThe Skeld only\n" +
                "Medbay\tMIRA HQ only\n" +
                "Navigation\tThe Skeld only\n" +
                "O2\tThe Skeld only\n" +
                "Office\tMIRA HQ only\n" +
                "Security\tThe Skeld only\n" +
                "Shields\tThe Skeld only\n" +
                "Upper Engine\tThe Skeld only\n" +
                "Weapons\tThe Skeld only\n" +
                "Once in the room, the player must locate the panel to accept the diverted power, then turn the fuse by clicking or tapping it to complete the task.", R.drawable.divert_power_panel));
        lstinfos.add(new LessonForm("Empty Garbage", "Empty Garbage, also known as Empty Chute on The Skeld, is a task in Among Us, located in the Cafeteria, Storage, and O2. It is a task found in all three maps.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "In The Skeld, Empty Garbage consists of two phases. The first phase is located in the Cafeteria, where Crewmates must go up to the lever and then open a trash can with a lever. The player must pull and hold the lever down until the Garbage has been emptied.\n" +
                "\n" +
                "The second phase is located in Storage and is located at a lever nearby a door outside the ship. Similarly, Crewmates must pull the lever and hold it until the trash is empty, and the door outside the ship will open, throwing all the trash out. This phase is a visual task, which means this phase of this task will prove the innocence of the Crewmate and confirm that they are not An Impostor.\n" +
                "\n" +
                "Empty Garbage also has a counterpart, named \"Empty Chute,\" which starts in O2 but finishes in Storage. It only appears in The Skeld. This task is identical in terms of how to complete it. The players can have both of these tasks, requiring them to pull the lever in Storage twice.\n" +
                "\n" +
                "At MIRA HQ, Empty Garbage consists of just one stage and is located in the Cafeteria, similar to The Skeld.\n" +
                "\n" +
                "On Polus, the task is located in O2 and also consists of one phase.", R.drawable.among_us_garbage_disposal ));
        lstinfos.add(new LessonForm("Enter Id Code", "Enter Id Code is a common task in Among Us, completed on MIRA HQ and located in Admin.\n" + "GAMEPLAY\n" +
                "In Enter Id Code, the player must swipe up the wallet's card to see their ID code. They must enter the code onto the panel correctly to complete the task. If they enter it incorrectly, they will have to try again.", R.drawable.enteridcode ));
        lstinfos.add(new LessonForm("Fill Canisters", "Fill Canisters is a short task in Among Us, introduced in Polus.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "The player must drag the canister to the airway to fill it up with gas, then pull it away from the airway. This must be done for two canisters.\n" +
                "\n" +
                "If they leave the task after filling the first canister, the task will not be reset. Instead, the text in the task list will become yellow just like any other multi-stage task.", R.drawable.fillcanisters));
        lstinfos.add(new LessonForm("Fix Weather Node", "Fix Weather Node is a long task in Among Us, introduced in Polus.\n" + "GAMEPLAY\n" +
                "STAGE 1\n" +
                "The player has to go to one of 6 weather nodes placed outside (Node_CA, Node_TB, Node_IRO, Node_PD, Node_GI, and Node_MLG) and move their cursor through a randomly generated maze, starting at the top left and ending at the bottom right. If the player goes the wrong way, they have to restart the maze from the beginning.\n" +
                "\n" +
                "The location of each node is as follows:\n" +
                "\n" +
                "Node_CA: South of the path leading to eastern seismic stabilizer.\n" +
                "Node_TB: West of Comms; south-east of Electrical.\n" +
                "Node_IRO: Near the southern entrance to O2; south-west of Weapons.\n" +
                "Node_PD: South of the western entrace to Office; south-east of Weapons.\n" +
                "Node_GI: North of Comms; near the center of the map.\n" +
                "Node_MLG: North of the lava pit; nearby a vent.\n" +
                "STAGE 2\n" +
                "Once the end of the maze is reached, the player must go to the Laboratory and switch on the weather node that was fixed.", R.drawable.node));
        lstinfos.add(new LessonForm("Fix Wiring", "Fix Wiring is a common task in Among Us, completed on all three currently available maps.\n" + "GAMEPLAY\n" +
                "Fix Wiring is done by connecting each colored wire from the left-hand side of the screen to the matching color on the right-hand side. Note that the colors on the left side are randomized, while the colors on the right side are always in the same order: Red on top, followed by blue, then yellow, and finally pink. As of v2020.10.22o, the wires have also been fitted with symbols at their bases to add extra clarification and help those who are color-blind.\n" +
                "\n" +
                "Three electrical panels must be repaired for this task to be completed. In the background behind the four colored wires are eleven wires for aesthetics. If while performing the task, one closes the tab and reopens it, the location of the starting wires will be positioned differently.", R.drawable.fixwiring ));
        lstinfos.add(new LessonForm("Fuel Engines", "Fuel Engines is a long task in Among Us, introduced in The Skeld.\n" + "GAMEPLAY\n" +
                "STAGE 1\n" +
                "In The Skeld and on Polus, Fuel Engines requires the player to first go to the Refuel Station in Storage and fill their gas can by holding the silver button to the right of the can.\n" +
                "For The Skeld, the player must then go to the Upper Engine to fuel it.\n" +
                "For Polus, the player must then go Outside, to fuel the engine on the right side of the Dropship.\n" +
                "In MIRA HQ, the player fuels the engine directly at Launchpad.\n" +
                "STAGE 2\n" +
                "In The Skeld, the player has to refill the can back at the refuel station, then go to Lower Engine to fuel it.\n" +
                "On Polus, the player needs to refill the can back at the refuel station, then go Outside to fuel the engine on the left side of the Dropship.", R.drawable.skeld_refuel_station ));
        lstinfos.add(new LessonForm("Insert Keys", "Insert Keys is a common task in Among Us, introduced in Polus.\n" + "GAMEPLAY\n" +
                "The task is performed by dragging the key shown to the left of the locks to the appropriate keyhole (highlighted with yellow/orange), inserting it (turning the exterior color into blue in doing so), and rotating it to the left or right by 90 degrees.", R.drawable.insertkeys));
        lstinfos.add(new LessonForm("Inspect Sample", "Inspect Sample is a long task in Among Us, completed on The Skeld and Polus in MedBay.\n" + "GAMEPLAY\n" +
                "STAGE 1\n" +
                "When a Crewmate starts Inspect Sample, a machine holding five test tubes will appear. The Crewmate must press the small green button near the bottom-right corner of the machine. Once the button is pressed, the machine will quickly dispense a liquid into each test tube. The top of the machine will then read \"ETA 59.\" The Crewmate can then close the task window, as the counter will continue to decrease.\n" +
                "\n" +
                "STAGE 2\n" +
                "After 59 seconds have gone by, including time spent in Emergency Meetings, the Crewmate will need to return to the machine to complete the task. They must press the green button below the red-colored sample.\n" +
                "\n" +
                "If done successfully, the top of the machine will read \"THANK YOU!\" and the bottom will read \"TEST COMPLETE.\"\n" +
                "\n" +
                "If one of the four blue samples are selected, the machine will read \"BAD RESULT,\" the green buttons will flash red, and the entire task will need to be done again.", R.drawable.inspectsample));
        lstinfos.add(new LessonForm("Measure Weather", "Measure Weather is a short task in Among Us, completed in MIRA HQ.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "Measure Weather is one of the simplest in the game. To start the task, the player must hit the \"Begin\" button. The task is complete when there is text on the Weather Data Download box that says \"done.\" Measure Weather takes six seconds to complete.\n" +
                "\n", R.drawable.measure_weather_mira_hq ));
        lstinfos.add(new LessonForm("Monitor Tree", "Monitor Tree is a short task in Among Us, completed on Polus.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "To complete the task, four colored sliders need to be adjusted to match certain levels of CO2, NUTRI, RAD, and WATER. Once the player moves the sliders to reach all of these levels, being marked by white lines, the lines will turn green, and the task is finished.", R.drawable.monitortree ));
        lstinfos.add(new LessonForm("Open Waterways", "Open Waterways is a long task in Among Us, completed in Polus.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "Crewmates must travel to either the Boiler Room in the bottom left of Polus or just outside the left door of Office to begin this task. The map will display the first valve as being the one on the right in Boiler Room but they can be done in any order. All valves must be turned counter-clockwise.", R.drawable.openwaterways));
        lstinfos.add(new LessonForm("Prime Shields", "Prime Shields is a short task in Among Us, completed on The Skeld and MIRA HQ.\n" + "GAMEPLAY\n" +
                "This visual task consists of a single stage. A Crewmate must go to either Shields when on The Skeld or Admin when on MIRA HQ, and click or tap the red hexagons until all of the hexagons are white. The task always requires Crewmates to click between two and five hexagons.\n" +
                "\n" +
                "On The Skeld, a player can prove their innocence by completing this task. After this task is completed for the first time, the shields will light up unless visual tasks are disabled. Although the shields are permanently on, other players can still prove their innocence by doing this task, as the shield lights will blink. This task cannot prove a Crewmate's innocence on MIRA HQ, as it is not a visual task on that map.", R.drawable.primeshields));
        lstinfos.add(new LessonForm("Process Data", "Process Data is a short task in Among Us, introduced in MIRA HQ. The task consists of uploading data.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "A Crewmate assigned with this task must go to Office to process data. This takes about 12 seconds, and an animation of an Among Us player carrying papers is played while doing this.", R.drawable.process_data ));
        lstinfos.add(new LessonForm("Reboot Wifi", "Reboot Wifi is a long task in Among Us, introduced in Polus.\n" +
                "\n" +
                "OVERVIEW\n" +
                "STAGE 1\n" +
                "The Crewmate with this task must go to Communications and find the communication box. The screen will read \"Reboot Required.\" The player must pull the lever, which will begin a 60-second countdown process. The Wi-Fi will power off, and the \"Tasks\" tab will display the remaining amount of seconds left in the countdown, along with the screen. The player does not have to remain in Communications during the countdown, and they may perform other tasks during this time.\n" +
                "\n" +
                "STAGE 2\n" +
                "After the countdown reaches 0, one must return to the task to pull the lever back up to power on the Wi-Fi. After this, they must wait a few seconds, the Wi-Fi will have \"restarted,\" and the task will be completed.", R.drawable.reboot_wifi ));
        lstinfos.add(new LessonForm("Record Temperature", "Record Temperature is a short task in Among Us, introduced in Polus.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "A Crewmate assigned with this task must enter the temperature number that the task asks for on the right and click/hold on the arrows to increase or decrease the number that is currently displayed. In the version of this task located Outside, the number must be increased, but it must be lowered in the Laboratory. All you need to do is hold, because when you reach the number the task is automatically done. You can't go lower/higher than the number shown.", R.drawable.record_temperature_interior));
        lstinfos.add(new LessonForm("Repair Drill", "Repair Drill is a short task in Among Us, completed on Polus in Laboratory.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "Repair Drill involves repeatedly clicking on four red exclamation points, with the markers reducing in size each time and eventually disappearing. The player will have to click on each marker four times to make the exclamation mark vanished. The player can simultaneously click on these marks. Once all four exclamation marks have vanished, the text on the bottom of the screen will change from \"Status: BAD\" to \"Status: FINE,\" and the task will be completed.", R.drawable.repairdrill));
        lstinfos.add(new LessonForm("Replace Water Jug", "Replace Water Jug is a long task in Among Us, introduced in Polus.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "To complete this task, the player must first go to the Boiler Room and fill up a water jug by holding down the red button until all of the water is transferred from the water jug on the right side to one on the left. The player must do the same thing in Office after the first stage is complete.", R.drawable.replace_water_jug_task ));
        lstinfos.add(new LessonForm("Run Diagnostics", "Run Diagnostics is a long task in Among Us, introduced in MIRA HQ.\n" + "GAMEPLAY\n" +
                "STAGE 1\n" +
                "When opening the task, the player must press the space bar on a keyboard, which will begin a process to find anomalies on a ship in the launchpad. This process takes 90 seconds.\n" +
                "\n" +
                "Crewmates can leave this task, as the 90-second countdown will continue in the background while they do other things. You can see how much time the task has left right next to the task name on your list. After the timer is over, the timer will disappear. Furthermore, staying at the launchpad and waiting for the countdown can make oneself an easy target for Impostors.\n" +
                "\n" +
                "STAGE 2\n" +
                "After that time has elapsed, the player must return to the task and then select the model's red location, which indicates the anomaly. After doing this, the player completes the task.", R.drawable.run_diagnostics_mira_hq ));
        lstinfos.add(new LessonForm("Scan Boarding Pass", "Scan Boarding Pass is a common task in Among Us, completed in Office on Polus.\n" + "GAMEPLAY\n" +
                "In Scan Boarding Pass, Crewmates must press the small yellow triangle on the left to bring up their boarding pass. Then, they must press the large yellow arrow to flip it over. They then must drag the boarding pass above the large red scanner. It should turn green after holding it above the scanner for a short amount of time.", R.drawable.boarding_bass_1));
        lstinfos.add(new LessonForm("Sort Samples", "Sort Samples is a short task in Among Us, exclusive to MIRA HQ.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "Sort Samples requires players to sort six items into their respective bin: an animal fossil, a plant fossil, and a gem. It is located at the bottom of Laboratory.\n" +
                "\n" +
                "To complete this task, the player has to drag, in any particular order, the flower fossils from the far left and the far right to the box with a green leaf icon on it, the animal fossils to the box with a brown paw icon on it (the white fossil with a bone on it and the brown fossil between the black fossil with a dark green leaf on it and the fossil with gems of different colors), and the gems to the box with a purple gem icon on it (the rock with a purple gem on it and the rock with gems of different colors).", R.drawable.sort_samples));
        lstinfos.add(new LessonForm("Stabilize Steering", "Stabilize Steering is a short task in Among Us, completed in The Skeld.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "A Crewmate assigned with this single-stage task must go to Navigation and interact with the control panel. From there, the player can either drag the indicator over the crosshair in the center or tap the crosshair in the center. Once the crosshair is in the center, it will blink green.\n" +
                "\n", R.drawable.stabilize_steering ));
        lstinfos.add(new LessonForm("Start Reactor", "Start Reactor is a long task in Among Us, located in Reactor on The Skeld and MIRA HQ and in Specimen Room on Polus.\n" + "GAMEPLAY\n" +
                "When the player opens the task, a screen will appear on the left while a keypad appears on the right. The player must memorize the order blue squares appear on the left screen and then replicate it using the right keypad. There are nine possible blue square locations in a 3x3 grid. The player will have to memorize five patterns. The first pattern to replicate will be a single square, and the second will be two squares, and so on until a maximum of five squares. Because it may seem daunting to memorize the patterns, it is important to know that the patterns predictably build on each other. For example, the second pattern will always start with the blue square from the first pattern. The fifth pattern will be the four blue squares' order in the fourth pattern plus one new blue square.\n" +
                "\n" +
                "The player must wait until the screen on the left finishes displaying the squares before entering the keypad pattern.\n" +
                "\n" +
                "If the player enters a pattern incorrectly, the blue squares will flash red and the process restarts, in the same order as before, and the player has another opportunity to memorize the pattern. The player may keep trying until they get it correct. However, a skilled Crewmate should be able to enter the patterns correctly and quickly.\n" +
                "\n" +
                "Green lights above the screen on the left indicate how many patterns have been successfully replicated. Green lights above the keypad on the right indicate the number of squares the player has currently selected for the pattern so far.\n" +
                "\n" +
                "When an Emergency Meeting is called, when a player voluntarily leaves the task, or a body is reported, the player's progress is saved. After opening the task panel again, the left screen will display the squares required to press on the keypad again. Crewmates can close the task then open it again if they did not memorize the pattern, as the pattern will play through once more.", R.drawable.startreactorskeld ));
        lstinfos.add(new LessonForm("Store Artifacts", "Store Artifacts is a short task in Among Us done in Polus.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "In Store Artifacts, Crewmates have four different objects; a leaf, a skull, a diamond, and a purple artifact; and a case with four holes that are the same shape and size as the objects. To complete the task, they have to put all the objects into the holes with the same shape.", R.drawable.store_artifacts_polus));
        lstinfos.add(new LessonForm("Submit Scan", "Submit Scan is a long task in Among Us, completed on all three maps, and located in MedBay. It reports the Crewmate's height and weight, which are the same for all players, except for Fortegreen, who weighs 132 pounds. The color of the player along with its ID and a random blood type are also reported.\n" + "GAMEPLAY\n" +
                "Submit Scan consists of the player standing on top of a capsule that starts to scan themselves, while their information is shown, all in about 10 seconds. While performing the task, a hologram that scans the player is shown both to themselves and other players, making it a task that proves innocence, and thus, it becomes easier to discover The Impostor. The hologram will display for only the player scanning if visual tasks are disabled. Multiple players may not perform Submit Scan simultaneously and, instead, have to wait in a queue for the player who initiated the task first to finish.", R.drawable.submitscan));
        lstinfos.add(new LessonForm("Swipe Card", "Swipe Card is a common task in Among Us, completed on The Skeld and Polus, and located in Admin and Office respectively.\n" + "GAMEPLAY\n" +
                "The player must tap the card in the wallet to take it out, and then swipe it on the draw frame. The card needs to be timed correctly, as swiping too slow or too fast or taking their hand off earlier will fail to complete the task, and consequently, the player must try again. It also introduces the player's wallet with a picture of a small family.\n" +
                "\n" +
                "For some players, this is one of the toughest tasks in Among Us, while it usually takes them about one to two tries for others. The trick is for the player to control their swiping speed. This task is usually quite easy for mobile players, but is generally hard because players need to time the swipe right. Many players don't finish swiping the card to the other side, resulting in a bad read. A trick is to swipe it fast halfway and then swipe the other half slowly to get it done quickly.", R.drawable.card_swipe ));
        lstinfos.add(new LessonForm("Unlock Manifolds", "Unlock Manifolds is a short task in Among Us, introduced in The Skeld.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "This task is completed via clicking/pressing the numbers in ascending order (1, 2, 3, 4, 5, 6, 7, 8, 9, 10). If you click the incorrect number, the keypad will flash red, and you will need to restart the sequence (in a similar way to Start Reactor). If you leave the keypad, the position will randomize again.\n" +
                "\n" +
                "Upon completing the task, the keypad will flash green for a brief moment (which is only visible to the player).\n" + "Upload Data is a short task in Among Us, completed on The Skeld, Polus, and the upcoming Henry Stickmin Map.", R.drawable.unlock_manifolds_skeld ));
        lstinfos.add(new LessonForm("Upload Data", "Upload Data is a short task in Among Us, completed on The Skeld, Polus, and the upcoming Henry Stickmin Map.\n" + "GAMEPLAY\n" +
                "STAGE 1: DOWNLOAD DATA\n" +
                "A Crewmate assigned with Upload Data must go to the designated location to download data, which makes up the first stage. This process takes at least 8.7 seconds. On The Skeld, the first stage may be completed at: Cafeteria, Communications, Electrical, Navigation, or Weapons. On Polus, the first stage may be completed at: Electrical, O2, Office, Specimen Room, or Weapons. The download location is predetermined at the beginning of the game.\n" +
                "\n" +
                "STAGE 2: UPLOAD DATA\n" +
                "After completing the first stage, the Crewmate must then go to either Admin on The Skeld or Communications on Polus to upload data, which makes up the second stage. This process also takes at least 8.7 seconds.", R.drawable.downloaduploaddata));
        lstinfos.add(new LessonForm("Water Plants", "Water Plants is a long task in Among Us, completed on MIRA HQ.\n" +
                "\n" +
                "GAMEPLAY\n" +
                "The task involves retrieving a watering can from Storage and using it to water the plants in Greenhouse. The first part of Storage's task requires the player to find the watering can in a cabinet filled with other things, making the text \"Watering Can Get\" appear when you click on it. The location of the watering can is randomized. The task in Greenhouse requires you to click on the four plants to water them, making a small animation when you do so (the animation is only visible to yourself).", R.drawable.waterplants));

        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstinfos, taskslesson.this);
        pager.setAdapter(adapter);
    }
}
