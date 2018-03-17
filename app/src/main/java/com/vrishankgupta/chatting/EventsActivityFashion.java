package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.vrishankgupta.chatting.SubEvents.MrMoksha;
import com.vrishankgupta.chatting.SubEvents.Rogue;
import com.vrishankgupta.chatting.SubEvents.Talent;


public class EventsActivityFashion extends AppCompatActivity {

    ImageView front_arrow,back_arrow,rogue,mr_moksha,talent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_fashion);

        front_arrow = (ImageView) findViewById(R.id.front_arrow);
        back_arrow = (ImageView) findViewById(R.id.back_arrow);
        rogue = (ImageView) findViewById(R.id.rogue);
        mr_moksha = (ImageView) findViewById(R.id.mr_moksha);
        talent = (ImageView) findViewById(R.id.talent);

        front_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityAutomobile.class));
                finish();
            }
        });


        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityDance.class));
                finish();
            }
        });


        rogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Rogue.class));
            }
        });

        mr_moksha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MrMoksha.class));
            }
        });

        talent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Talent.class));
            }
        });
    }
}
