package com.example.todolist_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText e;
    List<String> ls=new ArrayList<String>();
    Button b;
    ListView lv;
    singlejava adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=findViewById(R.id.editText3);
        b=findViewById(R.id.button2);
        lv=findViewById(R.id.listview);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ls.add(e.getText().toString());
                adp=new singlejava(MainActivity.this,ls);
                lv.setAdapter(adp);
                e.setText("");
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ls.remove(position);
                adp.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Added Value", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
