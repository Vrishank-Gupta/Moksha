package com.vrishankgupta.chatting;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.vrishankgupta.chatting.classes.eventdetail;
import com.vrishankgupta.chatting.eventsactivities.automobile;
import com.vrishankgupta.chatting.eventsactivities.dance;
import com.vrishankgupta.chatting.eventsactivities.gaming;
import com.vrishankgupta.chatting.eventsactivities.informals;
import com.vrishankgupta.chatting.eventsactivities.literary;
import com.vrishankgupta.chatting.eventsactivities.music;
import com.vrishankgupta.chatting.eventsactivities.talentshow;
import com.vrishankgupta.chatting.eventsactivities.theatrecodramatics;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    static ArrayList<eventdetail> events=new ArrayList<>();
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        events.add(new eventdetail("DANCE","You don't need Cinderella 's charmed shoes to rock the ball, all you need is a dancer's soul.\n" +
                "If you love grooving to those dancing numbers, then we have a brilliant stage set up for you!\n" +
                "Let the party begin!"));

        events.add(new eventdetail("THEATRECO-DRAMATICS","All the world's a stage\"\n" +
                "Bringing the legendary verse to life , Moksha '18 is welcoming all actors to a grand carnival of expressions, dialogues and drama.\n" +
                "If acting is your kingship then we will provide you, your kingdom."));

        events.add(new eventdetail("INFORMALS","Dimmed lights , soft music and a perfect ambience for an amorous getaway; come with a casual friend or a date.\n" +
                "Don't get upset if you don't have a date cause you may find one too!\n" +
                "So, get in and explore!"));

        events.add(new eventdetail("MUSIC","If Music is the food to your soul,\n" +
                "then come and indulge in the grandest musical bonanza ever!\n" +
                "Moksha '18 presents to you a plethora of musical festivities.\n" +
                "Let not this rhythm of beats , go off beat."));

        events.add(new eventdetail("LITERARY EVENTS","A quill is a knower of a writer's heart.\n" +
                "So, this Moksha '18 let your magical quill ,spill verses unsaid.\n" +
                "Join in ,to celebrate the mesmerizing art of writing."));

        events.add(new eventdetail("TALENT SHOW/FASHION EVENTS","Welcome to Moksha ‘18 at NSIT. Now’s the chance to show us what you’ve got. Get up on stage and amaze us with your looks,moves and grooves to win exciting titles and more."));

        events.add(new eventdetail("GAMING","It's time to glorify those restless nights you've spent behind your gaming screens.\n" +
                "Moksha '18 calls out to all the enthusiastic gamers to prepare for the ultimate battle!"));

        events.add(new eventdetail("AUTOMOBILE SHOW","Roaring engines, fuming motorparts and high octaned spirits of the audience. Sigh.\n" +
                "There is no word to describe the beauty of Motorsports. Just two words- Be There!"));

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    @SuppressLint("ValidFragment")
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main2, container, false);

            eventdetail ev=events.get(getArguments().getInt(ARG_SECTION_NUMBER)-1);

            TextView heading = (TextView) rootView.findViewById(R.id.heading);
            TextView detail = (TextView) rootView.findViewById(R.id.detail);
            Button btn = (Button) rootView.findViewById(R.id.btn);

            heading.setText(ev.getHeading() );
            detail.setText(ev.getAbout());
            Intent i;
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    switch (getArguments().getInt(ARG_SECTION_NUMBER)){
                        case 1:
                            Intent i=new Intent(getContext(),dance.class);
                            startActivity(i);
                            break;

                        case 2: Intent j=new Intent(getContext(),theatrecodramatics.class);
                            startActivity(j);
                            break;

                        case 3: Intent k=new Intent(getContext(),informals.class);
                            startActivity(k);
                            break;

                        case 4: Intent l=new Intent(getContext(),music.class);
                            startActivity(l);
                            break;

                        case 5: Intent m=new Intent(getContext(),literary.class);
                            startActivity(m);
                            break;

                        case 6: Intent n=new Intent(getContext(),talentshow.class);
                            startActivity(n);
                            break;

                        case 7: Intent o=new Intent(getContext(),gaming.class);
                            startActivity(o);
                            break;

                        case 8: Intent p=new Intent(getContext(),automobile.class);
                            startActivity(p);
                            break;

                    }
                }
            });
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return events.size();
        }
    }
}
