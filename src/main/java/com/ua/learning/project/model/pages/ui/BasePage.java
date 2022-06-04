package com.ua.learning.project.model.pages.ui;

public abstract class BasePage {

    private String pageURL;

    public BasePage(String pageURL) {
        this.pageURL = pageURL;
    }

    public void openWindow() {
        System.out.println(pageURL);
    }
}
