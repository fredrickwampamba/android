package com.codiumug.android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsRecyclerCardView extends RecyclerView.Adapter<ContactsRecyclerCardView.ViewHolder> {

    ArrayList<Contacts> contacts = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_view_recyc,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.contactName.setText(contacts.get(position).getContactName());
        holder.phoneNumber.setText(contacts.get(position).getPhoneNumber());
        holder.contactEmail.setText(contacts.get(position).getContactEmail());
//        holder.imageView.;
        holder.contactName.setText(contacts.get(position).getContactName());
        holder.contactName.setText(contacts.get(position).getContactName());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView contactName, contactEmail, phoneNumber;
        private ImageView imageView;
        private Button callBtn,deleteBtn,emailBtn;
        private CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contactName = itemView.findViewById(R.id.contactName);
            contactEmail = itemView.findViewById(R.id.email);
            phoneNumber = itemView.findViewById(R.id.phoneNumber);
            imageView = itemView.findViewById(R.id.image);
            cardView = itemView.findViewById(R.id.parent);

            emailBtn = itemView.findViewById(R.id.Email);
            deleteBtn = itemView.findViewById(R.id.Delete);
            callBtn = itemView.findViewById(R.id.call);
        }
    }
}
