package com.codiumug.android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        Button recyclerView = findViewById(R.id.recView);
        Button recycCard = findViewById(R.id.recycCard);
        Button listView = findViewById(R.id.listView);
        Button materialDesign = findViewById(R.id.materialDesign);
        TextView fname = findViewById(R.id.fname);
        TextView lname = findViewById(R.id.lname);
        TextView eMail = findViewById(R.id.eMail);
        EditText firstname = findViewById(R.id.firstname);
        EditText lastname = findViewById(R.id.lastname);
        EditText email = findViewById(R.id.email);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fname.setText(firstname.getText().toString().trim());
                lname.setText(lastname.getText().toString().trim());
                eMail.setText(email.getText().toString().trim());
            }
        });

        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listviewActivity = new Intent(MainActivity.this, ListViewEx.class);
                startActivity(listviewActivity);
            }
        });

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recyclerV = new Intent(MainActivity.this, RecyclerViewEx.class);
                startActivity(recyclerV);
            }
        });

        recycCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recyclerVCard = new Intent(MainActivity.this, CardViewRecyc.class);
                startActivity(recyclerVCard);
            }
        });

        materialDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent materialActivity = new Intent(MainActivity.this, MaterialDesignEx.class);
                startActivity(materialActivity);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings:
                Toast.makeText(this, "Settings menu item selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.about:
                Toast.makeText(this, "About menu item Selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}