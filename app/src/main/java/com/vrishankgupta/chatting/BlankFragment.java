package com.vrishankgupta.chatting;


import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    @SuppressLint("ValidFragment")
    public BlankFragment(Context context) {
        this.context = context;
        // Required empty public constructor
    }

    public BlankFragment() {
    }

    private String EVENT_DATE_TIME = "2018-03-26 08:59:59";
    private String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private LinearLayout linear_layout_1, linear_layout_2;
    private TextView tv_days, tv_hour, tv_minute, tv_second;
    private Handler handler = new Handler();
    private Runnable runnable;
    private Context context;
    ImageView one,two,three,four,five,six,seven,eight;
    View rootview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview=inflater.inflate(R.layout.fragment_blank, container, false);
        initUI();
        countDownStart();

        final VideoView vv = (VideoView) rootview.findViewById(R.id.video);

        //Video Loop
        vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                vv.start(); //need to make transition seamless.
            }
        });

        Uri uri = Uri.parse("http://nsitmoksha.com/video/medium.webm");

        vv.setVideoURI(uri);
        vv.requestFocus();
        vv.start();


        one= (ImageView) rootview.findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context,EventsActivityDance.class));
            }
        });

        two= (ImageView) rootview.findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context,EventsActivityTheatre.class));


            }
        });

        three= (ImageView) rootview.findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context,EventsActivityInformals.class));


            }
        });

        four= (ImageView) rootview.findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context,EventsActivityMusic.class));


            }
        });

        five= (ImageView) rootview.findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(context,EventsActivityLiterary.class));

            }
        });

        six= (ImageView) rootview.findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context,EventsActivityFashion.class));


            }
        });

        seven= (ImageView) rootview.findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context,EventsActivityGaming.class));

            }
        });

        eight= (ImageView) rootview.findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context,EventsActivityAutomobile.class));

            }
        });



        return rootview;
    }

    private void initUI() {
        linear_layout_1 = (LinearLayout) rootview.findViewById(R.id.linear_layout_1);
        linear_layout_2 = (LinearLayout) rootview.findViewById(R.id.linear_layout_2);
        tv_days = (TextView) rootview.findViewById(R.id.tv_days);
        tv_hour = (TextView) rootview.findViewById(R.id.tv_hour);
        tv_minute = (TextView) rootview.findViewById(R.id.tv_minute);
        tv_second = (TextView) rootview.findViewById(R.id.tv_second);
    }

    private void countDownStart() {
        runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    handler.postDelayed(this, 1000);
                    SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                    Date event_date = dateFormat.parse(EVENT_DATE_TIME);
                    Date current_date = new Date();
                    if (!current_date.after(event_date)) {
                        long diff = event_date.getTime() - current_date.getTime();
                        long Days = diff / (24 * 60 * 60 * 1000);
                        long Hours = diff / (60 * 60 * 1000) % 24;
                        long Minutes = diff / (60 * 1000) % 60;
                        long Seconds = diff / 1000 % 60;
                        //
                        tv_days.setText(String.format("%02d", Days));
                        tv_hour.setText(String.format("%02d", Hours));
                        tv_minute.setText(String.format("%02d", Minutes));
                        tv_second.setText(String.format("%02d", Seconds));
                    } else {
                        linear_layout_1.setVisibility(View.VISIBLE);
                        linear_layout_2.setVisibility(View.GONE);
                        handler.removeCallbacks(runnable);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 0);
    }

    public void onStop() {
        super.onStop();
    }
}









