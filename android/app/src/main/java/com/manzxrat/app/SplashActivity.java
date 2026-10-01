package com.manzxrat.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    Button btnSkip;
    Handler handler = new Handler();
    Runnable runnable;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_splash);

        btnSkip = findViewById(R.id.btnSkip);
        btnSkip.setOnClickListener(v -> goToWelcome());

        runnable = this::goToWelcome;
        handler.postDelayed(runnable, 5000);
    }

    private void goToWelcome() {
        startActivity(new Intent(this, WelcomeActivity.class));
        finish();
    }
}