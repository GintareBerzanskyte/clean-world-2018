package com.example.gintare.cleanworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void info(View view) {
        Intent info = new Intent(MainActivity.this, info.class);
        startActivity(info);
    }
    public void diy(View view) {
        Intent diy = new Intent(MainActivity.this, DIYActivity.class);
        startActivity(diy);
    }
    public void my_trash(View view) {
        Intent my_trash = new Intent(MainActivity.this, info.class);
        startActivity(my_trash);
    }
}
