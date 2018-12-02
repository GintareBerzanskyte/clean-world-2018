package com.example.gintare.cleanworld;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;


public class DIYActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diy);

        WebView my1 = (WebView) findViewById(R.id.web1);
        WebSettings webSettings = my1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        my1.loadUrl("https://www.youtube.com/embed/mzmzk_q0LR4");

        WebView my2 = (WebView) findViewById(R.id.web2);
        WebSettings webSettings2 = my2.getSettings();
        webSettings2.setJavaScriptEnabled(true);
        my2.loadUrl("https://www.youtube.com/embed/XJm0r_lMUXo");

        WebView my3 = (WebView) findViewById(R.id.web3);
        WebSettings webSettings3 = my3.getSettings();
        webSettings3.setJavaScriptEnabled(true);
        my3.loadUrl("https://www.youtube.com/embed/lygBFntOyUE");

        WebView my4 = (WebView) findViewById(R.id.web4);
        WebSettings webSettings4 = my4.getSettings();
        webSettings4.setJavaScriptEnabled(true);
        my4.loadUrl("https://www.youtube.com/embed/IE_KqcMoeS0");

        WebView my5 = (WebView) findViewById(R.id.web5);
        WebSettings webSettings5 = my5.getSettings();
        webSettings5.setJavaScriptEnabled(true);
        my5.loadUrl("https://www.youtube.com/embed/urL1kKOBeqg");
    }
}
