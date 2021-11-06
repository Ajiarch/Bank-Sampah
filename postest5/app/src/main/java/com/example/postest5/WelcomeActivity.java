package com.example.postest5;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    Button btnExit;
    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                //perintah untuk mengakhiri aplikasi
                finish();            }
        });
    }


    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (v.getId() == R.id.btnExit) {
            finish();        }
    }
}