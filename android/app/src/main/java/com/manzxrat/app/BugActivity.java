package com.manzxrat.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class BugActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_bug);

        ImageView btnBack = findViewById(R.id.btnBack);
        Button btnLaunch = findViewById(R.id.btnLaunch);
        EditText etTarget = findViewById(R.id.etTarget);

        btnBack.setOnClickListener(v -> finish());
        btnLaunch.setOnClickListener(v -> {
            String target = etTarget.getText().toString().trim();
            if (target.isEmpty()) {
                Toast.makeText(this, "Isi target dulu!", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this, "Bug terkirim ke " + target, Toast.LENGTH_SHORT).show();
        });
    }
}