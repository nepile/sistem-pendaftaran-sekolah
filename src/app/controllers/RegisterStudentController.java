package app.controllers;

import app.models.StudentModel;
import app.services.InputData;

public class RegisterStudentController {
    static int bobot = 0;
    public static void bioDataSiswaLogic() {
        StudentModel.informasiPribadi();
        System.out.println("----------------------------");
        System.out.println("-PILIH JALUR PENILAIAN-");
        System.out.println("1.Akademik");
        System.out.println("2.Non-Akademik");
        String option = InputData.input("Pilih Opsi Anda");
        if (option.equals("1")) {
            akademik();
        } else if (option.equals("2")) {
            nonAkademik();
        } else {
            System.out.println("Invalid input");
        }
    }

    public static void akademik() {
        boolean lulus ;
        System.out.println("-MASUKKAN NILAI-");
        String matematika = InputData.input("Matematika");
        String ipa = InputData.input("Ilmu Pengetahuan Alam");
        String ips = InputData.input("Ilmu Pengetahuan Sosial");
        String inggris = InputData.input("Bahasa Inggris");
        String indonesia = InputData.input("Bahasa Indonesia");
        double rerata = (Integer.parseInt(matematika) + Integer.parseInt(ipa) + Integer.parseInt(ips)
                + Integer.parseInt(inggris) + Integer.parseInt(indonesia)) / 5;
        if (rerata>=80) {
            lulus=true;
        } else {
            lulus = false;
        }
    }

    /**
     * 
     */
    public static void nonAkademik() {
        System.out.println("----------------------------");
        System.out.println("-MASUKKAN PRESTASI-");
        System.out.println("1.Internasional");
        System.out.println("2.Nasional");
        System.out.println("3.Provinsi");
        String tingkat = InputData.input("Pilihan anda");
        switch (tingkat) {
            case "1":
                String internasional = InputData.input("Masukkan prestasi anda");
                bobot += 80;
                finalValueLogic();
                break;
            case "2":
                String nasional = InputData.input("Masukkan prestasi anda");
                bobot += 50;
                System.out.println("-MASUKKAN PRESTASI (Jika tidak ada pilih 3)-");
                System.out.println("1.Nasional");
                System.out.println("2.Provinsi");
                System.out.println("3.Close");
                String opsi = InputData.input("Pilihan anda");
                if (opsi.equals("1")) {
                    String national = InputData.input("Masukkan prestasi anda");
                    bobot += 50;
                    finalValueLogic();
                } else if (opsi.equals("2")) {
                    String provinssi = InputData.input("Masukkan prestasi anda");
                    bobot += 30;
                    finalValueLogic();
                } else if (opsi.equals("3")) {
                    finalValueLogic();
                } else {
                    System.out.println("Input tidak valid");
                }
                break;
            case "3":
                String provinsi = InputData.input("Masukkan prestasi anda");
                bobot += 30;
                System.out.println("-MASUKKAN PRESTASI (Jika tidak ada pilih 3)-");
                System.out.println("1.Nasional");
                System.out.println("2.Provinsi");
                System.out.println("3.Close");
                String pilihan = InputData.input("Pilihan anda");
                if (pilihan.equals("1")) {
                    String national = InputData.input("Masukkan prestasi anda");
                    bobot += 50;
                    finalValueLogic();
                } else if (pilihan.equals("2")) {
                    String provvinsi = InputData.input("Masukkan prestasi anda");
                    bobot += 30;
                } else if (pilihan.equals("3")) {
                    finalValueLogic();
                } else {
                    System.out.println("Input tidak valid");
                }
                System.out.println("-MASUKKAN PRESTASI (Jika tidak ada pilih 2)-");
                System.out.println("1.Provinsi");
                System.out.println("2.Close");
                String pilih = InputData.input("Pilihan anda");
                if (pilih.equals("1")) {
                    String propinsi = InputData.input("Masukkan prestasi anda");
                    bobot += 30;
                    finalValueLogic();
                } else if (pilih.equals("2")) {
                    finalValueLogic();
                } else {
                    System.out.println("Input tidak valid");
                }
                break;
            default:
                System.out.println("Input tidak valid");
                break;
        }
    }
    public static void finalValueLogic(){
        boolean lulus;
        if (bobot>=80) {
            lulus = true;
        } else {
            lulus = false;
        }
    }
}
