package inducesmile.com.androiddictionaryapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


public class NavigationDrawerLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer_layout);
        //splash screen code
        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(NavigationDrawerLayout.this, MainActivity.class));
                finish();
            }
        }, secondsDelayed * 5000);

    }
}
