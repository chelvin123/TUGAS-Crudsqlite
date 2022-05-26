package com.mega2.belajarlistviewandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ListView ListViewT;
private ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewT = findViewById(R.id.ListView);
        adapter = ArrayAdapter.createFromResource( this,R.array.jenjang, android.R.layout.simple_list_item_1);
        ListViewT.setAdapter(adapter);
        ListViewT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText( MainActivity.this, adapter.getItem(i)+"Dipilih",Toast.LENGTH_SHORT).show();
            }
        });

    }
}