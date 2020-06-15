package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    ListView listView;
    String list1[]={"1.Fibbonaci Series(with and without recursion)",
            "2.Prime Numbers ",
            "3.Palindrome ",
            "4.Factorial ",
            "5.Amstrong",
            "6.Bubble Sort",
            "7.Selection Sort",
            "8.Binary Search "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        listView=findViewById(R.id.listView1);
        ArrayAdapter a = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, list1);
        listView.setAdapter(a);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent i= new Intent(getApplicationContext(),Main7Activity.class);
                    startActivity(i);

                }
                if (position==1){
                    Intent i= new Intent(getApplicationContext(),Main8Activity.class);
                    startActivity(i);

                }
                if (position==2){
                    Intent i= new Intent(getApplicationContext(),Main9Activity.class);
                    startActivity(i);

                }
                if (position==4){
                    Intent i= new Intent(getApplicationContext(),Main10Activity.class);
                    startActivity(i);

                }
                if (position==5){
                    Intent i= new Intent(getApplicationContext(),Main12Activity.class);
                    startActivity(i);

                }
                if (position==6){
                    Intent i= new Intent(getApplicationContext(),Main13Activity.class);
                    startActivity(i);

                } if (position==7){
                    Intent i= new Intent(getApplicationContext(),Main14Activity.class);
                    startActivity(i);

                }


            }
        });

    }
}
