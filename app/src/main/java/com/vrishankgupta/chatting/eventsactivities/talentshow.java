package com.vrishankgupta.chatting.eventsactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//import com.example.shivam.moksha.R;
import com.squareup.picasso.Picasso;
import com.vrishankgupta.chatting.R;

public class talentshow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talentshow);


        ImageView one= (ImageView) findViewById(R.id.rouge);
        Picasso.get().load("https://scontent.fdel1-3.fna.fbcdn.net/v/t1.0-9/28168144_1422387697884694_1689956780485192734_n.jpg?oh=a6bce8aa3f16128f9faca191f1182d9a&oe=5B3BCA63").into(one);
        Button regone= (Button) findViewById(R.id.rougereg);
        regone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruleone= (Button) findViewById(R.id.rougerule);
        ruleone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        ImageView two= (ImageView) findViewById(R.id.MOKSHAGotTalent);
        Picasso.get().load("https://scontent.fdel1-3.fna.fbcdn.net/v/t1.0-9/28575992_629124020752939_8598974729358934016_n.jpg?oh=1cb955df7c27756d525c8c5b974a84e7&oe=5B3C088A").into(two);
        Button regtwo= (Button) findViewById(R.id.MOKSHAGotTalentreg);
        regtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruletwo= (Button) findViewById(R.id.MOKSHAGotTalentrule);
        ruletwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        ImageView three= (ImageView) findViewById(R.id.MrMsMoksha);
        Picasso.get().load("https://scontent.fdel1-3.fna.fbcdn.net/v/t1.0-9/28468416_1635123029887824_6718806671731497760_n.jpg?oh=e49aabcfa255193fa3fae656c1102ea8&oe=5B4E142C").into(three);
        Button regthree= (Button) findViewById(R.id.MrMsMokshareg);
        regthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulethree= (Button) findViewById(R.id.MrMsMoksharule);
        rulethree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });






    }
}
