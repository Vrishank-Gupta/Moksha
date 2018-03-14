package com.vrishankgupta.chatting.eventsactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//import com.example.shivam.moksha.R;
import com.squareup.picasso.Picasso;
import com.vrishankgupta.chatting.R;

public class music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);


        ImageView one= (ImageView) findViewById(R.id.avalanche);
        Picasso.get().load("https://scontent.fdel1-3.fna.fbcdn.net/v/t1.0-9/29177145_888919411289859_3785365848621842432_n.jpg?oh=b6e1e02348c33804dbc38f61b20c7900&oe=5B3E9CAD").into(one);
        Button regone= (Button) findViewById(R.id.avalanchereg);
        regone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruleone= (Button) findViewById(R.id.avalancherule);
        ruleone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        ImageView two= (ImageView) findViewById(R.id.voice);
        Picasso.get().load("https://scontent.fdel1-3.fna.fbcdn.net/v/t31.0-8/28235626_1423043437819120_988542386588621120_o.jpg?oh=a5cd947fa089c17f10fba96aba1febc0&oe=5B3849A8").into(two);
        Button regtwo= (Button) findViewById(R.id.voicereg);
        regtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruletwo= (Button) findViewById(R.id.voicerule);
        ruletwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        ImageView three= (ImageView) findViewById(R.id.harmony);
        Picasso.get().load("https://scontent.fdel1-3.fna.fbcdn.net/v/t1.0-9/28276320_1423015527821911_4094760841174407459_n.jpg?oh=1de87ff3c231bd02718ae0090c934df4&oe=5B2F72A6").into(three);
        Button regthree= (Button) findViewById(R.id.harmonyreg);
        regthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulethree= (Button) findViewById(R.id.harmonyrule);
        rulethree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





        ImageView four= (ImageView) findViewById(R.id.symphony);
        Picasso.get().load("https://scontent.fdel1-3.fna.fbcdn.net/v/t1.0-9/28167870_1423972871059510_7479444026657867464_n.jpg?oh=6a11344816a96768b2dcd9af4795e7e0&oe=5B0279A9").into(four);
        Button regfour= (Button) findViewById(R.id.symphonyreg);
        regfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulefour= (Button) findViewById(R.id.symphonyrule);
        rulefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





        ImageView five= (ImageView) findViewById(R.id.melody);
        Picasso.get().load("https://scontent.fdel1-3.fna.fbcdn.net/v/t1.0-9/28279333_1423981454391985_3223894956468370212_n.jpg?oh=40b310edd75e6d238bdbfa6d1e142ed8&oe=5AFFA1DE").into(five);
        Button regfive= (Button) findViewById(R.id.melodyreg);
        regfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulefive= (Button) findViewById(R.id.melodyrule);
        rulefive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





        ImageView six= (ImageView) findViewById(R.id.tarang);
        Picasso.get().load("https://scontent.fdel1-3.fna.fbcdn.net/v/t1.0-9/28378456_1423060474484083_753804708111043839_n.jpg?oh=d4e4170c986f5d42f3b8813ec8ceefb2&oe=5B400185").into(six);
        Button regfsix= (Button) findViewById(R.id.tarangreg);
        regfsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulesix= (Button) findViewById(R.id.tarangrule);
        rulesix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });






    }
}
