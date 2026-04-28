package com.ipank.loader;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getResources().getIdentifier("activity_main", "layout", getPackageName()));
        
        EditText keyInput = findViewById(getResources().getIdentifier("key_input", "id", getPackageName()));
        Button loginBtn = findViewById(getResources().getIdentifier("login_btn", "id", getPackageName()));

        loginBtn.setOnClickListener(v -> {
            if (keyInput.getText().toString().equals("IPANK_SULTAN")) {
                Toast.makeText(this, "LOGIN SUKSES!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "KEY SALAH!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
