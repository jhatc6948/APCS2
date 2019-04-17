package org.westada.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityBtn = (Button) findViewById(R.id.SecondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.hatchjosh");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                }
            }
        });

        Button firstActivityBtn = (Button) findViewById(R.id.firstActivityBtn);
        firstActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ymxb = getPackageManager().getLaunchIntentForPackage("com.example.ymxb");
                if (ymxb != null) {
                    startActivity(ymxb);
                }
            }
        });
        Button peachBtn = (Button) findViewById(R.id.peachBtn);
        peachBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent peach = getPackageManager().getLaunchIntentForPackage("org.westada.reallistapp");
                if (peach != null) {
                    startActivity(peach);
                }
            }
        });
        Button creatBtn = (Button) findViewById(R.id.creatBtn);
        creatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent creat = getPackageManager().getLaunchIntentForPackage("org.westada.mylistapp");
                if (creat != null) {
                    startActivity(creat);
                }
            }
        });
        Button quadBtn = (Button) findViewById(R.id.quadBtn);
        quadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quad = getPackageManager().getLaunchIntentForPackage("org.westada.quadraticapp");
                if (quad != null) {
                    startActivity(quad);
                }
            }
        });
    }
}
