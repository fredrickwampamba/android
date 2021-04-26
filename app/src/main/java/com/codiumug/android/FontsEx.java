package com.codiumug.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FontsEx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fonts_ex);

        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button1);

        Typeface typeface = ResourcesCompat.getFont(this,R.font.cabin_sketch);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTypeface(typeface);
                Toast.makeText(FontsEx.this, "You have Changed the Font Face", Toast.LENGTH_SHORT).show();
            }
        });
    }
}