package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void decreaseScore(View view) {

        int viewID = view.getId();
        switch (viewID){

            case R.id.decreaseTeam1:
//Decrement the score and update the TextView
                int mScore1;
                mScore1--;
                 mScoreText1;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
//If it was Team 2
            case R.id.decreaseTeam2:
//Decrement the score and update the TextView
                int mScore2;
                mScore2--;
                mScoreText2.setText(String.valueOf(mScore2));
        }
    }
    /**
     * Method that handles the onClick of both the increment buttons
     * @param view The button view that was clicked
     */
    public void increaseScore(View view) {
//Get the ID of the button that was clicked
        int viewID = view.getId();
        switch (viewID){
//If it was on Team 1
            case R.id.increaseTeam1:
//Increment the score and update the TextView
                 mScore1;
                mScore1++;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
//If it was Team 2
            case R.id.increaseTeam2:
//Increment the score and update the TextView
                mScore2++;
                mScoreText2.setText(String.valueOf(mScore2));
        }
    }
}