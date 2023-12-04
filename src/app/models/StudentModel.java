package app.models;

import app.services.InputData;

public class StudentModel {

    static String nama;
    static String nisn;

    public static void informasiPribadi() {
        setNamaAttribute();
        setNisnAttribute();

    }

    public static void setNamaAttribute() {
        nama = InputData.input("Nama Lengkap");
    }

    public static void setNisnAttribute() {
        nisn = InputData.input("NISN");

    }

    public static String getNamaAttribute() {
        return nama;
    }

    public static String getNisnAttribute() {
        return nisn;
    }
}
