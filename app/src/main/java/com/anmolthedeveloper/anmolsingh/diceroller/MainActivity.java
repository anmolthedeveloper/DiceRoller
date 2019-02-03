package com.anmolthedeveloper.anmolsingh.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView img1,img2;
    private Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.imageView2);
        img2=findViewById(R.id.imageView3);
    }

    public void roll(View view){
        int myRand1=rand.nextInt(6)+1,myRand2=rand.nextInt(6)+1;
        setImage(myRand1,img1);
        setImage(myRand2,img2);

    }

    private void setImage(int rand,ImageView img){
        switch (rand){
            case 1:
                img.setImageResource(R.drawable.dice1);
                break;
            case 2:
                img.setImageResource(R.drawable.dice2);
                break;
            case 3:
                img.setImageResource(R.drawable.dice3);
                break;
            case 4:
                img.setImageResource(R.drawable.dice4);
                break;
            case 5:
                img.setImageResource(R.drawable.dice5);
                break;
            case 6:
                img.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
