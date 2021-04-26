package com.codiumug.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewEx extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_ex);

        recyclerView = findViewById(R.id.recyc);

        ArrayList<Contacts> contacts = new ArrayList<>();
        contacts.add(new Contacts("Fredrick Wampamba", "+256 702718025", "fredrickwampamba1@gmail.com", ""));
        contacts.add(new Contacts("Rachel Nakimbugwe", "+256 732343445", "nakimbugwerachel23@gmail.com", ""));
        contacts.add(new Contacts("Rodney Ndawula", "+256 78433242", "ndawularodney23@gmail.com", ""));
        contacts.add(new Contacts("Francis Kiweewa", "+256 75432324", "franciskiweewa23@gmail.com", ""));
        contacts.add(new Contacts("Lenovo industries", "+256 753433223", "support.lenovo@lenovo.com", ""));

        ContactsRecyclerViewAdapter adapter = new ContactsRecyclerViewAdapter();
        adapter.setContacts(contacts);

        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)); //for horizontal layering
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)); // for vertical layering
//        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
    }
}