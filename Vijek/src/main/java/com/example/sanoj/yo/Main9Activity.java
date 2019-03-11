package com.example.sanoj.yo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.jar.Attributes;

public class Main9Activity extends AppCompatActivity {
    EditText name,address,relation,contact,date;
    Button button,home;
    DatabaseReference reff;
    Member member;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);



        name=(EditText)findViewById(R.id.n1) ;
        address=(EditText)findViewById(R.id.a2) ;
        relation=(EditText)findViewById(R.id.r3) ;
        contact=(EditText)findViewById(R.id.c4) ;
        date=(EditText)findViewById(R.id.d5) ;
        button=(Button)findViewById(R.id.b9) ;

        home=(Button)findViewById(R.id.button21);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main9Activity.this,MainActivity.class);
                startActivity(i);
            }
        });
        member=new Member();
        reff=FirebaseDatabase.getInstance().getReference().child("Member");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                member.setName(name.getText().toString().trim());
                member.setAddress(address.getText().toString().trim());
                member.setRelation(relation.getText().toString().trim());
                member.setContact(contact.getText().toString().trim());
                member.setCommingDate(date.getText().toString().trim());

                reff.push().setValue(member);


                Toast.makeText(Main9Activity.this, "data inserted", Toast.LENGTH_LONG).show();
                Intent i = new Intent(Main9Activity.this, MainActivity.class);
                startActivity(i);
           }

        });
    }
}
