package app.models;

import app.services.InputData;

public class StudentModel {
    public static void informasiPribadi() {
        String nama = InputData.input("Nama Lengkap");
        String tempatLahir = InputData.input("Tempat Lahir");
        String tanggalahir = InputData.input("Tanggal Lahir");
        String bulanLahir = InputData.input("Bulan Lahir");
        String TahunLhr = InputData.input("Tahun Lahir : ");
        String jenisKelamin = InputData.input("Jenis Kelamin (Pria / Wanita)");
        String NISN = InputData.input("Nomor Induk Siswa Nasional (NISN)");
    }
}
