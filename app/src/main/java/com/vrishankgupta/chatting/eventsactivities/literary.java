package com.vrishankgupta.chatting.eventsactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//import com.example.shivam.moksha.R;
import com.squareup.picasso.Picasso;
import com.vrishankgupta.chatting.R;

public class literary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literary);

        ImageView one= (ImageView) findViewById(R.id.alfazz);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/29186150_2116088158614230_8184936759583309824_n.jpg?oh=e80c2bb34475f497d572256d05a0acb0&oe=5B044375").into(one);
        Button regone= (Button) findViewById(R.id.alfazzreg);
        regone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruleone= (Button) findViewById(R.id.alfazzrule);
        ruleone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        ImageView two= (ImageView) findViewById(R.id.khayal);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t31.0-8/28514471_1430474427076021_4403447066839303082_o.jpg?oh=eadeaa22154ac0265d9ce6ff136e7e05&oe=5B4876E2").into(two);
        Button regtwo= (Button) findViewById(R.id.khayalreg);
        regtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruletwo= (Button) findViewById(R.id.khayalrule);
        ruletwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        ImageView three= (ImageView) findViewById(R.id.verbhum);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/28377817_1424340247689439_4802083651734998889_n.jpg?oh=dd6c6a3a375ce20e877bc946f48deb46&oe=5B37C7ED").into(three);
        Button regthree= (Button) findViewById(R.id.verbhumreg);
        regthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulethree= (Button) findViewById(R.id.verbhumrule);
        rulethree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





        ImageView four= (ImageView) findViewById(R.id.afsaana);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/28276454_760481124161926_2311022322635240421_n.jpg?oh=2f65f063f260e8144b7f796dcb3adc65&oe=5B4DD8D0").into(four);
        Button regfour= (Button) findViewById(R.id.afsaanareg);
        regfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulefour= (Button) findViewById(R.id.afsaanarule);
        rulefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





        ImageView five= (ImageView) findViewById(R.id.bhramastra);
        Picasso.get().load("https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/28576032_760478804162158_977696355704624559_n.jpg?oh=66732c77f7559c25e27f5ca3f83e1942&oe=5B477B3A").into(five);
        Button regfive= (Button) findViewById(R.id.bhramastrareg);
        regfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button rulefive= (Button) findViewById(R.id.bhramastrarule);
        rulefive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });






    }
}
