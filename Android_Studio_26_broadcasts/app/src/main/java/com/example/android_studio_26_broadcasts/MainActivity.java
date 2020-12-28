package com.example.android_studio_26_broadcasts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void broadcastIntent(View view)
    {
        Intent intent = new Intent();
        intent.setAction("com.yiibai.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}