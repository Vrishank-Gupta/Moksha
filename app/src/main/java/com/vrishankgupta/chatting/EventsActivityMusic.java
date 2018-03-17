package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.vrishankgupta.chatting.SubEvents.Avalanche;
import com.vrishankgupta.chatting.SubEvents.Harmony;
import com.vrishankgupta.chatting.SubEvents.Melody;
import com.vrishankgupta.chatting.SubEvents.Symphony;
import com.vrishankgupta.chatting.SubEvents.Tarang;
import com.vrishankgupta.chatting.SubEvents.Voice;


public class EventsActivityMusic extends AppCompatActivity {

    ImageView front_arrow,back_arrow,voice,melody,symphony,harmony,tarang,avalanche;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_music);
        front_arrow = (ImageView) findViewById(R.id.front_arrow);
        back_arrow = (ImageView) findViewById(R.id.back_arrow);
        voice = (ImageView) findViewById(R.id.voice);
        melody = (ImageView) findViewById(R.id.melody);
        symphony = (ImageView) findViewById(R.id.symphony);
        harmony = (ImageView) findViewById(R.id.harmony);
        tarang = (ImageView) findViewById(R.id.tarang);
        avalanche = (ImageView) findViewById(R.id.avalanche);


        front_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityTheatre.class));
                finish();
            }
        });


        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityLiterary.class));
                finish();
            }
        });

        voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Voice.class));
            }
        });

        melody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Melody.class));
            }
        });

        symphony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Symphony.class));
            }
        });
        harmony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Harmony.class));
            }
        });

        tarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Tarang.class));
            }
        });

        avalanche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Avalanche.class));
            }
        });
    }
}
