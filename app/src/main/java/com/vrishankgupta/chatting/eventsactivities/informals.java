package com.vrishankgupta.chatting.eventsactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//import com.example.shivam.moksha.R;
import com.squareup.picasso.Picasso;
import com.vrishankgupta.chatting.R;

public class informals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informals);

        ImageView one= (ImageView) findViewById(R.id.kismat);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/28377817_1428237563966374_596952465639616310_n.jpg?oh=e763ce8751d01b91713ebe030750b976&oe=5B06EE9A").into(one);
        Button regone= (Button) findViewById(R.id.kismatreg);
        regone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruleone= (Button) findViewById(R.id.kismatrule);
        ruleone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        ImageView two= (ImageView) findViewById(R.id.nishad);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/28379162_1425212357602228_3363857512596855741_n.jpg?oh=54413d3dc9ba9b772899b596cc391bc1&oe=5B2FF635").into(two);
        Button regtwo= (Button) findViewById(R.id.nishadreg);
        regtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruletwo= (Button) findViewById(R.id.nishadrule);
        ruletwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        ImageView three= (ImageView) findViewById(R.id.Kaleidoscope);
        Picasso.get().load("").into(three);
        Button regthree= (Button) findViewById(R.id.Kaleidoscopereg);
        regthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulethree= (Button) findViewById(R.id.Kaleidoscoperule);
        rulethree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





        ImageView four= (ImageView) findViewById(R.id.stone);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/28279884_1428242313965899_7741777045923217201_n.jpg?oh=948b924d87c7bf15c7447fd141b35c5c&oe=5B427066").into(four);
        Button regfour= (Button) findViewById(R.id.stonereg);
        regfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulefour= (Button) findViewById(R.id.stonerule);
        rulefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





        ImageView five= (ImageView) findViewById(R.id.fakeoff);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t31.0-8/28617041_1428235113966619_484701304006722_o.jpg?oh=7b809c08e0b691f82099680a150f0172&oe=5B3734EE").into(five);
        Button regfive= (Button) findViewById(R.id.fakeoffreg);
        regfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulefive= (Button) findViewById(R.id.fakeoffrule);
        rulefive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





        ImageView six= (ImageView) findViewById(R.id.openmic);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/28378394_760480360828669_8224232378485935456_n.jpg?oh=3bf2f7fbf3261aeeca794868593ff8f7&oe=5B40E98F").into(six);
        Button regfsix= (Button) findViewById(R.id.openmicreg);
        regfsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulesix= (Button) findViewById(R.id.openmicrule);
        rulesix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        ImageView seven= (ImageView) findViewById(R.id.eveningball);
        Picasso.get().load("https://scontent.fdel1-3.fna.fbcdn.net/v/t1.0-9/28168493_1422084374581693_2440377144666000795_n.jpg?oh=50e6511d5527e1a115a464699913376d&oe=5B4692C3").into(seven);
        Button regseven= (Button) findViewById(R.id.eveningballreg);
        regseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruleseven= (Button) findViewById(R.id.eveningballrule);
        ruleseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
