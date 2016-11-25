package com.example.chango.transicionxml;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zoomBack(View button){
        startActivity(new Intent(this, SecondActivity.class));
        overridePendingTransition(R.anim.zoom_back_in,
                R.anim.zoom_back_out);
    }
    public void fade(View button){
        startActivity(new Intent(this, SecondActivity.class));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
    public void right(View button){
        startActivity(new Intent(this, SecondActivity.class));
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }
    public void back(View button){
        super.onBackPressed();
    }
}
