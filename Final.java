package com.example.plussecure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.DisplayContext;
import android.os.Bundle;
import android.provider.Settings;
import android.service.autofill.OnClickAction;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.security.SecureRandom;

public class Final extends AppCompatActivity {

    private ImageView logout;
    private Button m,d,a,o,mp,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        logout = (ImageView) findViewById(R.id.logo);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(Final.this, MainActivity.class));
            }
        });

        m = (Button) findViewById(R.id.button0);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Final.this, Em.class));

            }
        });

        a=(Button) findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Final.this,aoa.class));
            }
        });

        d=(Button) findViewById(R.id.button2);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Final.this,dbms.class));
            }
        });

        o=(Button) findViewById(R.id.button3);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Final.this,os.class));
            }
        });

        mp=(Button) findViewById(R.id.button4);
        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Final.this,mp.class));
            }
        });

        p=(Button) findViewById(R.id.button5);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Final.this,py.class));
            }
        });


    }

}