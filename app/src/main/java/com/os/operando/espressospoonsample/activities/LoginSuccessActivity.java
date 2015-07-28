package com.os.operando.espressospoonsample.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.os.operando.espressospoonsample.R;

public class LoginSuccessActivity extends AppCompatActivity {

    private static final String EMAIL = "email";

    public static Intent createIntent(Context context, String email) {
        Intent i = new Intent(context, LoginSuccessActivity.class);
        i.putExtra(EMAIL, email);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);
        ((TextView) findViewById(R.id.login_success_message)).setText("Welcome " + getIntent().getStringExtra(EMAIL));
    }
}
