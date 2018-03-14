package com.vrishankgupta.chatting.adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//import com.example.shivam.moksha.R;
//import com.example.shivam.moksha.classes.sponsorsandteamclass;
import com.squareup.picasso.Picasso;
import com.vrishankgupta.chatting.R;
import com.vrishankgupta.chatting.classes.sponsorsandteamclass;

import java.util.ArrayList;

/**
 * Created by shivam on 13/03/18.
 */

public class adaptorevents extends BaseAdapter {

    ArrayList<sponsorsandteamclass> arrayList=new ArrayList<>();
    Context context;
    int type;

    public adaptorevents(ArrayList<sponsorsandteamclass> arrayList, Context context, int type) {
        this.arrayList = arrayList;
        this.context = context;
        this.type=type;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public sponsorsandteamclass getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = li.inflate(R.layout.eventsdetail, viewGroup, false);
            if (type==1){
                view = li.inflate(R.layout.sponsorslayout, viewGroup, false);
            }
        }
       sponsorsandteamclass ev=arrayList.get(i);
        TextView name= (TextView) view.findViewById(R.id.name);
        ImageView image= (ImageView) view.findViewById(R.id.image);

        name.setText(ev.getName());

        Picasso.get().load(ev.getPhotoaddress()).into(image);


        return view;
    }
}
