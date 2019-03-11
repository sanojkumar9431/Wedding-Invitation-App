package com.example.sanoj.yo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity {
   Button p,n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        p=(Button)findViewById(R.id.button15);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main7Activity.this,Main6Activity.class);
                startActivity(i);
            }
        });
        n=(Button)findViewById(R.id.button16);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main7Activity.this,Main8Activity.class);
                startActivity(i);
            }
        });
    }
}
