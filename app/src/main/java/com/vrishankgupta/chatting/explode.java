package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import tyrantgit.explosionfield.ExplosionField;

public class explode extends AppCompatActivity {

    ImageView k,l;
    FrameLayout fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explode);


        k= (ImageView) findViewById(R.id.firstmoksha);
        l= (ImageView) findViewById(R.id.nsitfirst);
        fl= (FrameLayout) findViewById(R.id.first);



        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(k);
            }
        });


        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(l);
            }
        });


        fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(fl);
            }
        });




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                k.performClick();
                l.performClick();
                fl.performClick();
            }
        }, 1500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(explode.this,explode2.class));
                finish();
            }
        }, 2500);

    }
}
