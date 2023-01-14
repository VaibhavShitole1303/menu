package com.example.menu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ok;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok =findViewById(R.id.btnok);


    }
    //option menu
    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreatePanelMenu(featureId, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid=item.getItemId();
        if (itemid==R.id.setting){
            Toast.makeText(getApplicationContext(), "setting", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (itemid==R.id.abc){
            Toast.makeText(getApplicationContext(), "abc", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (itemid==R.id.brightness){
            Toast.makeText(getApplicationContext(), "brightness", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (itemid==R.id.ok){
            Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (itemid==R.id.about){
            Toast.makeText(getApplicationContext(), "about", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.popupmenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int itemid=item.getItemId();
        if (itemid==R.id.like){
            Toast.makeText(getApplicationContext(), "like", Toast.LENGTH_LONG).show();
            return true;

        }
        else if (itemid==R.id.share){
            Toast.makeText(getApplicationContext(), "share", Toast.LENGTH_LONG).show();
            return true;
        } else if (itemid == R.id.subscribe) {
            Toast.makeText(getApplicationContext(), "subscribe", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onContextItemSelected(item);
    }
}