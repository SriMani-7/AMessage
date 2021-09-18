package com.ithoughts.androidsamples.sample1.amessage;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonHolder> {

    LinkedList<DataCard> dataCards;
    private final int which;

    public PersonAdapter(LinkedList<DataCard> people, int which) {
        this.dataCards = people;
        this.which = which;
    }

    @NonNull
    @Override
    public PersonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (which){
            case MainPageFragment.CHATS:
            case MainPageFragment.GROUPS:
                View view = View.inflate(parent.getContext(), R.layout.viewholder_chat, null);
                return new ChatViewHolder(view);
            case MainPageFragment.CALLS:
                view = View.inflate(parent.getContext(), R.layout.viewholder_call, null);
                return new CallViewHolder(view);
        }
        View view = View.inflate(parent.getContext(), R.layout.viewholder_status, null);
        return new StatusViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PersonHolder holder, int position) {
        holder.set(dataCards.get(position));
    }

    @Override
    public int getItemCount() {
        return dataCards.size();
    }

    public static abstract class PersonHolder extends RecyclerView.ViewHolder{

        public PersonHolder(@NonNull View itemView) {
            super(itemView);
        }
        public abstract void set(DataCard dataCard);
    }
}
