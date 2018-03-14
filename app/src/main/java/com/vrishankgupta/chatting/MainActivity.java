package com.vrishankgupta.chatting;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.vrishankgupta.chatting.fragments.about;
import com.vrishankgupta.chatting.fragments.sponsorsandteam;
import com.vrishankgupta.chatting.fragments.start;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupFirebaseAuth();

        android.app.FragmentManager fragmentManager = getFragmentManager();
        start frag = new start();
        fragmentManager.beginTransaction().add(R.id.frameloyoutmain, frag).commit();


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setIcon(R.drawable.itemlogo)
                        .setTitle("MOKSHA")
                        .setMessage("CONTACT US\n click to call")
                        .setPositiveButton("YAMIN :9999132765", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String phone = "9999132765";
                                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                                startActivity(intent);

                            }

                        })
                        .setNegativeButton("MAHIMA :9990891061", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String phone = "9990891061";
                                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                                startActivity(intent);
                            }

                        })
                        .show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.itemlogo)
                    .setTitle("MOKSHA")
                    .setMessage("Do You Want To Exit")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }

                    })
                    .setNegativeButton("No", null)
                    .show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {
            android.app.FragmentManager fragmentManager=getFragmentManager();
            start frag=new start();
            fragmentManager.beginTransaction().add(R.id.frameloyoutmain,frag).commit();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.ABOUT) {
            android.app.FragmentManager fragmentManager=getFragmentManager();
            about frag=new about();
            fragmentManager.beginTransaction().add(R.id.frameloyoutmain,frag).commit();
        }
        else if (id == R.id.EVENTS) {
           Intent i=new Intent(MainActivity.this,Main2Activity.class);
           startActivity(i);
        }
        else if (id == R.id.NEWSFEED) {

        }
        else if (id == R.id.CHATROOM) {
            startActivity(new Intent(getApplicationContext(),ChatMainActivity.class));

        }
        else if (id == R.id.DIRECTIONS) {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
            Uri.parse("http://maps.google.com/maps?daddr=Netaji Subhas Institute Of Technology, Dwarka Sector-3, Dwarka, New Delhi, Delhi"));
            startActivity(intent);
        }
        else if (id == R.id.MOKSHAMAP) {

        }
        else if (id == R.id.SPONSORS) {
            android.app.FragmentManager fragmentManager=getFragmentManager();
            sponsorsandteam frag=new sponsorsandteam(MainActivity.this,1);
            fragmentManager.beginTransaction().add(R.id.frameloyoutmain,frag).commit();

        }
        else if (id == R.id.TEAM) {
            android.app.FragmentManager fragmentManager=getFragmentManager();
            sponsorsandteam frag=new sponsorsandteam(MainActivity.this,0);
            fragmentManager.beginTransaction().add(R.id.frameloyoutmain,frag).commit();
        }
        else if (id == R.id.CONTACTUS) {

        }

        else if(id == R.id.signout)
        {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setupFirebaseAuth()
    {
        Log.d(TAG, "setupFirebaseAuth: setting up firebase auth");
        auth = FirebaseAuth.getInstance();
        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                checkCurrentUser(user);
                if(user != null)
                {
                    Log.d(TAG, "onAuthStateChanged: signed In" + user.getUid());
                }
                else
                {
                    Log.d(TAG, "onAuthStateChanged: SignedOut");
                }
            }
        };
    }


    private void checkCurrentUser(FirebaseUser user)
    {
        Log.d(TAG, "checkCurrentUser: Check if logged in");
        if(user == null)
        {
            Log.d(TAG, "checkCurrentUser: no user");
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
            finish();
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        auth.addAuthStateListener(authStateListener);
        checkCurrentUser(auth.getCurrentUser());
    }

    @Override
    protected void onStop() {
        super.onStop();
        auth.removeAuthStateListener(authStateListener);
    }


}
