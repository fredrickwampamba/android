package com.codiumug.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CardViewRecyc extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_recyc);

        recyclerView = findViewById(R.id.recycler);

        ArrayList<Contacts> contacts = new ArrayList<>();
        contacts.add(new Contacts("Fredrick Wampamba", "+256 702718025", "fredrickwampamba1@gmail.com", "https://i.pinimg.com/originals/a9/ed/8c/a9ed8cec6191c2c8623199bc6d8c521b.jpg"));
        contacts.add(new Contacts("Rachel Nakimbugwe", "+256 732343445", "nakimbugwerachel23@gmail.com", "https://i.pinimg.com/originals/97/04/14/970414b19f6bbeb2197cf07371ec7bfb.jpg"));
        contacts.add(new Contacts("Rodney Ndawula", "+256 78433242", "ndawularodney23@gmail.com", "https://i.pinimg.com/originals/97/e4/2a/97e42a82fc7911961d3ca55f54d1372c.jpg"));
        contacts.add(new Contacts("Nandawula Phiona", "+256 75432324", "phionananda34@gmail.com", "https://64.media.tumblr.com/045ca4294f1c210226326a9bd26e9c27/tumblr_nbt5o2W2KK1r6ijl6o1_500.jpg"));
        contacts.add(new Contacts("Lenovo industries", "+256 753433223", "support.lenovo@lenovo.com", "https://drivermarket.net/wp-content/uploads/2020/06/Lenovo-Driver-Update.png"));

        ContactsRecyclerCardViewAdapter adapter = new ContactsRecyclerCardViewAdapter(this);
        adapter.setContacts(contacts);

        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)); //for horizontal layering
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)); // for vertical layering
//        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

    }
}