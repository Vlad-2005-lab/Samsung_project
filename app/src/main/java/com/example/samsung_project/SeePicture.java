package com.example.samsung_project;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Environment;
import android.provider.SyncStateContract;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.io.File;
import java.util.Objects;

public class SeePicture extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seepicture);
        while (true){
            try {
                Objects.requireNonNull(getSupportActionBar()).hide();
                WebView webview = (WebView) findViewById(R.id.webview);
                String folderToOpen = (getApplicationContext().getFileStreamPath("push.jpg").getPath());
                webview.loadUrl(folderToOpen);
                webview.getSettings().setSupportZoom(true);
                webview.setInitialScale(100);
                webview.getSettings().setBuiltInZoomControls(true);
                webview.setPadding(0, 0, 0, 0);
                webview.setScrollbarFadingEnabled(true);
                webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webview.getSettings().setAllowFileAccess(true);
                break;
            } catch (Exception ex){}
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.down, R.anim.down1);
    }
}
