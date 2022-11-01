package com.example.cs315chatapp_bb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    public Intent LoginIntent;
    public Intent RegisterIntent;
    public Intent ChatRoomIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseAuth mAuth = FirebaseAuth.getInstance();

// Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser == null)
        {
            /**nobody is logged in... we should probably show some
             buttons for "Login" and "Register" that will call our cool new Activities*/
        }
        else
        {
            /** we have a user already logged in... cool.  What do we do with that?*/
            ChatRoomIntent = new Intent(this, ChatRoom.class);

            startActivity(ChatRoomIntent);
        }
    }

    public void LoginIntent (View view)
    {
        LoginIntent = new Intent(this, LoginActivity.class);

        startActivity(LoginIntent);
    }

    public void RegisterIntent (View view)
    {
        RegisterIntent = new Intent(this, RegistrationActivity.class);

        startActivity(RegisterIntent);
    }
}