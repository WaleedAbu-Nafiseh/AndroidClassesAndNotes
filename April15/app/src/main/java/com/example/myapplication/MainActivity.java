package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This is the method that needs to be overwritten in order to inflate the menu XML
    //To add the event handlers, there are two options. OnClick ttribute in each of the items or we can have one
    //that can be central to the app

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //we have to create a menuInflater
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String stg;
        if (item.getItemId()==R.id.menu_delete){
            //we know the delete is clicked
             stg = "You clicked the delete button in the mnu;";

        }else if(item.getItemId()==R.id.menu_forward){
             stg = "You clicked the forward  button in the menu;";

        }else{
            stg = "You clicked the share button in the menu ;";

        }
        Log.e("e",stg);
        Toast toast = Toast.makeText(this,stg,Toast.LENGTH_LONG);
        toast.show();
        return super.onOptionsItemSelected(item);
    }
}
