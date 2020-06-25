package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_start_WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start_WebView = findViewById(R.id.btn_start_webView);

        btn_start_WebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //here we will use Intent to start webview activity
                Intent startWebView = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(startWebView);

            }
        });
    }
}