package com.androidshowtime.webviewapp;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webView);

        //enable JS to allow interactivity
        webView.getSettings().setJavaScriptEnabled(true);

        //make the app the default browser
        webView.setWebViewClient(new WebViewClient());

        //load site
        //webView.loadUrl("https://www.facebook.com");

        //you can also load HTML text

        webView.loadData("<html><body> <h1> About GOAT</h1> <p> GOAT means Greatest of All " +
                                 "Times</p>" +
                                 " </body></html>", "text/html", "UTF-8");
    }
}