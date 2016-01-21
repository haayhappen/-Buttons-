package com.example.fynn.buttons;

import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

private static Button button_new_game,button_scores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    // hides the ActionBar
        getSupportActionBar().hide();
    //call the method from new game button
        OnClickButtonListener();
        OnClickButtonListenerscores();

    }

    // Dialog PopUp when Back-Key is pressed...-to completly finish the Application
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("End Game")
                .setMessage("Are you sure you want to end the game?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }

                })
                .setNegativeButton("No", null)
                .show();
    }

    //Button New Game
    public void OnClickButtonListener(){
        button_new_game=(Button)findViewById(R.id.button);
        button_new_game.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.fynn.buttons.NewGameActivity");
                        startActivity(intent);
                    }
                });
}
    public void OnClickButtonListenerscores(){
        button_scores=(Button)findViewById(R.id.button2);
        button_scores.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.fynn.buttons.ScoresActivity");
                        startActivity(intent);
                    }
                });
    }

}
