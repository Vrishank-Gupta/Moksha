package com.vrishankgupta.chatting;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    ImageView btnGoogle;
    private static int SIGN_IN_REQUEST_CODE = 1;


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.menu_sign_out)
        {
            AuthUI.getInstance().signOut(this).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                }
            });
        }
        return true;
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == SIGN_IN_REQUEST_CODE)
        {
            if(resultCode == RESULT_OK)
            {
                startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                finish();
            }
            else{
                finish();
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main2,menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btnGoogle = (ImageView) findViewById(R.id.btnGoogleLogin);



        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int perm = ContextCompat.checkSelfPermission(
                        LoginActivity.this,
                        Manifest.permission.CAMERA);

                if (perm == PackageManager.PERMISSION_GRANTED) {

                    if(FirebaseAuth.getInstance().getCurrentUser() == null)
                    {
                        startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().build(),SIGN_IN_REQUEST_CODE);

                    }
                    else
                    {
                        //Load content
                        startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                        finish();
                    }

                } else {
                    ActivityCompat.requestPermissions(
                            LoginActivity.this,
                            new String[] {Manifest.permission.CAMERA},
                            44
                    );
                }


            }
        });

    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == 44)
        {
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED)

                if(FirebaseAuth.getInstance().getCurrentUser() == null)
                {
                    startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().build(),SIGN_IN_REQUEST_CODE);
                }


                else
                {
                    startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                    finish();
                }

            else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(permissions[0])) {
                Toast.makeText(LoginActivity.this, "Go to Settings and Grant the permission to use this feature.", Toast.LENGTH_SHORT).show();
            }

        }

        else
            Toast.makeText(this, "This Permission is Required", Toast.LENGTH_SHORT).show();
    }
}
