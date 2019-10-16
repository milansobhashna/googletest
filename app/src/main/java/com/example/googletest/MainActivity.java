package com.example.googletest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;


public class MainActivity extends AppCompatActivity {
    static WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web=(WebView) findViewById(R.id.web);
        web.setWebViewClient(new WebViewClient());

        WebSettings webSettings = web.getSettings();

        webSettings.setJavaScriptEnabled(true);

        webSettings.setBuiltInZoomControls(true);

        web.loadUrl("https://www.google.com");

        web.setWebChromeClient(new WebChromeClient() {
        });
    }
    @Override
    public void onBackPressed() {
        WebView web=(WebView) findViewById(R.id.web);
        if (web.canGoBack()) {
            web.goBack();
        } else {
            super.onBackPressed();
        }
    }
}