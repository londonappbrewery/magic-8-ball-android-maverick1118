package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn);
        final ImageView img = (ImageView) findViewById(R.id.image);
        final int[] i = {R.drawable.img1, R.drawable.img2, R.drawable.img3};
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random k = new Random();
               int ku = k.nextInt(3);
                img.setImageResource(i[ku]);
            }
        });
    }
}
