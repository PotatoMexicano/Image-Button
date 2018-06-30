package com.example.gabri.botoesimagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Biologicas extends AppCompatActivity {

    TextView textView3;
    ImageButton imageButton1;
    ImageButton imageButton4;
    TextView textView5;

    String img1;
    String img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biologicas);

        imageButton1 =(ImageButton)findViewById(R.id.imageButton1);
        imageButton4 = (ImageButton)findViewById(R.id.imageButton4);

        final Intent intent = getIntent();
        String nickname = intent.getStringExtra("nickname");
        String spinner_option = intent.getStringExtra("spinner_option");

        textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setText(nickname);

        textView5 = (TextView)findViewById(R.id.textView5);
        textView5.setText(spinner_option);

        switch (spinner_option){
            case "Biológicas":
                imageButton1.setBackgroundResource(R.drawable.pear);
                img1 = "Pera";
                imageButton4.setBackgroundResource(R.drawable.mouse);
                img2 = "Rato";
                break;
            case "Humanas":
                imageButton1.setBackgroundResource(R.drawable.human_happy);
                img1 = "Humano";
                imageButton4.setBackgroundResource(R.drawable.brain);
                img2 = "Cerebro";
                break;
            case "Exatas":
                imageButton1.setBackgroundResource(R.drawable.saturn);
                img1 = "Saturno";
                imageButton4.setBackgroundResource(R.drawable.function);
                img2 = "Função";
                break;
        }
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Biologicas.this, Result.class);
                intent.putExtra("option",img1.toString());
                startActivity(intent);
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Biologicas.this, Result.class);
                intent2.putExtra("option",img2.toString());
                startActivity(intent2);
            }
        });
    }
}
