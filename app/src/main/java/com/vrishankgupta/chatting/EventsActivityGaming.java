package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.vrishankgupta.chatting.SubEvents.AimBot;
import com.vrishankgupta.chatting.SubEvents.Querencia;


public class EventsActivityGaming extends AppCompatActivity {

    ImageView front_arrow,back_arrow,querencia,aimbot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_gaming);

        front_arrow = (ImageView) findViewById(R.id.front_arrow);
        back_arrow = (ImageView) findViewById(R.id.back_arrow);
        querencia = (ImageView) findViewById(R.id.querencia);
        aimbot = (ImageView) findViewById(R.id.aimbot);

        front_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityInformals.class));
                finish();
            }
        });

        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityAutomobile.class));
                finish();
            }
        });

        querencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Querencia.class));
            }
        });

        aimbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AimBot.class));
            }
        });
    }
}
