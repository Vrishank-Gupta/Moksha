package com.vrishankgupta.chatting.fragments;


import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
//
//import com.example.shivam.moksha.R;
//import com.example.shivam.moksha.adaptors.adaptorevents;
//import com.example.shivam.moksha.classes.sponsorsandteamclass;

import com.vrishankgupta.chatting.R;
import com.vrishankgupta.chatting.adaptors.adaptorevents;
import com.vrishankgupta.chatting.classes.sponsorsandteamclass;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class sponsorsandteam extends Fragment {

Context context;
int type;
    @SuppressLint("ValidFragment")
    public sponsorsandteam(Context context, int type) {
        // Required empty public constructor
    this.context=context;
    this.type=type;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootview=inflater.inflate(R.layout.fragment_sponsorsandteam, container, false);
        ArrayList<sponsorsandteamclass> arrayList = new ArrayList<>();
        adaptorevents adaptorevents;

        if(type==0) {
            arrayList.add(new sponsorsandteamclass("https://scontent.fdel1-1.fna.fbcdn.net/v/t1.0-9/fr/cp0/e15/q65/1558431_1392231414369482_1362820321_n.jpg?efg=eyJpIjoidCJ9&oh=d69bb3473200d7a7bc74fec71acf528e&oe=5B444A7F", "RAHUL GUPTA\n **Chief Convener**"));
            arrayList.add(new sponsorsandteamclass("https://scontent.fdel1-1.fna.fbcdn.net/v/t1.0-9/fr/cp0/e15/q65/11707793_871730829584231_1696129217294019250_n.jpg?efg=eyJpIjoidCJ9&oh=1266ea6db0f4ad8b343d6bcd6e26a81e&oe=5B31709D", "VAIBHAV\n **Co Convener**"));
            arrayList.add(new sponsorsandteamclass("https://scontent.fdel1-1.fna.fbcdn.net/v/t1.0-9/fr/cp0/e15/q65/27073165_1326374330801619_7646838963075960629_n.jpg?efg=eyJpIjoidCJ9&oh=9d9d1ea4c38c417eea947c0c7854bd0e&oe=5B01259F", "SHIVANSHU SINGHANIA\n **General Secretary**"));
            arrayList.add(new sponsorsandteamclass("https://scontent.fdel1-1.fna.fbcdn.net/v/t31.0-8/fr/cp0/e15/q65/12909485_1581702945490549_5068093847715805497_o.jpg?efg=eyJpIjoidCJ9&oh=2f4a0960dc01f40a7dadd1da738aae95&oe=5B36DB26", "NAMRATA AGARWAL\n **Joint General Secretary**"));
            arrayList.add(new sponsorsandteamclass("https://scontent.fdel1-1.fna.fbcdn.net/v/t31.0-8/fr/cp0/e15/q65/20045409_1612620712135193_5911635883138312247_o.jpg?efg=eyJpIjoidCJ9&oh=be0661ffee422093572a26408d7e2295&oe=5B371986", "NISHANT SONI\n **Head Event Management**"));
            arrayList.add(new sponsorsandteamclass("https://scontent.fdel1-1.fna.fbcdn.net/v/t31.0-8/fr/cp0/e15/q65/16422625_1109191815855948_3832624273726144591_o.jpg?efg=eyJpIjoidCJ9&oh=191208ebe0ce15f97b919e1bca1c965b&oe=5B489A0C", "TUSHAR KUMAR\n **Head Sponsorship+Logistic**"));
            arrayList.add(new sponsorsandteamclass("https://scontent.fdel1-1.fna.fbcdn.net/v/t1.0-9/fr/cp0/e15/q65/13686730_311273209208619_3229156084397518680_n.jpg?efg=eyJpIjoidCJ9&oh=086ea61c9bbaefa2e8f5722795160da7&oe=5B05AC49", "YAMIN ARORA\n **Head Public Relations(PR-1)**"));
            arrayList.add(new sponsorsandteamclass("https://scontent.fdel1-1.fna.fbcdn.net/v/t31.0-8/fr/cp0/e15/q65/16487114_1461943850482274_3783056129365682971_o.jpg?efg=eyJpIjoidCJ9&oh=fcd8e1e0605584f1fbb1eef4a34dd15f&oe=5B481084", "MAHIMA VERMA\n **Head Public Relations(PR-2)**"));
            arrayList.add(new sponsorsandteamclass("https://scontent.fdel1-1.fna.fbcdn.net/v/t31.0-8/fr/cp0/e15/q65/12819377_973526816062825_3374330009018921755_o.jpg?efg=eyJpIjoidCJ9&oh=21a4c070ae008c9aea60603d41734833&oe=5B04C6B5", "MOHIT YADAV\n **Head Security**"));
             adaptorevents=new adaptorevents(arrayList,context,0);
        }
        else {
            arrayList.add(new sponsorsandteamclass("https://www.hul.co.in/Images/lakme-logo-new_tcm1255-515879_w210.png", ""));
            arrayList.add(new sponsorsandteamclass("https://logos.textgiraffe.com/logos/logo-name/Javed-designstyle-kiddo-m.png", ""));
            arrayList.add(new sponsorsandteamclass("https://d1bj9m7vro2dcz.cloudfront.net/mp_197328_2017-08-05-13-00-14-000313.png", ""));
           // arrayList.add(new sponsorsandteamclass("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAUAAAAAzCAYAAADmUdFxAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyJpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBNYWNpbnRvc2giIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6MUFGM0RCNzQ1MzNEMTFFMjgyNjZDOTI3NTk0M0FBNzYiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6MUFGM0RCNzU1MzNEMTFFMjgyNjZDOTI3NTk0M0FBNzYiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDoxRDlDMDZFQjUzMkIxMUUyODI2NkM5Mjc1OTQzQUE3NiIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDoxRDlDMDZFQzUzMkIxMUUyODI2NkM5Mjc1OTQzQUE3NiIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/Ppjm+zgAABULSURBVHja7J1NjBzH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", ""));
            arrayList.add(new sponsorsandteamclass("https://codingblocks.com/assets/images/cb/cblogo.png", ""));
            arrayList.add(new sponsorsandteamclass("https://static.wixstatic.com/media/f5cdea_daff6a663c354369aed59cb441060e1e~mv2_d_3189_2362_s_2.jpg/v1/crop/x_493,y_74,w_2255,h_2182/fill/w_216,h_211,al_c,q_80,usm_0.66_1.00_0.01/f5cdea_daff6a663c354369aed59cb441060e1e~mv2_d_3189_2362_s_2.webp", "BIGCOMPUTERS"));
            //arrayList.add(new sponsorsandteamclass("",""));
            arrayList.add(new sponsorsandteamclass("http://eventfulinc.com/wp-content/themes/eventful/_assets/img/logoNew.png", ""));
            arrayList.add(new sponsorsandteamclass("https://assets-cdn.github.com/images/modules/logos_page/GitHub-Logo.png", ""));
            // arrayList.add(new sponsorsandteamclass("",""));
            arrayList.add(new sponsorsandteamclass("https://www.heromotocorp.com/en-in/images/hero-logo.png", ""));
            arrayList.add(new sponsorsandteamclass("http://lightingbyvp.com/images/logo.png", ""));
            arrayList.add(new sponsorsandteamclass("http://www.infotoday.com.my/old/files/logo/thumbnails/27237.jpg", ""));

             adaptorevents = new adaptorevents(arrayList, context,1);
        }
        ListView li= (ListView) rootview.findViewById(R.id.listview_sponsorsandteam);
        li.setAdapter(adaptorevents);
        return rootview;
    }

}
