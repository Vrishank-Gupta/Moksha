package com.vrishankgupta.chatting.eventsactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//import com.example.shivam.moksha.R;
import com.squareup.picasso.Picasso;
import com.vrishankgupta.chatting.R;

public class dance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance);

        ImageView one= (ImageView) findViewById(R.id.oorja);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/29103424_1632817573453487_6959728722001788928_n.jpg?oh=f51f853a0785c6d1268e6ec7afdfc765&oe=5B0450BF").into(one);
        Button regone= (Button) findViewById(R.id.oorjareg);
        regone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruleone= (Button) findViewById(R.id.oorjarule);
        ruleone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        ImageView two= (ImageView) findViewById(R.id.mudra);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t31.0-8/28238776_1422056901251107_2481792131482258738_o.jpg?oh=c4168f5efe18590d60c8f60242a7b5bc&oe=5B02A43D").into(two);
        Button regtwo= (Button) findViewById(R.id.mudrareg);
        regtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruletwo= (Button) findViewById(R.id.mudrarule);
        ruletwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        ImageView three= (ImageView) findViewById(R.id.kalakriti);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/28168301_1423963907727073_7662520239194071655_n.jpg?oh=0d59cd74ffdb21ee930cd59ecd301a3b&oe=5B49294A").into(three);
        Button regthree= (Button) findViewById(R.id.kalakritireg);
        regthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulethree= (Button) findViewById(R.id.kalakritirule);
        rulethree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





        ImageView four= (ImageView) findViewById(R.id.zephyr);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/29136257_1632794516789126_5848846954288644096_n.jpg?oh=0bb23de46af89d7490d1fc40729eff53&oe=5B3993F6").into(four);
        Button regfour= (Button) findViewById(R.id.zephyrreg);
        regfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulefour= (Button) findViewById(R.id.zephyrrule);
        rulefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





        ImageView five= (ImageView) findViewById(R.id.stepup);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/29137016_1632818600120051_2748068638899568640_n.jpg?oh=93aeb444de51ff6862152d02f09419e0&oe=5B318F2F").into(five);
        Button regfive= (Button) findViewById(R.id.stepupreg);
        regfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulefive= (Button) findViewById(R.id.stepuprule);
        rulefive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





    }
}
