package com.ithoughts.androidsamples.sample1.amessage;

import android.view.View;

import androidx.annotation.NonNull;

import com.ithoughts.androidsamples.sample1.amessage.databinding.ViewholderChatBinding;

public class ChatViewHolder extends PersonAdapter.PersonHolder {

    private final ViewholderChatBinding chatBinding;

    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);
        chatBinding = ViewholderChatBinding.bind(itemView);
    }

    @Override
    public void set(DataCard dataCard) {
        //chatBinding.displayPicture.setImageBitmap(dataCard.getDisplayPicture());
        chatBinding.message.setText(dataCard.getMessage());
        chatBinding.name.setText(dataCard.getName());
        chatBinding.time.setText(dataCard.getTime());
        chatBinding.unread.setText(dataCard.getunread());

    }
}
