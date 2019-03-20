package com.example.homersimpson_ynestamanuel;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView titol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titol = (ImageView) findViewById(R.id.imageTitul);
        final AnimationDrawable anim = (AnimationDrawable) titol.getDrawable();
        if(!anim.isRunning()){
            anim.start();
        }


    }

}
