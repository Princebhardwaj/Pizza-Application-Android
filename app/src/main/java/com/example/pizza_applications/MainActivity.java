package com.example.pizza_applications;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtUserName,edtPassword;
    Button btnSignup,btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUserName=(EditText)findViewById(R.id.UserName);
        edtPassword=(EditText)findViewById(R.id.Password);
        btnLogin=(Button)findViewById(R.id.LoginBtn);
        btnSignup=(Button)findViewById(R.id.SignupBtn);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent( MainActivity.this,Signup.class);
                startActivity(intent);
                Intent intent1 =new Intent( MainActivity.this, Menu.class);
                startActivity(intent1);
            }
        });
    }
}

