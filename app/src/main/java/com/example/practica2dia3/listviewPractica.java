package com.example.practica2dia3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class listviewPractica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_practica);
        ListView listView =  findViewById(R.id.listViewComponent);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            list.add(Integer.toString(i + 1));
        }
       listView.setAdapter(new ArrayAdapter<>(this, R.layout.activity_elemento, list));

    }
}
