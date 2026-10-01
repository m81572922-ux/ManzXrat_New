package com.manzxrat.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_welcome);

        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnBuy = findViewById(R.id.btnBuy);
        Button btnDeveloper = findViewById(R.id.btnDeveloper);

        btnLogin.setOnClickListener(v ->
            startActivity(new Intent(this, LoginActivity.class)));
        btnBuy.setOnClickListener(v -> openLink("https://t.me/Rohmanzz"));
        btnDeveloper.setOnClickListener(v -> openLink("https://t.me/Rohmanzz"));
    }

    private void openLink(String url) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}