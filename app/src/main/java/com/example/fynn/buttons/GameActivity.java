package com.example.fynn.buttons;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;

public class GameActivity extends AppCompatActivity {

    // difficulty easy=1 : medium=2: hard=3: don't even try=4

    private String difficulty,finalstats;

    private TextView textview,textview5,textviewhitthecolor,textView7;

    private ImageView imgview;

    private long timeLeft,timeadded;

    private int counter=0;

    private CountDownTimer countDownTimer; ;

    private static Button buttonred;
    private static Button buttonyellow;
    private static Button buttongreen;
    private static Button buttonblue;
    private static Button startgame;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_game);

        textview5=(TextView)findViewById(R.id.textView5);
        textview5.setText("");
        ImageView imgview = (ImageView) findViewById(R.id.imageView);
        imgview.setBackgroundColor(Color.WHITE);

        textView7=(TextView)findViewById(R.id.textView7);
        textView7.setText("");

        String whichButton = getIntent().getStringExtra("difficulty");
        difficulty=whichButton;
        timeLeft=Integer.parseInt(difficulty);

        OnClickButtonListenerred();
        OnClickButtonListeneryellow();
        OnClickButtonListenergreen();
        OnClickButtonListenerblue();
        OnClickButtonListenerstartgame();

timeadded=timeLeft;

    }
    @Override
    public void onBackPressed() {
    }

    public void OnClickButtonListenerstartgame(){
        startgame=(Button)findViewById(R.id.button7startgame);
        startgame.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        createCountDownTimer();
                        changeColor();
                        startgame.setVisibility(View.GONE);
                        textviewhitthecolor=(TextView)findViewById(R.id.textView6);
                        textviewhitthecolor.setVisibility(View.GONE);
                    }
                });


        }


    public void OnClickButtonListenerred(){
        textView7=(TextView)findViewById(R.id.textView7);
        final ImageView imgview = (ImageView) findViewById(R.id.imageView);
        textview5=(TextView)findViewById(R.id.textView5);
        buttonred=(Button)findViewById(R.id.buttonred);
        buttonred.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int  colorbutton= ((ColorDrawable)buttonred.getBackground()).getColor();
                        int colorimgview=((ColorDrawable)imgview.getBackground()).getColor();

                        if(colorbutton==colorimgview){
                            if (countDownTimer != null)
                                countDownTimer.cancel();
                            timeadded+=timeLeft/25;
                            createCountDownTimer();
                            changeColor();
                            counter++;
                            textView7.setText(counter+"");
                        }
                        else{
                            countDownTimer.cancel();
                            Intent intent=new Intent("com.example.fynn.buttons.GameOverActivity");
                            finalstats=(timeadded/1000)+"";
                            intent.putExtra("Score",finalstats);
                            startActivity(intent);
                        }

                    }
                });
    }
    public void OnClickButtonListeneryellow(){
        textView7=(TextView)findViewById(R.id.textView7);
        final ImageView imgview = (ImageView) findViewById(R.id.imageView);
        textview5=(TextView)findViewById(R.id.textView5);
        buttonyellow=(Button)findViewById(R.id.buttonyellow);
        buttonyellow.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int  colorbutton= ((ColorDrawable)buttonyellow.getBackground()).getColor();
                        int colorimgview=((ColorDrawable)imgview.getBackground()).getColor();

                        if(colorbutton==colorimgview){
                            if (countDownTimer != null)
                                countDownTimer.cancel();
                            timeadded+=timeLeft/25;
                            createCountDownTimer();
                            changeColor();
                            counter++;
                            textView7.setText(counter+"");
                        }
                        else{
                            countDownTimer.cancel();
                            Intent intent=new Intent("com.example.fynn.buttons.GameOverActivity");
                            finalstats=(timeadded/1000)+"";
                            intent.putExtra("Score",finalstats);
                            startActivity(intent);
                        }

                    }
                });
    }
    public void OnClickButtonListenergreen(){
        textView7=(TextView)findViewById(R.id.textView7);
        final ImageView imgview = (ImageView) findViewById(R.id.imageView);
        textview5=(TextView)findViewById(R.id.textView5);
        buttongreen=(Button)findViewById(R.id.buttongreen);
        buttongreen.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int colorbutton = ((ColorDrawable) buttongreen.getBackground()).getColor();
                        int colorimgview = ((ColorDrawable) imgview.getBackground()).getColor();

                        if (colorbutton == colorimgview) {
                            if (countDownTimer != null)
                                countDownTimer.cancel();
                            timeadded+=timeLeft/25;
                            createCountDownTimer();
                            changeColor();
                            counter++;
                            textView7.setText(counter+"");
                        }
                        else{
                            countDownTimer.cancel();
                            Intent intent=new Intent("com.example.fynn.buttons.GameOverActivity");
                            finalstats=(timeadded/1000)+"";
                            intent.putExtra("Score",finalstats);
                            startActivity(intent);
                        }

                    }
                });
    }
    public void OnClickButtonListenerblue(){
        textView7=(TextView)findViewById(R.id.textView7);
        final ImageView imgview = (ImageView) findViewById(R.id.imageView);
        textview5=(TextView)findViewById(R.id.textView5);
        buttonblue=(Button)findViewById(R.id.buttonblue);
        buttonblue.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int  colorbutton= ((ColorDrawable)buttonblue.getBackground()).getColor();
                        int colorimgview=((ColorDrawable)imgview.getBackground()).getColor();

                        if(colorbutton==colorimgview){
                            if (countDownTimer != null)
                                countDownTimer.cancel();
                            timeadded+=timeLeft/25;
                            createCountDownTimer();
                            changeColor();
                            counter++;
                            textView7.setText(counter+"");
                        }
                        else{
                            countDownTimer.cancel();
                            Intent intent=new Intent("com.example.fynn.buttons.GameOverActivity");
                            finalstats=(timeadded/1000)+"";
                            intent.putExtra("Score",finalstats);
                            startActivity(intent);
                        }
                    }
                });
    }


    private void changeColor(){
        Random rand = new Random();

        // nextInt excludes the top value so we have to add 1 to include the top value
        //int color = rand.nextInt((max - min) + 1) + min;
        ImageView imgview = (ImageView) findViewById(R.id.imageView);
        int color = (int)(Math.random() * 4 + 1);
        switch (color)
        {
            case 1:imgview.setBackgroundColor(Color.RED) ; break;
            case 2: imgview.setBackgroundColor(Color.YELLOW); break;
            case 3: imgview.setBackgroundColor(Color.GREEN); break;
            case 4: imgview.setBackgroundColor(Color.BLUE); break;
            default:
                break;
        }

    }


    private void createCountDownTimer() {
        countDownTimer = new CountDownTimer((timeadded), 100) {

            @Override
            public void onTick(long millisUntilFinished) {
                textview5.setText((millisUntilFinished/1000) +"." +(millisUntilFinished %1000));
                timeadded=millisUntilFinished;
            }

            @Override
            public void onFinish() {
                Intent intent=new Intent("com.example.fynn.buttons.GameOverActivity");
                //finalstats=(timeadded/1000)+"";

                intent.putExtra("Time","Time's up!");
                intent.putExtra("Score",counter+"");
                startActivity(intent);
            }
        }.start();
    }
}
