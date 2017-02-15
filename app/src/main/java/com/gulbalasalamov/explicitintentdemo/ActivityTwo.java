package com.gulbalasalamov.explicitintentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {
    Button btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        ;
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityTwo.this, ActivityOne.class);
                startActivity(i);
                Toast.makeText(ActivityTwo.this, "Bir onceki aktivitiye geri donuldu", Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityTwo.this, ActivityThree.class);
                startActivity(i);
                Toast.makeText(ActivityTwo.this, "Bir sonraki aktivitiye gecildi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
