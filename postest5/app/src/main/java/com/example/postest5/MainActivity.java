package com.example.postest5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtuser;
    EditText txtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtuser = (EditText) findViewById(R.id.username);
        txtpass = (EditText) findViewById(R.id.password);
        Button btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtuser.getText().toString().equals("admin") && txtpass.getText().toString().equals("123")){
                    Toast.makeText(getApplicationContext(), "LOGIN BERHASIL", Toast.LENGTH_SHORT).show();
                    Intent login = new Intent(MainActivity.this, WelcomeActivity.class);
                    MainActivity.this.startActivity(login);
                    MainActivity.this.finish();
                }
                else Toast.makeText(MainActivity.this, "User atau Password Salah", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
