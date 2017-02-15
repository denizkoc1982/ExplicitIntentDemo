package com.gulbalasalamov.explicitintentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityOne extends AppCompatActivity {
    TextView tv1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        tv1 = (TextView) findViewById(R.id.tv1);
        btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityOne.this, ActivityTwo.class);
                startActivity(i);
                Toast.makeText(ActivityOne.this, "Bir sonraki aktiviteye gecildi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
