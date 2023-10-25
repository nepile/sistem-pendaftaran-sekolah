package app.views;

import app.controllers.LoginController;

public class LoginView {
    /**
     * Method to show login view
     */
    public static void showLoginView() {
        System.out.println("---------- Please Login ----------");
        LoginController.handleLogin();
    }
}
