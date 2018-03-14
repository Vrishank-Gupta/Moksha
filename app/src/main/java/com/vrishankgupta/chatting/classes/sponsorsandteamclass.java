package com.vrishankgupta.chatting.classes;

/**
 * Created by shivam on 13/03/18.
 */

public class sponsorsandteamclass {

    String photoaddress;
    String name;

    public sponsorsandteamclass(String photoaddress, String name) {
        this.photoaddress = photoaddress;
        this.name = name;
    }

    public String getPhotoaddress() {
        return photoaddress;
    }

    public void setPhotoaddress(String photoaddress) {
        this.photoaddress = photoaddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
