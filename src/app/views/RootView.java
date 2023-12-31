package app.views;

import app.services.InputData;
import app.controllers.RootController;

public class RootView {

    static boolean decision = true;

    /**
     * Method to get data title from setTitle method
     */
    public static void getTitle() {
        RootController.setTitle();
    }

    /**
     * Method to show the root view
     */
    public static void showRootView() {
        while (decision) {
            getTitle();

            System.out.println("Select an options below: ");
            System.out.println("1. Register as student");
            System.out.println("2. Login");
            System.out.println("0. Exit from app");

            String option = InputData.input("Your Option");

            if (option.equals("1")) {
                RegisterStudentView.bioDataSiswaView();
            } else if (option.equals("2")) {
                // bring user to login view
                LoginView.showLoginView();
            } else if (option.equals("0")) {
                System.out.println("=============================");
                System.out.println("INFO: exit from app");
                decision = false;
                break;
            } else {
                // invalid input
                System.out.println("===========================");
                System.out.println("ERROR: Invalid Input \n");
            }
        }
    }
}