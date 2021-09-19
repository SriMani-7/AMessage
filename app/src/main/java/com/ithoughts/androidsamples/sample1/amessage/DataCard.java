package com.ithoughts.androidsamples.sample1.amessage;

import android.graphics.Bitmap;

public class DataCard {

    private String name;
    private String message,time;
    private int unread;
    private Pointer pointer;
    private Bitmap displayPicture;

    public DataCard(){
    }

    public String getMessage() { return message; }
    public String getName() { return name; }
    public void setMessage(String message) { this.message = message; }
    public void setName(String name) { this.name = name; }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getunread() {
        return Integer.toString(unread);
    }
    public void setUnread(int unread) {
        this.unread = unread;
    }
    public void setPointer(Pointer pointer) {
        this.pointer = pointer;
    }
    public Pointer getPointer() {
        return pointer;
    }
    public Bitmap getDisplayPicture() {
        return displayPicture;
    }
    public void setDisplayPicture(Bitmap displayPicture) {
        this.displayPicture = displayPicture;
    }

    public enum Pointer {
        SEND,UNREAD,READ,NOT_SEND,
        SENDER,MEMBER,
        SELF,
    }
}
