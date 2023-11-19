package app.controllers;

import app.models.UsersModel;
import app.services.InputData;
import app.views.DashboardView;
// import app.views.RootView;

public class LoginController {

    static boolean isNotLoggedIn = true;

    /**
     * Method to handle users request login
     */
    public static void handleLogin() {
        while (session()) {
            UsersModel users = new UsersModel();
            String[][] data = users.data();

            // check username exist
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
                        isNotLoggedIn = false;
                    } else {
                        System.out.println("Password is invalid");
                    }
                } else {
                    System.out.println("Account is not found!");
                }

            } else {
                System.out.println("Invalid input!");
            }
        }

    }

    /**
     * Method to handle information about user if user didn't login
     */
    public static boolean session() {
        return isNotLoggedIn;
    }

}
