package app.views;

import app.controllers.RegisterStudentController;
import app.services.InputData;

public class DashboardView {

    static boolean decision = true;

    public static void showDashboardView() {
        String[][] dataStudent = RegisterStudentController.storeStudentData();

        while (decision) {
            System.out.println();
            System.out.println("xxxxxxxxxxxxxxxxxxx");
            System.out.println("| Dashboard Admin |");
            System.out.println("-------------------");
            System.out.println("1. Daftar Kelulusan");
            System.out.println("0. Logout");
            var option = InputData.input("Your Option");

            if (option.equals("1")) {
                int jumlahLulus = 0;
                for (int i = 0; i < dataStudent.length; i++) {
                    if (dataStudent[i][0] != null) {
                        jumlahLulus++;
                    }
                }

                System.out.println("----------------------------");
                System.out.println("Kelulusan Siswa (" + jumlahLulus + ")");
                System.out.println();

                System.out.println(
                        "=====================================================================================");
                System.out.print("No. | ");
                System.out.print("Siswa                  | ");
                System.out.print("NISN        | ");
                System.out.print("Nilai Akademik   | ");
                System.out.print("Nilai Prestasi   ");
                System.out.println();
                System.out.println(
                        "=====================================================================================");

                for (int i = 0; i < dataStudent.length; i++) {

                    if (dataStudent[i][0] != null) {
                        System.out.print((i + 1) + ". | \t\t");
                    }
                    for (int j = 0; j < dataStudent[i].length; j++) {
                        if (dataStudent[i][j] != null) {
                            System.out.print(dataStudent[i][j] + "\t\t");
                        }
                    }
                    if (dataStudent[i][0] != null) {
                        System.out.println();
                    }
                }
            } else if (option.equals("0")) {
                System.out.println("==================================");
                System.out.println("INFO: exit from dashboard admin");
                break;
            } else {
                System.out.println("===========================");
                System.out.println("ERROR: Invalid Input \n");
            }
        }
    }
}
