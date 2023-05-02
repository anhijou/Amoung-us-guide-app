package com.example.lesson;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.miwok.LessonForm;
import com.example.android.miwok.MyAdapter;
import com.example.android.miwok.R;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;

public class Ablitieslesson extends AppCompatActivity {
    /** Handles playback of all the sound files */
    private MediaPlayer mMediaPlayer;

    /** Handles audio focus when playing a sound file */
    private AudioManager mAudioManager;

    AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener =
            new AudioManager.OnAudioFocusChangeListener() {

                @Override
                public void onAudioFocusChange(int focusChange) {
                    if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                            focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                        // Pause playback
                        mMediaPlayer.pause();
                        mMediaPlayer.seekTo(0);
                    } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                        // Resume playback
                        mMediaPlayer.start();
                    } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                        // Stop playback
                        releaseMediaPlayer();
                    }
                }
            };

    /**
     * This listener gets triggered when the {@link MediaPlayer} has completed
     * playing the audio file.
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    /**
     * This listener gets triggered whenever the audio focus changes
     * (i.e., we gain or lose audio focus because of another app or device).
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson);

        // Create and setup the {@link AudioManager} to request audio focus
        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        final ArrayList<LessonForm> lstinfos = new ArrayList<LessonForm>();

        lstinfos.add(new LessonForm("Admin (ability)", "Admin is an ability in Among Us, which any player, including Ghosts, can use to get information about other players' locations.\n" +
                "\n" +
                "USAGE\n" +

                "When in the Admin room, clicking the button next to the map will show what room everyone is in, using Yellow to anonymize players. The map updates when someone changes rooms but does not show exact positions. It also does not reveal location info for the corridors or outside (for Polus). Impostors that are in a vent and dead bodies are also shown on the map. It is mainly used to verify the location of a Crewmate or Impostor.", R.drawable.adminability));
        lstinfos.add(new LessonForm("Customize", "Customize is an ability in Among Us, found in any game's lobby, and at spawn in Freeplay.\n" + "ACTION\n" +
                "Upon approaching the computer in any game's Lobby or by the starting point in Freeplay, you will see a \"Customize\" button with a computer icon in the bottom-right corner of your screen.\n" +
                "\n" +
                "OVERVIEW\n" +
                "Upon clicking the \"Customize\" button, A window will appear with skin, hat, color, pet, and game. In Freeplay, you can edit what tasks you have as well as whether you are The Impostor or not.", R.drawable.customize));
        lstinfos.add(new LessonForm("Doorlog", "The Doorlog is a security feature exclusive to MIRA HQ. It logs players who pass through the three sensors on the map. It is accessed from the Communications room.\n" + "USAGE\n" +
                "There are three sensors, located at each end of the center catwalk:\n" +
                "\n" +
                "The north sensor, flashing blue when activated.\n" +
                "The southwest sensor, flashing green when activated.\n" +
                "The southeast sensor, flashing orange when activated.\n" +
                "The sensor is activated when a player walks over the sensors. This can also trigger when the user stands completely still on the sensor, implying it is not motion activated.\n" +
                "\n" +
                "When a sensor is activated, there is a cooldown of 5 seconds before logging the user again. The cooldown only applies to one respective user; thus, the doorlog can detect multiple users as long as that respective user's cooldown on the sensor is available.\n" +
                "\n" +
                "The log holds a maximum of the 20 most recent events. Once full, the log will remove the oldest event to make room for the new one. The communications sabotage will also clear all entries, with the entries not being visible again once the sabotage is removed.", R.drawable.doorlog));
        lstinfos.add(new LessonForm("Emergency Meeting", "Emergency Meetings are events that occur once the Emergency Button is pressed or a dead body is reported. They are not the same as discussion time. During Emergency Meetings, players are teleported to either Cafeteria or Office, depending on the map, and are unable to move. This then goes to Discussion time. Emergency Meetings cannot be called via the Emergency Button during sabotages, excluding Door Sabotage.", R.drawable.emergency_meeting));
        lstinfos.add(new LessonForm("Kill", "Kill is an ability in Among Us, used only by Impostors. Killing is one of the main abilities used by Impostors to defeat the Crewmates and remain victorious.\n" +"USAGE\n" +
                "Only An Impostor can use the Kill ability, and it is used for killing Crewmates, turning them into Ghosts. The kill cooldown ranges from 10 to 60 seconds depending on room settings. Upon spawning in for the first time in the match, The Impostor's kill cooldown starts at 10 seconds. The kill distance may be short, medium, or long, depending on the options of the game. However, the kill cooldown pauses when The Impostor is in a vent, using security, doorlog, or vitals, or fixing a sabotage, and will only resume when such actions are stopped.\n" +
                "\n" +
                "When killing someone, The Impostor will teleport towards the target, slicing their body in half and leaving only a bone sticking out. The now-dead Crewmate will become a dead body, which Impostors or other Crewmates can report. Dead bodies will remain on the map until an Emergency Meeting is called, either by reporting a body or using the Emergency Button.\n" +
                "\n" +
                "Kill cannot bypass through walls or obstructions, as it works for a given distance in a straight line of sight, such that if there is an object between the Crewmate and Impostor, the kill option will be deactivated. Some objects do not count towards this.", R.drawable.kill));
        lstinfos.add(new LessonForm("Report", "Report is an ability in Among Us, usable by both Crewmates and Impostors. The \"R\" keybind can be used on PC to use the ability.\n" + "USAGE\n" +
                "The report button calls a meeting if a dead body is found. You must be within a certain distance from the body for a report to be used. When a body is reported, the game teleports every player into the main area of the map (like the Cafeteria or the emergency button) where nobody can move. The meeting makes every player capable of talking in the chat and voting for An Impostor. If a Crewmate or An Impostor sees a dead body, they can report it.", R.drawable.report));
        lstinfos.add(new LessonForm("Sabotage", "Sabotage is an ability in Among Us usable only by An Impostor or An Impostor's Ghost.\n" + "USAGE\n" +
                "Impostors can enact sabotages, which create temporary problems that Crewmates can either wait out, ignore, or fix. The sabotage button, located in the bottom right-hand corner of the screen, will open up a red map where different ways to sabotage the area can be chosen.\n" +
                "\n" +
                "Once the map is opened, The Impostor can choose a sabotage option they would like to do by clicking or tapping the desired sabotage button.\n" +
                "\n" +
                "Almost all types of sabotages will prevent the Emergency Button from being pressed, excluding Door Sabotage, though players can still report dead bodies, which will automatically repair most sabotages, excluding Door Sabotage on Polus, Fix Lights, and Comms Sabotage.\n" +
                "\n" +
                "Only one type of sabotage can be done at a time, except Door Sabotage while a different type of sabotage occurs. However, Polus is an exception to this rule, as the doors sabotaged stay permanently closed until opened by players by switching the right levers, while Impostors can still activate another door sabotage.", R.drawable.sabotage));
        lstinfos.add(new LessonForm("Security (ability)", "Security is an ability in Among Us, which can be used by anyone in Security to gain information about other players' locations.\n" +"USAGE\n" +
                "When accessed, Security displays fixed parts of the maps, usually corridors, in real-time, as if the player was there. They are unaffected by vision or Fix Lights, but Comms Sabotage disables them until they are fixed. Cameras can be used to know where players are moving, piece together the events preceding a kill, or even catch Impostors killing or using a vent on-screen.\n" +
                "\n" +
                "On the other hand, players using the cameras cannot move, see or hear their immediate surroundings, or report a body. Additionally, for Impostors, they cannot access sabotage and have their kill cooldown paused while they are watching the cameras.", R.drawable.securitybutton));
        lstinfos.add(new LessonForm("Use", "Use is an ability in Among Us, used by Crewmates, Impostors, and Crewmate Ghosts.\n" + "USAGE\n" +
                "Use is the main ability used by all players to interact with most objects throughout the map, excluding Impostor Ghosts. It is used to access tasks, fix sabotages, press the emergency button, and open Decontamination doors, even when dead as a Crewmate.\n" +
                "\n" +
                "The Use button will be replaced by specific buttons when players are near special abilities, such as Admin or doorlog. Additionally, Impostors have the sabotage button replacing it at all times (except when they're near a special ability, such as a sabotage fix). Ghosts can complete tasks with the Use button but cannot fix sabotages or call emergency meetings. The E or space key on PC is the keybind for the Use ability.", R.drawable.use));
        lstinfos.add(new LessonForm("Vent", "Vent is an ability in Among Us, usable by Impostors as a means of travel and hiding around the map.\n" + "USAGE\n" +
                "As An Impostor, when close enough to a vent, the sabotage button will be replaced with the vent button. If clicked, an animation shows the player jumping into the vent, an action visible to any other players in the vicinity on The Skeld and MIRA HQ. Once in the vents, arrows are displayed, pointing in the directions of connected vents. Hiding in the vents pauses both the player's kill and sabotage cooldowns until exited.", R.drawable.vent));
        lstinfos.add(new LessonForm("Vitals", "Vitals are an ability in Among Us that can be accessed on Polus. It can be used by all players regardless of role or whether or not they are alive.\n" + "USE\n" +
                "Vitals are found in Office on Polus. This ability is used to check players' vital signs to see who is alive, dead, or has disconnected. The players appear in the order that they joined the game.\n" +
                "\n" +
                "Vitals may be used to find Impostors who report the dead bodies of Crewmates they killed themselves.", R.drawable.vitals));

        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstinfos, Ablitieslesson.this);
        pager.setAdapter(adapter);

        View cardView =findViewById(R.id.cardview_id);

        // Set a click listener to play the audio when the list item is clicked on

    }

    @Override
    protected void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;

            // Regardless of whether or not we were granted audio focus, abandon it. This also
            // unregisters the AudioFocusChangeListener so we don't get anymore callbacks.
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }
}


