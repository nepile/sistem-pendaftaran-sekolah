package app.views;

import app.controllers.RegisterStudentController;

public class RegisterStudentView {
    public static void bioDataSiswaView() {
        System.out.println("---------- Please Register ----------");
        RegisterStudentController.bioDataSiswaLogic();
    }
}
