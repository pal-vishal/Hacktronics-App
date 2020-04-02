package me.HacktronicsAavesh.HacktronicsAavesh;

import android.widget.Button;

public class Prize {

    private String title;
    private String info;
    private int imageResource;
    private String button;

    Prize(String title, String info, int imageResource, String button) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
        this.button = button;

    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    String getTitle() {
        return title;
    }


    String getInfo() {
        return info;
    }

    public int getImageResource() {
        return imageResource;
    }

}
