package org.westada.quadraticapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.westada.quadraticapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                //a().setText((getX1()*(getY3()-getY2())+getX2()*(getY1()-getY3())+getX3()*(getY2()-getY1())/((getX1()-getX2())*(getX1()-getX3())*(getX2()-getX3())))+ "");
                a().setText(((getX1()*(getY3()-getY2())+getX2()*(getY1()-getY3())+getX3()*(getY2()-getY1()))/((getX1()-getX2())*(getX1()-getX3())*(getX2()-getX3()))) + " ");
                //b().setText((((getY2()-getY1())/(getX2()-getX1()))-((getX1()*(getY3()-getY2())+getX2()*(getY1()-getY3())+getX3()*(getY2()-getY1())/((getX1()-getX2())*(getX1()-getX3())*(getX2()-getX3())))*(getX1()+getX2()))) + "");
                b().setText((((getY2()-getY1())/(getX2()-getX1()))-(((getX1()*(getY3()-getY2())+getX2()*(getY1()-getY3())+getX3()*(getY2()-getY1()))/((getX1()-getX2())*(getX1()-getX3())*(getX2()-getX3())))*(getX1()+getX2())))+ " ");
                //c().setText(getY1()-((getX1()*(getY3()-getY2())+getX2()*(getY1()-getY3())+getX3()*(getY2()-getY1())/((getX1()-getX2())*(getX1()-getX3())*(getX2()-getX3())))*(getX1()*getX1())-((((getY2()-getY1())/(getX2()-getX1()))-((getX1()*(getY3()-getY2())+getX2()*(getY1()-getY3())+getX3()*(getY2()-getY1())/((getX1()-getX2())*(getX1()-getX3())*(getX2()-getX3())))*(getX1()+getX2())))*getX1())) + "");
                c().setText((getY1()-(((getX1()*(getY3()-getY2())+getX2()*(getY1()-getY3())+getX3()*(getY2()-getY1()))/((getX1()-getX2())*(getX1()-getX3())*(getX2()-getX3())))*(getX1()*getX1()))-((((getY2()-getY1())/(getX2()-getX1()))-(((getX1()*(getY3()-getY2())+getX2()*(getY1()-getY3())+getX3()*(getY2()-getY1()))/((getX1()-getX2())*(getX1()-getX3())*(getX2()-getX3())))*(getX1()+getX2())))*getX1()))+ " ");
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
    private double getX3() {
        EditText X3 = (EditText) findViewById(R.id.X3);
        return Double.parseDouble(X3.getText().toString());
    }
    private double getY3() {
        EditText Y3 = (EditText) findViewById(R.id.Y3);
        return Double.parseDouble(Y3.getText().toString());
    }
    private TextView a() {
        TextView a = (TextView) findViewById(R.id.a);
        return a;
    }
    private TextView b() {
        TextView b = (TextView) findViewById(R.id.b);
        return b;
    }
    private TextView c() {
        TextView c = (TextView) findViewById(R.id.c);
        return c;
    }

        }