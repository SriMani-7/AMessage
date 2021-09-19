package com.ithoughts.androidsamples.sample1.amessage;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;

import java.util.LinkedList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonHolder> {

    private final int which;

    public PersonAdapter(int which) {
        this.which = which;
    }

    @NonNull
    @Override
    public PersonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (which){
            case MainPageFragment.CHATS:
            case MainPageFragment.GROUPS:
                view = View.inflate(parent.getContext(), R.layout.viewholder_chat, null);
                return new ChatViewHolder(view);
            case MainPageFragment.CALLS:
                view = View.inflate(parent.getContext(), R.layout.viewholder_call, null);
                return new CallViewHolder(view);
        }
        view = View.inflate(parent.getContext(), R.layout.viewholder_status, null);
        return new StatusViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PersonHolder holder, int position) {
        //holder.set(dataCards.get(position));
    }

    @Override
    public int getItemCount() {
        return 25;
    }

    public static abstract class PersonHolder extends RecyclerView.ViewHolder{

        public PersonHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        }
        public abstract void set(DataCard dataCard);
    }
}
