package com.example.tictecteo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultActivity extends AppCompatActivity {

    TextView winner, loser;
    Button play_again_btn;
    private String who_winner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        who_winner = intent.getStringExtra("winner");

        winner = findViewById(R.id.winner);
        loser = findViewById(R.id.loser);
        play_again_btn = findViewById(R.id.playAgainBtn);

        if(who_winner.equals("Draw")){
            winner.setText("Match Draw !");
            loser.setVisibility(View.GONE);
        }else {
            winner.setText("🎉 Winner: " + who_winner + " 🎉");
            loser.setText("😞 Better luck next time, " + (who_winner.equals("X") ? "O" : "X"));
        }



        play_again_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent game = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(game);
                finish();
            }
        });





    }
}