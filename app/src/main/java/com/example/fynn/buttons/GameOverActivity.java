package com.example.fynn.buttons;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {


    private Button btnmenu,btntryagain;
    private String score,time;
    private TextView txtviewscore,txtviewgameover;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        //hide actionbar
        getSupportActionBar().hide();
        //find textviews
        txtviewgameover=(TextView) findViewById(R.id.textView3);
        txtviewscore = (TextView) findViewById(R.id.textView4);
        //get intents to variables
        score = getIntent().getStringExtra("Score");
        time = getIntent().getStringExtra("Time");
        //add time's up to game over
        time =txtviewgameover.getText()+" \n "+time;
        if(time==null){
            txtviewgameover.setText("Game over");
        }

        //if no button was pressed it says you failed
        if (score==null){
            txtviewscore.setText("You failed");
        }
        // else it shows the score
        else
        txtviewscore.setText(score);

        OnClickButtonListenermenu();
        OnClickButtonListenertryagain();
    }
    @Override
    public void onBackPressed() {

    }

    public void OnClickButtonListenermenu(){
        btnmenu=(Button)findViewById(R.id.button_menu);
        btnmenu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);

                    }
                });


    }
    public void OnClickButtonListenertryagain(){
        btntryagain=(Button)findViewById(R.id.button8);
        btntryagain.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent=new Intent("com.example.fynn.buttons.NewGameActivity");
                        startActivity(intent);

                    }
                });


    }
}
