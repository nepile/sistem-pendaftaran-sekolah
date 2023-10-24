package app.controllers;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class RootController {
    /**
     * Method to setup title
     */
    public static void setTitle(String path) {
        File customizeTitle = new File(path);
        try (Scanner readMyCustomizeTitle = new Scanner(customizeTitle)) {
            while (readMyCustomizeTitle.hasNextLine()) {
                String title = readMyCustomizeTitle.nextLine();
                System.out.println(title);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR : " + e.getMessage());
        }
    }
}
