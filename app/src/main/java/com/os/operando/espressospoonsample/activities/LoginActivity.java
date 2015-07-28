package com.os.operando.espressospoonsample.activities;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.os.operando.espressospoonsample.R;

public class LoginActivity extends AppCompatActivity {

    private static final String LOGIN_EMAIL = "test@test.com";
    private static final String LOGIN_PASS = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLogin(View v) {
        String email = ((EditText) findViewById(R.id.email)).getText().toString();
        String pass = ((EditText) findViewById(R.id.pass)).getText().toString();

        if (LOGIN_EMAIL.equals(email) && LOGIN_PASS.equals(pass)) {
            startActivity(LoginSuccessActivity.createIntent(this, email));
            finish();
        } else {
            AlertDialog.Builder b = new AlertDialog.Builder(this);
            b.setTitle("Login").setMessage("NO!!!!!").setPositiveButton("OK", null).create().show();
        }
    }
}
