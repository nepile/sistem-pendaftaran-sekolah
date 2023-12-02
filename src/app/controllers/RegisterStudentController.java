package app.controllers;

import app.services.InputData;

public class RegisterStudentController {
    public static void bioDataSiswaLogic() {
        System.out.println("----------------------------");
        System.out.println("-INFORMASI PRIBADI-");
        String nama = InputData.input("Nama Lengkap");
        String tempatLahir = InputData.input("Tempat Lahir");
        String tanggalahir = InputData.input("Tanggal Lahir");
        String bulanLahir = InputData.input("Bulan Lahir");
        String TahunLhr = InputData.input("Tahun Lahir : ");
        String jenisKelamin = InputData.input("Jenis Kelamin (Pria / Wanita)");
        String agama = InputData.input("Agama");
        System.out.println("-ALAMAT DAN KONTAK-");
        String alamat = InputData.input("Alamat Tempat Tinggal");
        String noTelepon = InputData.input("Nomor Telepon");
        String email = InputData.input("Alamat Email");
        System.out.println("-DATA ORANG TUA/WALI-");
        String orangTua = InputData.input("Nama Orang Tua/Wali");
        String pekerjaanOrgTua = InputData.input("Pekerjaan Orang Tua/Wali");
        String noOrangTua = InputData.input("Nomor Telepon Orang Tua/Wali");
        System.out.println("-DOKUMEN IDENTITAS-");
        String NIK = InputData.input("Nomor Induk Kependudukan (NIK)");
        String KK = InputData.input("Nomor Kartu Keluarga (KK)");
        String NISN = InputData.input("Nomor Induk Siswa Nasional (NISN)");

        System.out.println("Select an options below: ");
        System.out.println("1. Jalur Akademik");
        System.out.println("2. Jalur Non-Akademik");

    }

    public static void akademik() {
        System.out.println("----------------------------");
        System.out.println("-MASUKKAN NILAI-");
        String matematika = InputData.input("Matematika");
        String ipa = InputData.input("Ilmu Pengetahuan Alam");
        String ips = InputData.input("Ilmu Pengetahuan Alam");
        String inggris = InputData.input("Bahasa Inggris");
        String indonesia = InputData.input("Bahasa Indonesia");
        double rerata = (Integer.parseInt(matematika) + Integer.parseInt(ipa) + Integer.parseInt(ips) + Integer.parseInt(inggris) + Integer.parseInt(indonesia)) / 5;
        System.out.print("RATA - RATA : " + rerata);
    }
    public static void nonAkademik() {

    }
}
