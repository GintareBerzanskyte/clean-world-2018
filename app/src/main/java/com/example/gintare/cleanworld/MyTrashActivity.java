package com.example.gintare.cleanworld;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MyTrashActivity extends AppCompatActivity {

    Integer bottleNr, glassNr, paperNr = 0;
//    SharedPreferences sharedPreferences = getApplicationContext(). getSharedPreferences("data", MODE_PRIVATE);
//    SharedPreferences.Editor sharedPreferencesEditor = sharedPreferences.edit();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_trash);
    }

    public void sort(View view) {
        EditText bottleNr0 = (EditText) findViewById(R.id.plastic);
        bottleNr = Integer.parseInt(bottleNr0.getText().toString());

        EditText glass = (EditText) findViewById(R.id.glass);
        glassNr = Integer.parseInt(glass.getText().toString());

        EditText paper = (EditText) findViewById(R.id.paper);
        paperNr = Integer.parseInt(paper.getText().toString());

        Button BTN =(Button) findViewById(R.id.rusiuoti);

        SharedPreferences.Editor editor = getSharedPreferences("data", MODE_PRIVATE).edit();
        SharedPreferences prefs = getSharedPreferences("data", MODE_PRIVATE);

        editor.putInt("GLASS", glassNr+prefs.getInt("GLASS", 0));
        editor.putInt("PAPER", paperNr+prefs.getInt("PAPER", 0));
        editor.putInt("PLASTIC", bottleNr+prefs.getInt("PLASTIC", 0));
        editor.apply();


        TextView done_glass = (TextView) findViewById(R.id.txt_glass);
        TextView done_paper = (TextView) findViewById(R.id.txt_paper);
        TextView done_plastic = (TextView) findViewById(R.id.txt_plastic);
        done_glass.setText(""+prefs.getInt("GLASS", 0));
        done_paper.setText(""+prefs.getInt("PAPER", 0));
        done_plastic.setText(""+prefs.getInt("PLASTIC", 0));
        Log.e("tag", "glass "+ String.valueOf(prefs.getInt("GLASS", 0)));
        Log.e("tag", "paper "+ String.valueOf(prefs.getInt("PAPER", 0)));
        Log.e("tag", "plastic "+ String.valueOf(prefs.getInt("PLASTIC", 0)));

        glass.setText("0");
        paper.setText("0");
        bottleNr0.setText("0");

        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

    }
}
