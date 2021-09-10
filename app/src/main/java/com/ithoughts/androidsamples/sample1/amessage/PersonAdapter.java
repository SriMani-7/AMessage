package com.ithoughts.androidsamples.sample1.amessage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    LinkedList<MPerson> mPeople;
    public PersonAdapter(LinkedList<MPerson> people) {
        this.mPeople = people;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.viewholder_person,null);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.set(mPeople.get(position));
    }

    @Override
    public int getItemCount() {
        return mPeople.size();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder{

        private final TextView name;
        private final TextView message;
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.person_name);
            message = itemView.findViewById(R.id.last_message);
        }

        public void set(MPerson mPerson) {
            name.setText(mPerson.getName());
            message.setText(mPerson.getCaption());
        }
    }
}
