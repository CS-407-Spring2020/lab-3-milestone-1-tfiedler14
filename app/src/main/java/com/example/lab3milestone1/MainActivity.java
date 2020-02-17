package com.example.lab3milestone1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openDialog();
            }
        });
    }

    public void openDialog(){
        DialogFrag diaFrag = new DialogFrag();
        diaFrag.show(getSupportFragmentManager(), "example");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch(item.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "item 1 selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "item 2 selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "item 3 selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.subitem1:
                Toast.makeText(this, "subitem 1 selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this, "subitem 2 selected", Toast.LENGTH_LONG).show();
                return true;
        default: return super.onOptionsItemSelected(item);
        }
    }
}
