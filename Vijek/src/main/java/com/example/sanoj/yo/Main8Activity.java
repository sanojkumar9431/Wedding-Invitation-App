package com.example.sanoj.yo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity {
     Button p,n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        p=(Button)findViewById(R.id.button17);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main8Activity.this,Main7Activity.class);
                startActivity(i);
            }
        });
        n=(Button)findViewById(R.id.button18);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main8Activity.this,Main9Activity.class);
                startActivity(i);
            }
        });
    }
}
