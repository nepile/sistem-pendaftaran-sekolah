package app.controllers;

public class LoginController {
    /**
     * Method to handle users request login
     */
    public static void handleLogin() {
        while (true) {
            String username = InputData.input("Username");

            if (!username.isBlank()) {
                String password = InputData.input("Password");
                if (password.equals("12345")) {
                    System.out.println("Access Granded!");
                    break;
                } else {
                    System.out.println("Password invalid!");
                }
            } else {
                System.out.println("Account is not found!");
            }
        }
    }
}
