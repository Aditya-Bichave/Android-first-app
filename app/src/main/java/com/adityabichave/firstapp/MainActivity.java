package com.adityabichave.firstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etxUsername = findViewById(R.id.etx_username_activity_main);
        final EditText etxPassword = findViewById(R.id.etx_pwd_activity_main);

        Button btnLogin = findViewById(R.id.btn_login_up_activity_main);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = "Aditya";
                password = "qwertyuiop";

                String susername = etxUsername.getText().toString();
                String spassword = etxPassword.getText().toString();

                if (TextUtils.isEmpty(susername)) {
                    etxUsername.setError("Required");
                    return;
                }
            }
        })
    }
}
