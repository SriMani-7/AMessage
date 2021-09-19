package com.ithoughts.androidsamples.sample1.amessage;

import android.view.View;

import androidx.annotation.NonNull;

import com.ithoughts.androidsamples.sample1.amessage.databinding.ViewholderStatusBinding;

public class StatusViewHolder extends PersonAdapter.PersonHolder {

    private final ViewholderStatusBinding statusBinding;

    public StatusViewHolder(@NonNull View itemView) {
        super(itemView);
        statusBinding = ViewholderStatusBinding.bind(itemView);
    }

    @Override
    public void set(DataCard dataCard) {
        statusBinding.time.setText(dataCard.getTime());
        statusBinding.name.setText(dataCard.getName());

    }
}
