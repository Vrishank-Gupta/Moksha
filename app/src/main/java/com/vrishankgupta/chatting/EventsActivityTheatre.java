package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.vrishankgupta.chatting.SubEvents.Parwaaz;
import com.vrishankgupta.chatting.SubEvents.Soch;


public class EventsActivityTheatre extends AppCompatActivity {

    ImageView back_arrow,soch,parwaz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_theatre);

        back_arrow = (ImageView) findViewById(R.id.back_arrow);
        soch = (ImageView) findViewById(R.id.soch);
        parwaz = (ImageView) findViewById(R.id.parwaaz);


        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityMusic.class));
                finish();
            }
        });

        soch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Soch.class));
            }
        });

        parwaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Parwaaz.class));
            }
        });
    }
}
