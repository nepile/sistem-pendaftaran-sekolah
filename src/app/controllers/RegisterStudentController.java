package app.controllers;

import app.models.StudentModel;
import app.services.InputData;

public class RegisterStudentController {
    static int bobot = 0;
    static double rerata = 0d;
    static boolean lulus;
    static String[][] data = DashboardController.dataKuotaSiswa();

    public static void bioDataSiswaLogic() {
        if (data[data.length - 1][0] == null) {
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
        } else {
            System.out.println("Maaf, kuota pendaftaran sudah habis.");
        }
    }

    public static double akademik() {
        System.out.println();
        System.out.println("-- MASUKKAN NILAI --");
        String matematika = InputData.input("Matematika");
        String ipa = InputData.input("Ilmu Pengetahuan Alam");
        String ips = InputData.input("Ilmu Pengetahuan Sosial");
        String inggris = InputData.input("Bahasa Inggris");
        String indonesia = InputData.input("Bahasa Indonesia");
        rerata = (Integer.parseInt(matematika) + Integer.parseInt(ipa) + Integer.parseInt(ips)
                + Integer.parseInt(inggris) + Integer.parseInt(indonesia)) / 5;
        if (rerata >= 80) {
            lulus = true;
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("| Selamat anda dinyatakan LULUS! ");
            System.out.println("| Nilai Rata-rata: " + rerata);
            System.out.println("--------------------------------");
            System.out.println();
            return rerata;
        } else {
            lulus = false;
            System.out.println();
            System.out.println("Anda telah gagal silahkan coba lagi");
            return rerata;
        }
    }

    public static void nonAkademik() {
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("-- MASUKKAN PRESTASI --");
        System.out.println("1.Internasional");
        System.out.println("2.Nasional");
        System.out.println("3.Provinsi");
        String tingkat = InputData.input("Pilihan anda");
        switch (tingkat) {
            case "1":
                InputData.input("Masukkan prestasi anda");
                bobot += 80;
                finalValueLogic();
                break;
            case "2":
                InputData.input("Masukkan prestasi anda");
                bobot += 50;
                System.out.println("-- MASUKKAN PRESTASI (Jika tidak ada pilih 3) --");
                System.out.println("1.Nasional");
                System.out.println("2.Provinsi");
                System.out.println("3.Close");
                String opsi = InputData.input("Pilihan anda");
                if (opsi.equals("1")) {
                    InputData.input("Masukkan prestasi anda");
                    bobot += 50;
                    finalValueLogic();
                } else if (opsi.equals("2")) {
                    InputData.input("Masukkan prestasi anda");
                    bobot += 30;
                    finalValueLogic();
                } else if (opsi.equals("3")) {
                    finalValueLogic();
                } else {
                    System.out.println("Input tidak valid");
                }
                break;
            case "3":
                InputData.input("Masukkan prestasi anda");
                bobot += 30;
                System.out.println("-MASUKKAN PRESTASI (Jika tidak ada pilih 3)-");
                System.out.println("1.Nasional");
                System.out.println("2.Provinsi");
                System.out.println("3.Close");
                String pilihan = InputData.input("Pilihan anda");
                if (pilihan.equals("1")) {
                    InputData.input("Masukkan prestasi anda");
                    bobot += 50;
                    finalValueLogic();
                } else if (pilihan.equals("2")) {
                    InputData.input("Masukkan prestasi anda");
                    bobot += 30;
                } else if (pilihan.equals("3")) {
                    finalValueLogic();
                } else {
                    System.out.println("Input tidak valid");
                }
                System.out.println("-- MASUKKAN PRESTASI (Jika tidak ada pilih 2) --");
                System.out.println("1.Provinsi");
                System.out.println("2.Close");
                String pilih = InputData.input("Pilihan anda");
                if (pilih.equals("1")) {
                    InputData.input("Masukkan prestasi anda");
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

    public static int finalValueLogic() {
        if (bobot >= 80) {
            lulus = true;
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("| Selamat anda dinyatakan LULUS!");
            System.out.println("| Nilai Prestasi: " + bobot + "  ");
            System.out.println("--------------------------------");
            System.out.println();
            return bobot;
        } else {
            lulus = false;
            System.out.println();
            System.out.println("Maaf, anda gagal dan dinyatakan TIDAK LULUS");
            return bobot;
        }
    }

    public static String[][] storeStudentData() {
        if (lulus) {
            int idx = -1;

            if (data[data.length - 1][0] != null) {
                return data;
            }

            for (int i = 0; i < data.length; i++) {
                if (data[i][0] == null) {
                    idx = i;
                    break;
                }
            }

            data[idx][0] = StudentModel.getNamaAttribute();
            data[idx][1] = StudentModel.getNisnAttribute();

            if (bobot == 0) {
                data[idx][2] = Double.toString(rerata);
                data[idx][3] = "-";
            } else {
                data[idx][2] = "-";
                data[idx][3] = Integer.toString(bobot);
            }
        }
        return data;
    }

}
