package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    ListView listView;
    String[] web = {
            "      JAVA",
            "      PYTHON",
            "      C++",
            "      DATA STRUCTURE",

    } ;
    Integer[] imageId = {
            R.drawable.download3,
            R.drawable.image2,
            R.drawable.download5,
            R.drawable.download,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView=findViewById(R.id.listView1);
        CustomList adapter = new
                CustomList(Main2Activity.this, web, imageId);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent i= new Intent(getApplicationContext(),Main3Activity.class);
                    startActivity(i);

                }
                if (position==1){
                    Intent i= new Intent(getApplicationContext(),Main4Activity.class);
                    startActivity(i);

                }
                if (position==2){
                    Intent i= new Intent(getApplicationContext(),Main5Activity.class);
                    startActivity(i);

                }
                if (position==3){
                    Intent i= new Intent(getApplicationContext(),Main6Activity.class);
                    startActivity(i);

                }
            }
        });

    }
}
