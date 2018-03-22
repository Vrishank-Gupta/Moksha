package com.vrishankgupta.chatting;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StarNights extends Fragment {

    Button tab1,tab2,tab3;
    ImageView star_image;


    public StarNights() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_star_nights, container, false);

        tab1 = (Button) view.findViewById(R.id.tab1);
        tab2 = (Button) view.findViewById(R.id.tab2);
        tab3 = (Button) view.findViewById(R.id.tab3);
        star_image = (ImageView) view.findViewById(R.id.star_image);



        tab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                star_image.setImageResource(R.drawable.about);
                tab1.setBackgroundColor(getActivity().getResources().getColor(R.color.button_pressed));

                tab2.setBackgroundColor(getActivity().getResources().getColor(R.color.button_default));
                tab3.setBackgroundColor(getActivity().getResources().getColor(R.color.button_default));


            }
        });

        tab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                star_image.setImageResource(R.drawable.afsaana);
                tab2.setBackgroundColor(getActivity().getResources().getColor(R.color.button_pressed));

                tab1.setBackgroundColor(getActivity().getResources().getColor(R.color.button_default));
                tab3.setBackgroundColor(getActivity().getResources().getColor(R.color.button_default));

            }
        });

        tab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                star_image.setImageResource(R.drawable.alfaaz);

                tab3.setBackgroundColor(getActivity().getResources().getColor(R.color.button_pressed));

                tab2.setBackgroundColor(getActivity().getResources().getColor(R.color.button_default));
                tab1.setBackgroundColor(getActivity().getResources().getColor(R.color.button_default));

            }
        });

        tab1.performClick();

        tab1.setBackgroundColor(getActivity().getResources().getColor(R.color.button_pressed));




        return view;
    }
}
