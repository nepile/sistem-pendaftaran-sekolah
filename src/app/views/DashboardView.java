package app.views;

import app.controllers.DashboardController;
import app.services.InputData;

public class DashboardView {

    static boolean decision = true;

    public static void showDashboardView() {
        while (decision) {
            System.out.println("----------------------------");
            System.out.println("Dashboard Admin");
            System.out.println("1. Registration Pass Data");
            System.out.println("2. Registration Management");
            System.out.println("3. Logout");
            var option = InputData.input("Your Option");

            if (option.equals("1")) {
                System.out.println("Kelulusan siswa");
            } else if (option.equals("2")) {
                System.out.println("Manajemen registrasi");
                String kuota = InputData.input("Tentukan kuota penerimaan siswa");
                DashboardController.kuotaSiswa(Integer.parseInt(kuota));
                System.out.println("Anda memasukan kuota sebanyak : "+ kuota);
            } else if (option.equals("3")) {
                System.out.println("==================================");
                System.out.println("INFO: exit from dashboard admin");
                System.out.println("==================================");
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
