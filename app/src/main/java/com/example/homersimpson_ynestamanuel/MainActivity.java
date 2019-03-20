package com.example.homersimpson_ynestamanuel;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView titol,engrVer,engrVerd,engrBlau,ull,donut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titol = (ImageView) findViewById(R.id.imageTitul);
        engrVer = findViewById(R.id.imageEngVer);
        engrVerd = findViewById(R.id.imageEngVerd);
        engrBlau = findViewById(R.id.imageEngBlau);
        ull = findViewById(R.id.imageUll);
        donut = findViewById(R.id.imageDonut);
        final AnimationDrawable anim = (AnimationDrawable) titol.getDrawable();
        if(!anim.isRunning()){
            anim.start();
        }


    }

    public void titolClick(View view) {
        if(engrVer.getVisibility() == View.INVISIBLE && engrVerd.getVisibility() == View.INVISIBLE &&
                engrBlau.getVisibility() == View.INVISIBLE){
            engrVer.setVisibility(View.VISIBLE);
            engrVerd.setVisibility(View.VISIBLE);
            engrBlau.setVisibility(View.VISIBLE);
            ull.setVisibility(View.VISIBLE);
            donut.setVisibility(View.VISIBLE);

        }
        else{
            engrVer.setVisibility(View.INVISIBLE);
            engrVerd.setVisibility(View.INVISIBLE);
            engrBlau.setVisibility(View.INVISIBLE);
            ull.setVisibility(View.INVISIBLE);
            donut.setVisibility(View.INVISIBLE);
        }

    }
}
