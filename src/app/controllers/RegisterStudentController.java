package app.controllers;

import app.models.StudentModel;
import app.services.InputData;

public class RegisterStudentController {
    public static void bioDataSiswaLogic() {
        StudentModel.informasiPribadi();
    }

    public static void akademik() {
        System.out.println("-MASUKKAN NILAI-");
        String matematika = InputData.input("Matematika");
        String ipa = InputData.input("Ilmu Pengetahuan Alam");
        String ips = InputData.input("Ilmu Pengetahuan Alam");
        String inggris = InputData.input("Bahasa Inggris");
        String indonesia = InputData.input("Bahasa Indonesia");
        double rerata = (Integer.parseInt(matematika) + Integer.parseInt(ipa) + Integer.parseInt(ips)
                + Integer.parseInt(inggris) + Integer.parseInt(indonesia)) / 5;
        // System.out.print("RATA - RATA : " + rerata);
    }

    public static void nonAkademik() {

    }
}
