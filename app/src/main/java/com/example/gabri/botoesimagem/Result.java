package com.example.gabri.botoesimagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {

    TextView textView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final Intent intent = getIntent();

        String opção = intent.getStringExtra("option");

        Toast.makeText(this, opção, Toast.LENGTH_SHORT).show();

        textView7 = (TextView)findViewById(R.id.textView7);

        textView7.setText(opção);
    }
}
