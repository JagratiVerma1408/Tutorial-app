package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e,e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        e=findViewById(R.id.editText);
        e1=findViewById(R.id.editText1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=e.getText().toString();
                String p=e1.getText().toString();
                String p1="andriod";
                if(p.equals(p1)){
                    Intent i=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(i);}
                else{
                    Toast.makeText(getApplicationContext(), "password is incorrect", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
