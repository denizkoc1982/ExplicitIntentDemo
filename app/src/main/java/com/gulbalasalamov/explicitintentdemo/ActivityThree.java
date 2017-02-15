package com.gulbalasalamov.explicitintentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityThree extends AppCompatActivity {
    TextView tv3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        tv3 = (TextView) findViewById(R.id.tv3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityThree.this, ActivityTwo.class);
                startActivity(i);
                Toast.makeText(ActivityThree.this, "Bir onceki aktivitiye geri donuldu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
