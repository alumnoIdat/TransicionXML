package com.example.chango.transicionxml;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Chango on 24/11/2016.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void forwardZoom(View button){
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.anim.zoom_forward_in,
                R.anim.zoom_forward_out);
    }
    public void left(View button){
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
    public void fade(View button){
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
    public void byDefault(View button){
        startActivity(new Intent(this, MainActivity.class));
    }
}