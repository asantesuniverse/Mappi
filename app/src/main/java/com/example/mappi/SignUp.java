package com.example.mappi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {

    ImageView btnExit;
    ImageView btnSignIn;
    EditText edFullName;
    EditText edUsername;
    EditText edPassword;
    TextView txtSignUp;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //type cast

        edFullName = findViewById(R.id.edFullName);
        edPassword = findViewById(R.id.edPassword);
        edUsername = findViewById(R.id.edUsername);
        txtSignUp = findViewById(R.id.txtSignUp);

        mAuth = FirebaseAuth.getInstance();
        btnSignIn.setOnClickListener(view -> {
            //createUser();
        });
    }

    public void btnExit(View view){

        Intent intent = new Intent(SignUp.this, Login.class);
        startActivity(intent);
        this.finish();
    }

    public void SignInLink(View view){

        Intent intent = new Intent(SignUp.this, Login.class);
        startActivity(intent);
        this.finish();
    }
    public void btnSignIn(View view){

        Intent intent = new Intent(SignUp.this, Login.class);
        startActivity(intent);
        this.finish();
    }
}