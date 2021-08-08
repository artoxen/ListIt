package com.example.listit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;
    int counter=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b1 = (Button)findViewById(R.id.button_login);
        ed1 = (EditText)findViewById(R.id.login_user);
        ed2 = (EditText)findViewById(R.id.login_password);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u,p;
                String un="abcd",pass="1234";
                u=ed1.getText().toString();
                p=ed2.getText().toString();
                if(u.equals(un) && p.equals(pass)){
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                } else {
                    counter--;
                    Toast.makeText(getApplicationContext(), "Invalid Username or password\n"+counter+" Chances Left", Toast.LENGTH_SHORT).show();
                    if(counter==0){
                        b1.setEnabled(false);
                    }
                }
            }
        });
    }
}
