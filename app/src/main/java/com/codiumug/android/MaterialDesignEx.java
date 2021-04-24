package com.codiumug.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MaterialDesignEx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design_ex);

        FloatingActionButton floatingActionButton = findViewById(R.id.floatButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MaterialDesignEx.this, "You have clicked the Floating action Button", Toast.LENGTH_SHORT).show();
            }
        });

    }
}