package com.example.mappi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    //variables
    ImageView btnSignInAuth;
    EditText edPassword1;
    EditText edUsernameEmail;
    Button signInButton;

    TextView txtSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //type cast
        edPassword1 = findViewById(R.id.edPassword1);
        edUsernameEmail = findViewById(R.id.edUsernameEmail);
        txtSignUp = findViewById(R.id.txtSignUp);
        signInButton = findViewById(R.id.signInButton);

        }
        public void SignInButton(View view){
            Intent intent = new Intent(Login.this, MapNav.class);
            startActivity(intent);
        }

}