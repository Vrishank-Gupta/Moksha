package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import tyrantgit.explosionfield.ExplosionField;

public class explode2 extends AppCompatActivity {

    ImageView a,b,c,d,e,f,g,h,i,j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explode2);

        a= (ImageView) findViewById(R.id.imageView3);
        b= (ImageView) findViewById(R.id.imageView4);
        c= (ImageView) findViewById(R.id.imageView5);
        d= (ImageView) findViewById(R.id.imageView6);
        e= (ImageView) findViewById(R.id.imageView7);
        f= (ImageView) findViewById(R.id.imageView8);
        g= (ImageView) findViewById(R.id.imageView9);
        h= (ImageView) findViewById(R.id.imageView10);
        i= (ImageView) findViewById(R.id.imageView11);
        j= (ImageView) findViewById(R.id.imageView12);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode2.this);
                explosionField.explode(a);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode2.this);
                explosionField.explode(b);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode2.this);
                explosionField.explode(c);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode2.this);
                explosionField.explode(d);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode2.this);
                explosionField.explode(e);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode2.this);
                explosionField.explode(f);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode2.this);
                explosionField.explode(g);
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode2.this);
                explosionField.explode(h);
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode2.this);
                explosionField.explode(i);
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode2.this);
                explosionField.explode(j);
            }
        });



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                a.performClick();
                b.performClick();
                c.performClick();
                d.performClick();
                e.performClick();
                f.performClick();
                g.performClick();
                h.performClick();
                i.performClick();
                j.performClick();

            }
        }, 2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                finish();
            }
        },2500);

    }
}
