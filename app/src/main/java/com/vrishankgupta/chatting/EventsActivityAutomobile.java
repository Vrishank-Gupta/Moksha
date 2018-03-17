package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.vrishankgupta.chatting.SubEvents.Motorsport;


public class EventsActivityAutomobile extends AppCompatActivity {

    ImageView front_arrow,back_arrow,motorsport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_automobile);
        front_arrow = (ImageView) findViewById(R.id.front_arrow);
        back_arrow = (ImageView) findViewById(R.id.back_arrow);
        motorsport = (ImageView) findViewById(R.id.motorsport);

        front_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityGaming.class));
                finish();
            }
        });

        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                startActivity(new Intent(getApplicationContext(),EventsActivityFashion.class));
                finish();
            }
        });

        motorsport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Motorsport.class));

            }
        });

    }

}
