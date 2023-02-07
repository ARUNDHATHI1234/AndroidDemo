package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        AppCompatButton button = (AppCompatButton) findViewById(R.id.signin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("arundhathi") && password.getText().toString().equals("aru123")) {
                    Toast.makeText(Login.this, "Login Success", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Login.this, Home.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this, "Login failed", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
