package com.example.familymovienight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView ListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView = findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("movie1");
        arrayList.add("movie2");
        arrayList.add("movie2");
        arrayList.add("movie2");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");
        arrayList.add("movie1");





        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        ListView.setAdapter(arrayAdapter);
        

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"clicked item:" + position +" "+arrayList.get(position).toString(),Toast.LENGTH_SHORT).show();

            }
        });

    }
}