package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.vrishankgupta.chatting.SubEvents.EveningBall;
import com.vrishankgupta.chatting.SubEvents.FakeOff;
import com.vrishankgupta.chatting.SubEvents.Kaleidoscope;
import com.vrishankgupta.chatting.SubEvents.Kismat;
import com.vrishankgupta.chatting.SubEvents.Nishad;
import com.vrishankgupta.chatting.SubEvents.OpenMic;
import com.vrishankgupta.chatting.SubEvents.Paint;


public class EventsActivityInformals extends AppCompatActivity {

    ImageView front_arrow,back_arrow,kismat,nishad,kaleidoscope,paint,open_mic,fake_off,evening_ball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_informals);
        front_arrow = (ImageView) findViewById(R.id.front_arrow);
        back_arrow = (ImageView) findViewById(R.id.back_arrow);
        kaleidoscope = (ImageView) findViewById(R.id.kaleidoscope);
        kismat = (ImageView) findViewById(R.id.kismat);
        nishad = (ImageView) findViewById(R.id.nishad);
        paint = (ImageView) findViewById(R.id.paint);
        open_mic = (ImageView) findViewById(R.id.open_mic);
        fake_off = (ImageView) findViewById(R.id.fake_off);
        evening_ball = (ImageView) findViewById(R.id.evening_ball);

        front_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityLiterary.class));
                finish();
            }
        });

        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityGaming.class));
                finish();
            }
        });

        kaleidoscope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Kaleidoscope.class));
            }
        });

        kismat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Kismat.class));
            }
        });

        nishad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Nishad.class));
            }
        });

        paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Paint.class));
            }
        });

        open_mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), OpenMic.class));
            }
        });

        fake_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FakeOff.class));
            }
        });

        evening_ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), EveningBall.class));
            }
        });
    }
}
