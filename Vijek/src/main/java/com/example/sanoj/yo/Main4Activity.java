package com.example.sanoj.yo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    Button p,n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        p=(Button)findViewById(R.id.button10);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main4Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });
        n=(Button)findViewById(R.id.button8);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(i);
            }
        });
    }
}
