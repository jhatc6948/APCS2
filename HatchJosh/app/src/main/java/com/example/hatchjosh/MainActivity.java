package com.example.hatchjosh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getResultText().setText((getNumberOne()) + (getNumberTwo()) + "");

            }

        });
        Button subBtn = (Button) findViewById(R.id.subBtn);
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getResultText().setText((getNumberOne()) - (getNumberTwo()) + "");

            }

        });
        Button multBtn = (Button) findViewById(R.id.multBtn);
        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getResultText().setText((getNumberOne()) * (getNumberTwo()) + "");

            }

        });
        Button devBtn = (Button) findViewById(R.id.devBtn);
        devBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getResultText().setText((getNumberOne()) / (getNumberTwo()) + "");

            }
        });
        Button sqBtn = (Button) findViewById(R.id.sqBtn);
        sqBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getResultText().setText(Math.pow(getNumberOne(), 2) + "");
            }
        });
        Button sqrtBtn = (Button) findViewById(R.id.sqrtBtn);
        sqrtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getResultText().setText(Math.sqrt(getNumberOne()) + "");
            }
        });


    }
    private double getNumberOne() {
        EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
        return Double.parseDouble(firstNumEditText.getText().toString());
    }
    private double getNumberTwo() {
        EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
        return Double.parseDouble(secondNumEditText.getText().toString());
    }
    private  TextView getResultText() {
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        return resultTextView;

    }


}
