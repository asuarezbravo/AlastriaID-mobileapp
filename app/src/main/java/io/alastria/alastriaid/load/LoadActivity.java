package io.alastria.alastriaid.load;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.alastria.alastriaid.R;
import io.alastria.alastriaid.home.HomeActivity;
import io.alastria.alastriaid.login.LoginActivity;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public class LoadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        final Intent _intent = new Intent(this, LoginActivity.class);

//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {

                startActivity(_intent);
                finish();
//            }
//        }, 3000);
    }
}
