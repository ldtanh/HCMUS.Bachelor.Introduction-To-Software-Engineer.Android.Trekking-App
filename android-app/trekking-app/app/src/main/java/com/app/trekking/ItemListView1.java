package com.app.trekking;

/**
 * Created by taipham on 28/04/2018.
 */

public class ItemListView1 {
    private String linkImage;
    private String noiDung;

    public ItemListView1(String linkImage, String noiDung) {
        this.linkImage = linkImage;
        this.noiDung = noiDung;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
}
