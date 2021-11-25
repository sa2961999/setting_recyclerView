package com.example.setting_rv;

public class settingItem {
    String title;
    String subtitle;
    int ImageId;

    public settingItem(String title, String subtitle, int imageId) {
        this.title = title;
        this.subtitle = subtitle;
        ImageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
}
