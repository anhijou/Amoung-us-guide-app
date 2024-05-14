ypackage com.example.lesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.miwok.LessonForm;
import com.example.android.miwok.MyAdapter;
import com.example.android.miwok.R;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;

public class Tipslesson extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson);

        ArrayList<LessonForm> lstinfos = new ArrayList<LessonForm>();

        lstinfos.add(new LessonForm("Fake tasks (properly!)", "The first step in becoming an S-Tier Impostor, is by faking many tasks. Only Crewmates can complete tasks, so faking one when other players are near can give you an alibi. To fake a task, stand still in the task spot and wait a bit. Try to leave just after the task bar in the upper left corner fills up, to prove that you really did it. Note that many players will be doing tasks in early game, so you will have many chances to fake them perfectly. \n" +
                "\n" +
                "Be careful not to ‘finish’ your task too early though! While most tasks do not take more than a few seconds to complete, there are several long ones. An experienced Crewmate will become suspicious if you pretend to do a long task in two seconds. It is therefore useful to learn which tasks are long ones, and which ones are short. Finally, you should stay clear of the tasks that are visible, as you can’t fake those.", R.drawable.faketasks));





        lstinfos.add(new LessonForm("Use the Admin Room Cameras", "Knowledge is power! Inside the Admin room, you can use the security cameras and a map will appear and show the locations of all players currently on the map.\n" +
                "\n" +
                "If you monitor who goes into a room, it may also lead you to find out who the killer is, and act as a key piece of evidence when you accuse someone during the open chat meeting.", R.drawable.usetheadminroomcameras));








        lstinfos.add(new LessonForm("Kill immune players immediately", "Not being able to fake certain visual tasks means that when a Crewmate completes these visual task in front of others, they are 100% in the clear. If you're the Impostor then the choice is between you and them: if they accuse you, you will lose the game. In other words, you must kill immune players as soon as possible. \n" +
                "\n" +
                "It is important to kill immune players quickly. Don’t take your time and kill other Crewmates first, because that will only increase your chances of becoming the prime suspect. But don’t be reckless either: if you’re up against experienced Crewmates, they may be shadowing the immune player to see if the Impostor reveals himself. Use sabotage to isolate the immune player.", R.drawable.killimmuneplayersimmediately));



        lstinfos.add(new LessonForm("If you're Unsure, Skip the Vote!", "Remember: if you act based on weak evidence, the odds are against you. Most games only have 1 or 2 Impostors and if you vote off a Crewmate, you send them into deadly space, ending their life aboard the ship. This is a free kill for the Impostor(s), so skip the vote when there is little to no proof on who killed whom.\n" +
                "\n" +
                "Quick Tip: After you die, you can still help your team by completing tasks but you can no longer talk with your team.", R.drawable.ifyoureunsure ));





        lstinfos.add(new LessonForm("Act like a Crewmate", "Talk, vote and accuse as if you were a Crewmate. Be as honest as possible about your own whereabouts, and don’t be too aggressive. If you start yelling “it’s blue!” without a good reason, others will look at you with suspicion. Even if your early game aggression leads to another players eviction, you will have drawn attention to yourself and likely be next to go. \n" +
                "\n" +
                "Furthermore, Crewmates are less inclined to suspect you if they think you’re a bit of a noob. An occasional “who should I vote for?” or “I don’t know the name of the room” are subtle ways to help you achieve this. But do not exaggerate; players who continuously emphasize that this is “my first time playing, please don’t kill me” are bound to get voted out. ", R.drawable.actlikeacrewmate));





        lstinfos.add(new LessonForm("Take initiative", "You want to stir the conversation in the right direction, so don’t wait for things to go wrong. After a murder, you might want to casually ask another player where he came from, or what tasks he did. Crewmates cast accusations all the time, so joining in is not necessarily suspicious. If you do so early on, Crewmates may pick up on your accusation and start suspecting your victim.\n" +
                "\n" +
                "This rule is even more important when you encounter a witness. If another player saw you near a dead body or even kill someone, you know they are going to accuse you. A defensive position is usually not a strong one, so try to either accuse them first or explain yourself before they get the chance. For example, if Pink saw you walking close to the body before he reported, subtly mention that it was not Pink, as you both just walked into the room where the body was found. If Pink then starts questioning you, you have already explained yourself and are therefore more reliable.", R.drawable.takeinitiative));





        lstinfos.add(new LessonForm("Quickly Fix Sabotages", "Be proactive when it comes to fixing the sabotage event if you wait for another Crewmate to do it, it may be too late. Waiting until the last moment only gives the Impostor the chance to set up their trap and kill you. If no one completes the sabotaged task sometimes the game will end depending on the severity of the sabotage.", R.drawable.quicklyfixsabotages ));







        lstinfos.add(new LessonForm("Help Crewmates (but not really)", "Naturally, you want the crew members to eject as many of their own as possible. But in early game especially, your priority is to build up your own credibility. Covering for another player may therefore be a wise move. A phrase like “I think I saw pink complete a task, he is clear” will make you look trustworthy. With any luck, the player you covered for will remember that and be less inclined to vote you out later in the game.\n" +
                "\n" +
                "Additionally, it can be wise to save an innocent player from elimination. If you create a tie between two Crewmates, the next round is still all about them. The Crewmates are wasting Meetings while you remain in the clear.", R.drawable.helpcrewmatesbutnotreally));





        lstinfos.add(new LessonForm("Crowd kill", "When at least four players are standing on the same spot and one of them gets stabbed to death, it is very hard to determine who the killer was. You, as an Impostor, should make use of that.\n" +
                "\n" +
                "So how do you get enough players in one place? As the numbers dwindle, it will be more and more difficult to find such a crowded area. But in early game you can, for example, sabotage the reactor. With some luck, many players will gather in the same spot to fix it. Pretend to be running to fix the reactor alongside them, wait a few seconds while everyone gets started, and then strike. Don’t forget to act surprised!", R.drawable.crowdkill));





        lstinfos.add(new LessonForm("Know the Map and Tasks", "When you are discussing with your Crewmates who the Impostor is or where the body was found, you need to know the map and the names of the locations. It is very important that you can also name the different tasks or at least describe them.\n" +
                "\n" +
                "Knowing the map and tasks will allow you to provide an alibi for yourself and inform others of the location of the body.", R.drawable.knowthemapandtasks ));






        lstinfos.add(new LessonForm("Vent multi-kill", "Much like a crowd kill, you can use your sabotaging skills to lure people away from a crime scene and keep them from reporting the body. Want to do a vent multi-kill? Start by waiting for your victim inside a vent, then kill, sabotage, and jump back in. Once Crewmates fix the sabotage and your second victim walks in, jump out and kill them before they can report the body. \n" +
                "\n" +
                "Note that this will only work in early game and not for an unlimited number of times, as your absence in the emergency area may get noticed.", R.drawable.ventmultikill));




        lstinfos.add(new LessonForm("Mind the cameras", "Impostors often overlook the presence of cameras on the Skeld and Polus maps. A Crewmate watching the cameras might see you stab someone, so beware. You can see several cameras hanging on the walls of both maps. If you see a blinking red light, you know someone is watching you. So don’t stab the next Crewmate that comes along.\n" +
                "\n" +
                "The cameras are not just there to hinder you though. Crewmates watching the cameras can’t see other players next to them, so if you see those little red lights, it may be time to pay the security room a visit. Furthermore, you can pretend to be a Crewmate by watching the cameras yourself.", R.drawable.mindthecameras));







        lstinfos.add(new LessonForm("Keep track of the numbers", "This is very important. If one more kill brings the number of Crewmates down to the same number as the Impostors, you have won the game! Just kill another Crewmate as quickly as you can. \n" +
                "\n" +
                "Quite often, Crewmates are not even aware of this. However, if they are a bit more experienced, they will try to call an emergency meeting as soon as possible to prevent the Impostor from making their final kill. The best way to fix this problem is by sabotaging immediately. During a sabotage, Crewmates can’t call an emergency meeting and are forced to walk over to a certain spot. All you have to do is wait for them to meet their fate.", R.drawable.keeptrackofthenumbers));






        lstinfos.add(new LessonForm("Pretend to be AFK", "We’re not saying that this is the most honorable way to win, but it is an entertaining one. Just stand still and wait. Others will notice you’re not moving, assume you’re AFK, and leave you alone. When a player comes in range, walk towards them and quickly kill them. Then go back to the exact same spot you were in. You will be surprised how many players buy into this tactic.\n" +
                "\n" +
                "Unfortunately, this is unlikely to work a second time in the same group of players. But if you’re playing with a group of friends and want to make memories that last a lifetime… Being the ultimate Impostor-troll is the way to do it.", R.drawable.pretendtobeafk));







        lstinfos.add(new LessonForm("Do your Tasks in Pairs", "Among Us is all about being able to account for your whereabouts, so a buddy system is a good and simple way to safely move throughout the spaceship as Crewmates.\n" +
                "\n" +
                "The Impostor can’t kill you both, but if you are playing with more than one killer, then beware if two or more assassins come running towards you. To counter this, avoid other pairs of players and keep in mind that the Impostor has a cooldown on their kill button.", R.drawable.doyourtasksinpairs));







        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstinfos, Tipslesson.this);
        pager.setAdapter(adapter);
    }
}
