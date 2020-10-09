package com.example.it19121802;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin extends AppCompatActivity {
    Button room;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        room = findViewById( R.id.empa );


        room.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent room = new Intent( Admin.this, ADroom.class );
                startActivity( room );
            }
        } );
    }



}