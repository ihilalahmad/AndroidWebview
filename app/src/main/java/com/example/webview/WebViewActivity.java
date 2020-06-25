package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    WebView myWebView;

    private String urlToLoad = "https://www.google.com/";//you can add your url here which you want to load

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        myWebView = findViewById(R.id.my_webView);

        myWebView.loadUrl(urlToLoad);//url loading
    }
}