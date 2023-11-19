package app.views;

import app.services.InputData;

public class DashboardView {
    public static void showDashboardView() {
        while (true) {
            System.out.println("Dashboard Admin");
            System.out.println("1. Registration Pass Data");
            System.out.println("2. Registration Management");
            System.out.println("3. Logout");
            var option = InputData.input("Your Option");

            if (option.equals("1")) {
                System.out.println("Kelulusan siswa");
            } else if (option.equals("2")) {
                System.out.println("Manajemen registrasi");
            } else if (option.equals("3")) {
                RootView.showRootView();
            } else {
                System.out.println("Input is invalid");
            }
        }
    }
}
