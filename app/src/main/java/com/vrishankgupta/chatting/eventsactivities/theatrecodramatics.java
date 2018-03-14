package com.vrishankgupta.chatting.eventsactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//import com.example.shivam.moksha.R;
import com.squareup.picasso.Picasso;
import com.vrishankgupta.chatting.R;

public class theatrecodramatics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theatrecodramatics);

        ImageView one= (ImageView) findViewById(R.id.soch);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/28468213_1422220151234782_3091981690932370202_n.jpg?oh=fc5637b76790e2247a1dab34f3dfd4a4&oe=5B3868BB").into(one);
        Button regone= (Button) findViewById(R.id.sochreg);
        regone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruleone= (Button) findViewById(R.id.sochrule);
        ruleone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        ImageView two= (ImageView) findViewById(R.id.parwaaz);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/28279705_1422063527917111_9037053676073153324_n.jpg?oh=ab115fccc30278c701bbacc73f4fdb87&oe=5B47B08F").into(two);
        Button regtwo= (Button) findViewById(R.id.parwaazreg);
        regtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruletwo= (Button) findViewById(R.id.parwaazrule);
        ruletwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
