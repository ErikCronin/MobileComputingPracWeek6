package com.derk.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView todolist = findViewById(R.id.overlycomplicated);
        ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter<>(this, R.layout.item);
        todolist.setAdapter(adapter);
        adapter.addAll("buy milk", "wash car", "call mum");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:

                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
