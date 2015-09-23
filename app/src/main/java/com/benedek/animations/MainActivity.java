package com.benedek.animations;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        moveImage();

    }


    public void moveImage() {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        TranslateAnimation animation = new TranslateAnimation(0.0f, 400.0f, 0.0f, 0.0f); //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
        animation.setDuration(5000);  // animation duration
        animation.setRepeatCount(5);  // animation repeat count
        animation.setRepeatMode(1);   // repeat animation (left to right, right to left )
        //animation.setFillAfter(true);
        imageView.startAnimation(animation);
    }
}
