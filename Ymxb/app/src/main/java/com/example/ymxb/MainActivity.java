package com.example.ymxb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                m().setText(((getY2() - getY1())/(getX2() - getX1())+ ""));
                b().setText((getY1() - (getY2() - getY1())/(getX2() - getX1()) * getX1()) + "");
            }

        });

    }
        private double getX1() {
            EditText X1 = (EditText) findViewById(R.id.X1);
            return Double.parseDouble(X1.getText().toString());
        }
        private double getX2() {
            EditText X2 = (EditText) findViewById(R.id.X2);
            return Double.parseDouble(X2.getText().toString());
        }
        private double getY1() {
            EditText Y1 = (EditText) findViewById(R.id.Y1);
            return Double.parseDouble(Y1.getText().toString());
        }
        private double getY2 () {
            EditText Y2 = (EditText) findViewById(R.id.Y2);
            return Double.parseDouble(Y2.getText().toString());
        }
        private TextView m() {
            TextView m = (TextView) findViewById(R.id.m);
            return m;
        }
        private TextView b() {
            TextView b = (TextView) findViewById(R.id.b);
            return b;
    }

}