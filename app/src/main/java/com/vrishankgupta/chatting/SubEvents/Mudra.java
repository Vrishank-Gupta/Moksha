package com.vrishankgupta.chatting.SubEvents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.vrishankgupta.chatting.R;

public class Mudra extends AppCompatActivity {

    Button regButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mudra_details);

        regButton = (Button) findViewById(R.id.regButton);


        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "https://shubhampriyadarshi37.typeform.com/to/QXhDGr?typeform-embed=embed-widget";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(a));
                startActivity(i);
            }
        });
    }



}
