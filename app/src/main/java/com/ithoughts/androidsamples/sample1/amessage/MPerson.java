package com.ithoughts.androidsamples.sample1.amessage;

public class MPerson {

    private String name;
    private String caption;

    public MPerson(String name,String caption){
        this.caption = caption;
        this.name = name;
    }

    public String getCaption() { return caption; }
    public String getName() { return name; }
    public void setCaption(String caption) { this.caption = caption; }
    public void setName(String name) { this.name = name; }
}
