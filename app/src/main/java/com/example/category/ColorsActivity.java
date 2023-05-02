/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.category;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


import com.example.android.miwok.R;
import com.example.lesson.Locationslesson;
import com.example.lesson.color.Colorslesson;
import com.example.lesson.color.Hatslesson;
import com.example.lesson.color.Petslesson;
import com.example.lesson.color.Skinslesson;
import com.example.lesson.taskslesson;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.courlist);

        // Find the View that shows the numbers category
        TextView colors = (TextView) findViewById(R.id.colors);

        // Set a click listener on that View
        colors.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Colorslesson}
                Intent colorsIntent = new Intent(ColorsActivity.this, Colorslesson.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the family category
        TextView hats = (TextView) findViewById(R.id.hats);

        // Set a click listener on that View
        hats.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Locationslesson}
                Intent hatsIntent = new Intent(ColorsActivity.this, Hatslesson.class);

                // Start the new activity
                startActivity(hatsIntent);
            }
        });

        // Find the View that shows the colors category
        TextView pets = (TextView) findViewById(R.id.pets);

        // Set a click listener on that View
        pets.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Locationslesson}
                Intent petsIntent = new Intent(ColorsActivity.this, Petslesson.class);

                // Start the new activity
                startActivity(petsIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView skins = (TextView) findViewById(R.id.skins);

        // Set a click listener on that View
        skins.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Locationslesson}
                Intent skinsIntent = new Intent(ColorsActivity.this, Skinslesson.class);

                // Start the new activity
                startActivity(skinsIntent);
            }
        });
    }

}

