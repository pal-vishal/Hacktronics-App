package me.HacktronicsAavesh.HacktronicsAavesh;

public class Prize {

    private String title;
    private String info;
    private int imageResource;


    Prize(String title, String info,int imageResource) {
        this.title = title;
        this.info = info;
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
