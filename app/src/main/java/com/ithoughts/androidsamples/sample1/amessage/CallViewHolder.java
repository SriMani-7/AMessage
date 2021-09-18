package com.ithoughts.androidsamples.sample1.amessage;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ithoughts.androidsamples.sample1.amessage.databinding.ViewholderCallBinding;

public class CallViewHolder extends PersonAdapter.PersonHolder {

    private final ViewholderCallBinding callBinding;

    public CallViewHolder(@NonNull View itemView) {
        super(itemView);
        callBinding = ViewholderCallBinding.bind(itemView);
    }

    @Override
    public void set(DataCard dataCard) {
        callBinding.time.setText(dataCard.getTime());
        callBinding.name.setText(dataCard.getName());
        callBinding.duration.setText(dataCard.getMessage());
    }

}
