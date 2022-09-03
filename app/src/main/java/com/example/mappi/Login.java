package com.example.mappi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    //variables
    ImageView btnSignInAuth;
    EditText edPassword1;
    EditText edUsernameEmail;

    TextView txtSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //type cast
        btnSignInAuth = findViewById(R.id.btnSignInAuth);
        edPassword1 = findViewById(R.id.edPassword1);
        edUsernameEmail = findViewById(R.id.edUsernameEmail);
        txtSignUp = findViewById(R.id.txtSignUp);


    }
}