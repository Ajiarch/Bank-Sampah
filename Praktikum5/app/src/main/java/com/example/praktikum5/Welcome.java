package com.example.praktikum5;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    }

    public void create_new(){
    Toast.makeText(this, "Menu new File Selected", Toast.LENGTH_SHORT).show();
    }

    public void open(){
    Toast.makeText(this, "Menu open file Selected", Toast.LENGTH_SHORT).show();
    }

     public void setting(){
     Toast.makeText(this, "Menu setting Selected", Toast.LENGTH_SHORT).show() ;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.createnew:
            create_new();
            return true;

            case R.id.open:
            open();
            return true;

            case R.id.setting:
            setting();
            return true;

            default:
            return super.onOptionsItemSelected(item);
        }
    }
}