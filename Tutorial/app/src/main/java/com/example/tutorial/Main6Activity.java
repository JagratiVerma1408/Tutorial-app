package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main6Activity extends AppCompatActivity {
    ListView listView;
    String list1[]={"1. Graph",
            "2. Linked List",
            "3. Dynamic Programming",
            "4. Sorting And Searching",
            "5. Tree / Binary Search Tree",
            "6. Number Theory",
            "7. BIT Manipulation",
            "8. String / Array"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        listView=findViewById(R.id.listview3);
        ArrayAdapter a = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, list1);
        listView.setAdapter(a);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent i= new Intent(getApplicationContext(),Main15Activity.class);
                    startActivity(i);

                }
                if (position==1){
                    Intent i= new Intent(getApplicationContext(),Main16Activity.class);
                    startActivity(i);

                }
                if (position==2){
                    Intent i= new Intent(getApplicationContext(),Main17Activity.class);
                    startActivity(i);

                }
                if (position==3){
                    Intent i= new Intent(getApplicationContext(),Main18Activity.class);
                    startActivity(i);

                }
                if (position==4){
                    Intent i= new Intent(getApplicationContext(),Main19Activity.class);
                    startActivity(i);

                }


                }



        });

    }
}
