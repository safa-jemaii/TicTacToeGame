package net.practicalcoding.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playButtonClick(View view){
        Button button = (Button) view;
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        button.startAnimation(animation);

        Intent intent = new Intent(this, PlayerSetup.class);
        startActivity(intent);
    }



}