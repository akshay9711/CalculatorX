package com.creatpixel.calculatorx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //If operator is true means 2nd display will true
    String disOne = null;
    boolean operator = false;
    String disTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //_________________________________________________________________________________________________________________________________
        Button button1 = findViewById(R.id.key1);
        Button button2 = findViewById(R.id.key2);
        Button button3 = findViewById(R.id.key3);
        Button plusOperator = findViewById(R.id.plus);
        Button getResult = findViewById(R.id.result);

        EditText displayText = findViewById(R.id.displayText);
        //______________________________________________________________________________________________________________________________
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(disOne.isEmpty()){
                    disOne = "";
                }
                else{
                    EditText.
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(disOne.isEmpty()){
                    disOne = "";
                }
                else{
                    disOne = displayText.getText().toString() + "2";
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(disOne.isEmpty()){
                    disOne = "";
                }
                else{
                    disOne = displayText.getText().toString() + "3";
                }
            }
        });

    }
}
