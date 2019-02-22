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
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt(firstNumEditText.getText().toString());
                double num2 = Integer.parseInt(secondNumEditText.getText().toString());
                double resultAdd = num1 + num2;
                resultTextView.setText(resultAdd + "");

            }

        });
        Button subBtn = (Button) findViewById(R.id.subBtn);
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt(firstNumEditText.getText().toString());
                double num2 = Integer.parseInt(secondNumEditText.getText().toString());
                double resultAdd = num1 - num2;
                resultTextView.setText(resultAdd + "");

            }

        });
        Button multBtn = (Button) findViewById(R.id.multBtn);
        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt(firstNumEditText.getText().toString());
                double num2 = Integer.parseInt(secondNumEditText.getText().toString());
                double resultAdd = num1 * num2;
                resultTextView.setText(resultAdd + "");

            }

        });
        Button devBtn = (Button) findViewById(R.id.devBtn);
        devBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt(firstNumEditText.getText().toString());
                double num2 = Integer.parseInt(secondNumEditText.getText().toString());
                double resultAdd = num1 / num2;
                resultTextView.setText(resultAdd + "");

            }

        });
    }
}
