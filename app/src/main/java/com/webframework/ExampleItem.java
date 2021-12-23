package com.webframework;

public class ExampleItem {
    private String logo, framework, website, deskripsi;


    public ExampleItem(String logo, String framework, String website, String deskripsi) {
        this.logo = logo;
        this.framework = framework;
        this.website = website;
        this.deskripsi = deskripsi;
    }

    public String getLogo() {
        return logo;
    }

    public String getFramework() {
        return framework;
    }

    public String getWebsite() {
        return website;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
