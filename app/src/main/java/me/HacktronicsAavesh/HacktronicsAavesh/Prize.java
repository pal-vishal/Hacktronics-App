package me.HacktronicsAavesh.HacktronicsAavesh;

import android.widget.Button;

public class Prize {


    private String info;
    private int imageResource;


    Prize(String info, int imageResource) {

        this.info = info;
        this.imageResource = imageResource;


    }


    public void setInfo(String info) {
        this.info = info;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }


    String getInfo() {
        return info;
    }

    public int getImageResource() {
        return imageResource;
    }

}
