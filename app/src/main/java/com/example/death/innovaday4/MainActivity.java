package com.example.death.innovaday4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView myimage;
    Button butoon,button1,button2,button3;
    Animation obj,obj1,obj2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myimage=(ImageView)findViewById(R.id.imageView);
        butoon=(Button)findViewById(R.id.button);
        button1=(Button)findViewById(R.id.button2);
        button2=(Button)findViewById(R.id.button3);
        button3=(Button)findViewById(R.id.button4);

        obj= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomin);
        obj1=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotation);
        obj2=AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomout);
        butoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myimage.startAnimation(obj);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myimage.startAnimation(obj1);
                obj1.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        myimage.startAnimation(obj1);
                        //myimage.clearAnimation();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myimage.startAnimation(obj2);
            }
        });


    }
}
