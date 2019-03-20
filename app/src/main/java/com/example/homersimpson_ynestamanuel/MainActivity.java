package com.example.homersimpson_ynestamanuel;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView titol,engrVer,engrVerd,engrBlau,ull,donut;
    Animation anim;
    Animation anim2;
    Animation anim3;
    Animation anim4;
    MediaPlayer media;

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
            anim = AnimationUtils.loadAnimation(this, R.anim.animaciotween);
            anim2 = AnimationUtils.loadAnimation(this, R.anim.animaciotween2);
            anim3 = AnimationUtils.loadAnimation(this, R.anim.animaciotweendonut);
            anim4 = AnimationUtils.loadAnimation(this, R.anim.animaciotweenull);
            engrVerd.startAnimation(anim2);
            engrVer.startAnimation(anim);
            engrBlau.startAnimation(anim);
            donut.startAnimation(anim3);
            ull.startAnimation(anim4);

        }
        else{
            donut.clearAnimation();
            engrVer.clearAnimation();
            engrVerd.clearAnimation();
            engrBlau.clearAnimation();
            ull.clearAnimation();
            engrVer.setVisibility(View.INVISIBLE);
            engrVerd.setVisibility(View.INVISIBLE);
            engrBlau.setVisibility(View.INVISIBLE);
            ull.setVisibility(View.INVISIBLE);
            donut.setVisibility(View.INVISIBLE);

        }

    }

    public void musica(View view) {
        try
        {
            if (media != null && media.isPlaying())
            {
                media.stop();
            }
            else
            {
                media = MediaPlayer.create(this.getApplicationContext(), R.raw.the_simpsons);
                media.start();
            }
        } catch(Exception e) {
        }

    }
}
