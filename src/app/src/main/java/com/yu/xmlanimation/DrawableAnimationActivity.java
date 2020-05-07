package com.yu.xmlanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DrawableAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        setContentView(R.layout.activity_drawableanimation);

        ImageView image = (ImageView)findViewById(R.id.imageView);
        image.setBackgroundResource(R.drawable.xmlanimation);

        final AnimationDrawable frameAnimation = (AnimationDrawable) image.getBackground();

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameAnimation.start();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}