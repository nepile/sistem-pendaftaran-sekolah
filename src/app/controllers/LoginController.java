package app.controllers;

import app.models.UsersModel;
import app.services.InputData;
import app.views.DashboardView;
// import app.views.RootView;
import app.views.LoginView;

public class LoginController {

    public static boolean isNotLoggedIn = true;

    /**
     * Method to handle users request login
     */
    public static void handleLogin() {
        UsersModel users = new UsersModel();
        String[][] data = users.data();

        String username = InputData.input("Username");
        boolean isUsernameExist = false;
        for (int i = 0; i < data.length; i++) {
            if (username.equals(data[0][i])) {
                isUsernameExist = true;
                break;
            }
        }

        if (!username.isBlank()) {
            String password = InputData.input("Password");
            boolean isPasswordCorrect = false;
            for (int i = 0; i < data.length; i++) {
                if (password.equals(data[1][i])) {
                    isPasswordCorrect = true;
                    break;
                }
            }

            if (isUsernameExist) {
                if (isPasswordCorrect) {
                    DashboardView.showDashboardView();
                } else {
                    System.out.println("Password is invalid");
                    LoginView.showLoginView();
                }
            } else {
                System.out.println("Account is not found!");
                LoginView.showLoginView();
            }

        } else {
            System.out.println("Invalid input!");
            LoginView.showLoginView();
        }

    }
}
