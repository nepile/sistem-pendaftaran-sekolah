package app.views;

import app.controllers.RootController;

public class RootView {
    /**
     * Method to get data title from setTitle method
     */
    public static void getTitle() {
        String path = "D:\\Java Journey\\sistem-pendaftaran-sekolah\\src\\app\\data\\title.txt";
        RootController.setTitle(path);
    }

    /**
     * Method to show the root view
     */
    public static void showRootView() {
        getTitle();
    }
}