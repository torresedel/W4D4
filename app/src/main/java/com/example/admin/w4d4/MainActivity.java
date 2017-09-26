package com.example.admin.w4d4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void goToSignIn(View view) {

        Intent intent;

        switch (view.getId()){

            case R.id.btnTwitter:

                intent = new Intent(this, TwitterActivity.class);
                startActivity(intent);

                break;
        }

    }
}
