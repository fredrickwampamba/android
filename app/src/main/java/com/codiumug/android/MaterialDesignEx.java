package com.codiumug.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MaterialDesignEx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design_ex);

        RelativeLayout parent = findViewById(R.id.parent);
        Button displaySnackBar = findViewById(R.id.button1);
        displaySnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //We are going to display Snack Bar here
                Snackbar.make(parent,"You just displayed the snack bar", Snackbar.LENGTH_INDEFINITE).show();
            }
        });

        FloatingActionButton floatingActionButton = findViewById(R.id.floatButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MaterialDesignEx.this, "You have clicked the Floating action Button", Toast.LENGTH_SHORT).show();
            }
        });

    }
}