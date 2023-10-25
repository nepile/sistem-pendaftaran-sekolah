package app.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import app.services.LocalPath;

public class RootController {
    /**
     * Method to setup title
     */
    public static void setTitle() {
        LocalPath path = new LocalPath();
        File customizeTitle = new File(path.getPath("title.txt"));

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
