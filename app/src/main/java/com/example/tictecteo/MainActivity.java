package com.example.tictecteo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {


    AppCompatButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, RestartBtn;
    private boolean Player;
    TextView Turn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        RestartBtn = findViewById(R.id.restartbtn);
        Turn = findViewById(R.id.turn);


        Player = true;
        // if Player == true == "X" | else Player == "O"
        turn(Player);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player==true){
                    btn1.setText("X");
                    btn1.setEnabled(false);
                    Player = false;
                }else{
                    btn1.setText("O");
                    btn1.setEnabled(false);
                    Player = true;
                }
                turn(Player);
                winner();

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player==true){
                    btn2.setText("X");
                    btn2.setEnabled(false);
                    Player = false;
                }else{
                    btn2.setText("O");
                    btn2.setEnabled(false);
                    Player = true;
                }
                turn(Player);
                winner();
            }
        });



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player==true){
                    btn3.setText("X");
                    btn3.setEnabled(false);
                    Player = false;
                }
                else{
                    btn3.setText("O");
                    btn3.setEnabled(false);
                    Player = true;
                }
                turn(Player);
                winner();
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player==true){
                    btn4.setText("X");
                    btn4.setEnabled(false);
                    Player = false;
                }
                else{
                    btn4.setText("O");
                    btn4.setEnabled(false);
                    Player = true;
                }
                turn(Player);
                winner();
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player==true){
                    btn5.setText("X");
                    btn5.setEnabled(false);
                    Player = false;
                }
                else{
                    btn5.setText("O");
                    btn5.setEnabled(false);
                    Player = true;
                }
                turn(Player);
                winner();
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player==true){
                    btn6.setText("X");
                    btn6.setEnabled(false);
                    Player = false;
                }
                else{
                    btn6.setText("O");
                    btn6.setEnabled(false);
                    Player = true;
                }
                turn(Player);
                winner();
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player==true){
                    btn7.setText("X");
                    btn7.setEnabled(false);
                    Player = false;
                }
                else{
                    btn7.setText("O");
                    btn7.setEnabled(false);
                    Player = true;
                }
                turn(Player);
                winner();
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player==true){
                    btn8.setText("X");
                    btn8.setEnabled(false);
                    Player = false;
                }
                else{
                    btn8.setText("O");
                    btn8.setEnabled(false);
                    Player = true;
                }
                turn(Player);
                winner();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player==true){
                    btn9.setText("X");
                    btn9.setEnabled(false);
                    Player = false;
                }
                else{
                    btn9.setText("O");
                    btn9.setEnabled(false);
                    Player = true;
                }
                turn(Player);
                winner();
            }
        });



        RestartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                Player = true;
                turn(Player);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);



            }
        });











    }

    public void turn(boolean Player){
        if (Player == true){
            Turn.setText("Turn's X");
        }else {
            Turn.setText("Turn's O");
        }
    }

    public void winner(){
        if(!btn1.getText().toString().trim().equals("") && btn1.getText().toString().trim().equals(btn2.getText().toString().trim()) && btn1.getText().toString().trim().equals(btn3.getText().toString().trim())){
            // 1==2==3
            Intent result = new Intent(MainActivity.this, ResultActivity.class);
            result.putExtra("winner", btn1.getText().toString().trim());
            startActivity(result);
            finish();
            disable_all_btns();

        } else if (!btn4.getText().toString().trim().equals("") && btn4.getText().toString().trim().equals(btn5.getText().toString().trim()) && btn4.getText().toString().trim().equals(btn6.getText().toString().trim())) {
            // 4==5==6
            Intent result = new Intent(MainActivity.this, ResultActivity.class);
            result.putExtra("winner", btn4.getText().toString().trim());
            startActivity(result);
            finish();
            disable_all_btns();

        } else if (!btn7.getText().toString().trim().equals("") && btn7.getText().toString().trim().equals(btn8.getText().toString().trim()) && btn7.getText().toString().trim().equals(btn9.getText().toString().trim())) {
            // 7==8==9
            Intent result = new Intent(MainActivity.this, ResultActivity.class);
            result.putExtra("winner", btn7.getText().toString().trim());
            startActivity(result);
            finish();
            disable_all_btns();

        } else if (!btn1.getText().toString().trim().equals("") && btn1.getText().toString().trim().equals(btn4.getText().toString().trim()) && btn1.getText().toString().trim().equals(btn7.getText().toString().trim())) {
            // 1==4==7
            Intent result = new Intent(MainActivity.this, ResultActivity.class);
            result.putExtra("winner", btn1.getText().toString().trim());
            startActivity(result);
            finish();
            disable_all_btns();

        } else if (!btn2.getText().toString().trim().equals("") && btn2.getText().toString().trim().equals(btn5.getText().toString().trim()) && btn2.getText().toString().trim().equals(btn8.getText().toString().trim())) {
            // 2==5==8
            Intent result = new Intent(MainActivity.this, ResultActivity.class);
            result.putExtra("winner", btn2.getText().toString().trim());
            startActivity(result);
            disable_all_btns();

        } else if (!btn3.getText().toString().trim().equals("") && btn3.getText().toString().trim().equals(btn6.getText().toString().trim()) && btn3.getText().toString().trim().equals(btn9.getText().toString().trim())) {
            // 3==6==9
            Intent result = new Intent(MainActivity.this, ResultActivity.class);
            result.putExtra("winner", btn3.getText().toString().trim());
            startActivity(result);
            finish();
            disable_all_btns();

        } else if (!btn1.getText().toString().trim().equals("") && btn1.getText().toString().trim().equals(btn5.getText().toString().trim()) && btn1.getText().toString().trim().equals(btn9.getText().toString().trim())) {
            // 1==5==9
            Intent result = new Intent(MainActivity.this, ResultActivity.class);
            result.putExtra("winner", btn1.getText().toString().trim());
            startActivity(result);
            finish();
            disable_all_btns();

        } else if (!btn3.getText().toString().trim().equals("") && btn3.getText().toString().trim().equals(btn5.getText().toString().trim()) && btn3.getText().toString().trim().equals(btn7.getText().toString().trim())) {
            // 3==5==7
            Intent result = new Intent(MainActivity.this, ResultActivity.class);
            result.putExtra("winner", btn3.getText().toString().trim());
            startActivity(result);
            finish();
            disable_all_btns();
        } else if  (!btn1.getText().toString().equals("") &&
                !btn2.getText().toString().equals("") &&
                !btn3.getText().toString().equals("") &&
                !btn4.getText().toString().equals("") &&
                !btn5.getText().toString().equals("") &&
                !btn6.getText().toString().equals("") &&
                !btn7.getText().toString().equals("") &&
                !btn8.getText().toString().equals("") &&
                !btn9.getText().toString().equals("")
        ) {
            Intent result = new Intent(this, ResultActivity.class);
            result.putExtra("winner", "Draw");
            startActivity(result);
            finish();
        }

    }




    public void disable_all_btns(){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }



}