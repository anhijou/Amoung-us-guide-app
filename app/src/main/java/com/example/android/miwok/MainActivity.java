package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.category.ColorsActivity;
import com.example.lesson.Ablitieslesson;
import com.example.lesson.Gameplaylesson;
import com.example.lesson.Mapslesson;
import com.example.lesson.Tipslesson;
import com.example.lesson.taskslesson;
import com.example.lesson.Groupslesson;
import com.example.lesson.Locationslesson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        // Create and setup the {@link AudioManager} to request audio focus

        // Create a list of words
        final ArrayList<Category> words = new ArrayList<Category>();
        words.add(new Category( Gameplaylesson.class, R.drawable.gameplaylogo));
        words.add(new Category( Mapslesson.class, R.drawable.mapslogo));
        words.add(new Category( Groupslesson.class, R.drawable.groupslogo));
        words.add(new Category( ColorsActivity.class, R.drawable.skinslogo));
        words.add(new Category( Locationslesson.class, R.drawable.locations));
        words.add(new Category( Ablitieslesson.class, R.drawable.abilitieslogo));
        words.add(new Category( taskslesson.class, R.drawable.taskslogo));
        words.add(new Category( Tipslesson.class, R.drawable.tipslogo));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        CategoryAdapter adapter = new CategoryAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        RecyclerView listView = (RecyclerView) findViewById(R.id.recyclerview_id);
        listView.setLayoutManager(new GridLayoutManager(this,2));

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on

    }


}