package com.vrishankgupta.chatting.classes;

/**
 * Created by shivam on 13/03/18.
 */

public class eventdetail {

    String heading;
    String about;
    String photoadd;



    public eventdetail(String heading, String about) {
        this.heading = heading;
        this.about = about;
        this.photoadd=photoadd;

    }

    public String getHeading() {
        return heading;
    }

    public String getPhotoadd() {
        return photoadd;
    }

    public void setPhotoadd(String photoadd) {
        this.photoadd = photoadd;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
