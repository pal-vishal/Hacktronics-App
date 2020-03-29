package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import me.HacktronicsAavesh.bottomnavbar.R;

public class LoginActivity extends AppCompatActivity {

    public void animate_logo() {
        Timer timer;
        ImageView h1 = (ImageView) findViewById(R.id.h1);
        final ImageView h2 = (ImageView) findViewById(R.id.h2);
        final ImageView h3 = (ImageView) findViewById(R.id.h3);
        final ImageView h4 = (ImageView) findViewById(R.id.h4);
        final ImageView h5 = (ImageView) findViewById(R.id.h5);
        final ImageView h6 = (ImageView) findViewById(R.id.h6);
        final ImageView h7 = (ImageView) findViewById(R.id.h7);
        h1.setX(1000);
        h2.setX(-1000);
        h4.setX(1000);
        h5.setX(-1000);
        h6.setY(1500);
        h1.animate().translationXBy(-1000).setDuration(2000);
        new CountDownTimer(1000, 1000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                h2.animate().translationXBy(1000).setDuration(2000);
            }
        }.start();
      /*  new CountDownTimer(2000, 1000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                h4.animate().translationXBy(-1000).setDuration(2000);
            }
        }.start();

        new CountDownTimer(3000, 1000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                h5.animate().translationXBy(1000).setDuration(2000);
            }
        }.start();
*/
        new CountDownTimer(2000, 1000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                h6.animate().translationYBy(-1500).setDuration(2500);
            }
        }.start();
        new CountDownTimer(4600, 1000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                h3.animate().alpha(1).setDuration(2000);
            }
        }.start();

        new CountDownTimer(6100, 1000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                h7.animate().alpha(1).setDuration(2000);
            }
        }.start();

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 12000);
    }

    public void function(View view) {
        EditText textname = (EditText) findViewById(R.id.usrusr);
        String username = textname.getText().toString();
        EditText textname1 = (EditText) findViewById(R.id.password);
        String password = textname1.getText().toString();
        if ((username.equals("abc")) && (password.equals("123"))) {
            setContentView(R.layout.home);
            animate_logo();
        } else {
            Toast.makeText(this, "Wrong username or password", Toast.LENGTH_SHORT).show();
        }
    }

    public void function1(View view) {
        setContentView(R.layout.home);
        animate_logo();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Hacktronics 2020");
        String title = actionBar.getTitle().toString();
        actionBar.hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView main = (ImageView) findViewById(R.id.final_img);
        final FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frame);
        main.animate().alpha(1).setDuration(3500);
        new CountDownTimer(3500, 1000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                main.animate().translationYBy(-450).setDuration(800);
            }
        }.start();
        new CountDownTimer(4500, 1000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                frameLayout.animate().alpha(1).setDuration(1000);
            }
        }.start();


    }
}
