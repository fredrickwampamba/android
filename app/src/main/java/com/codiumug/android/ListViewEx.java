package com.codiumug.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewEx extends AppCompatActivity {

    private ListView citiesList;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        citiesList = findViewById(R.id.listXMl);
        spinner = findViewById(R.id.spinner);
//
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Brad");
//        names.add("James");
//        names.add("Joan");
//        names.add("Olivia");
//        names.add("Jesca");
//        names.add("Rachel");
//        names.add("Fredrick");
//        names.add("Francis");
//        names.add("Carolyn");
//
//        ArrayAdapter<String> arrayAdapterNames = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, names);
//        spinner.setAdapter(arrayAdapterNames);
//

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Minisota");
        cities.add("Kampala");
        cities.add("Wakiso");
        cities.add("Katwe");
        cities.add("Gulu");
        cities.add("Kazinga");
        cities.add("Mbarara");
        cities.add("Mbale");
        cities.add("Kisoro");
        cities.add("Berlin");
        cities.add("Zurich");
        cities.add("London");
        cities.add("Manchester");
        cities.add("Dubai");
        cities.add("Abudabi");
        cities.add("Qatar");
        cities.add("Nairobi");
        cities.add("Illinois");
        cities.add("New York");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cities);

        citiesList.setAdapter(arrayAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewEx.this, cities.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}