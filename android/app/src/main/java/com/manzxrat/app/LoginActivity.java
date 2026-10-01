package com.manzxrat.app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnLogin, btnBuy;

    private static final String OWNER_USER = "MANZZ";
    private static final String OWNER_PASS = "STOKMAN1";

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnBuy = findViewById(R.id.btnBuy);

        btnLogin.setOnClickListener(v -> {
            String u = etUsername.getText().toString().trim();
            String p = etPassword.getText().toString().trim();

            if (u.equals(OWNER_USER) && p.equals(OWNER_PASS)) {
                SharedPreferences sp = getSharedPreferences("auth", MODE_PRIVATE);
                sp.edit()
                    .putString("username", u)
                    .putString("role", "DEV")
                    .putBoolean("isLogin", true)
                    .apply();
                startActivity(new Intent(this, MainActivity.class));
                finish();
            } else {
                Toast.makeText(this, "Login Gagal!", Toast.LENGTH_SHORT).show();
            }
        });

        btnBuy.setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://t.me/Rohmanzz"));
            startActivity(i);
        });
    }
}