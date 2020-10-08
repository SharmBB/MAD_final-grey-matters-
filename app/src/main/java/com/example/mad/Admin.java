package com.example.mad;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Admin extends AppCompatActivity {
    Button logout,room,pac,emp,book;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_admin );
        logout = findViewById( R.id.log );





        logout.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout = new Intent( Admin.this, Login.class );
                Toast.makeText( getApplicationContext(), "LOGOUT", Toast.LENGTH_SHORT ).show();
                startActivity( logout );
            }
        } );

    }
}
