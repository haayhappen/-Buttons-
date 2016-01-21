package com.example.fynn.buttons;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class NewGameActivity extends AppCompatActivity {
    private static Button startGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);

        getSupportActionBar().hide();

        OnClickButtonListenereasy();
        OnClickButtonListenermedium();
        OnClickButtonListenerhard();
        OnClickButtonListenerdet();
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void OnClickButtonListenereasy(){
        startGame=(Button)findViewById(R.id.button3);
        startGame.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.fynn.buttons.GameActivity");
                        intent.putExtra("difficulty", "6000");
                        startActivity(intent);
                    }
                });
    }
    public void OnClickButtonListenermedium(){
        startGame=(Button)findViewById(R.id.button4);
        startGame.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.fynn.buttons.GameActivity");
                        intent.putExtra("difficulty","5000");
                        startActivity(intent);
                    }
                });
    }
    public void OnClickButtonListenerhard(){
        startGame=(Button)findViewById(R.id.button5);
        startGame.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.fynn.buttons.GameActivity");
                        intent.putExtra("difficulty","4000");
                        startActivity(intent);
                    }
                });
    }
    public void OnClickButtonListenerdet(){
        startGame=(Button)findViewById(R.id.button6);
        startGame.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.fynn.buttons.GameActivity");
                        intent.putExtra("difficulty","3000");
                        startActivity(intent);
                    }
                });
    }
}
