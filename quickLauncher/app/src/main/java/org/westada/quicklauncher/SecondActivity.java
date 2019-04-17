package org.westada.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.hatchjosh");
        if (launchIntent != null) {
            startActivity(launchIntent);
        }
        Intent ymxb = getPackageManager().getLaunchIntentForPackage("com.example.ymxb");
        if (ymxb != null) {
            startActivity(ymxb);//null pointer check in case package name was not found
        }
        Intent peach = getPackageManager().getLaunchIntentForPackage("org.westada.reallistapp");
        if (peach != null) {
            startActivity(peach);//null pointer check in case package name was not found
        }
        Intent creat = getPackageManager().getLaunchIntentForPackage("org.westada.mylistapp");
        if (creat != null) {
            startActivity(creat);//null pointer check in case package name was not found
        }
        Intent quad = getPackageManager().getLaunchIntentForPackage("org.westada.quadraticapp");
        if (quad != null) {
            startActivity(quad);//null pointer check in case package name was not found
        }
    }
}
