package com.example.tablelayout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myList = findViewById(R.id.listView);   //ListView Declaration
        TextView myList2 = findViewById(R.id.textView);  //TextView Declaration

//      Creating ArrayList
        ArrayList<String> list = new ArrayList<>();
        for (int j = 1; j<=10; j++) {
            list.add("" + j);
        }

//      For ListView
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        myList.setAdapter(arrayAdapter);

//      For TextView
        for (int i = 0; i < list.size();i++)
        {
            myList2.append(list.get(i));
        }

    }
}