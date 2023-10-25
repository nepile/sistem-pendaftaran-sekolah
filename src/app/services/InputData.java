package app.services;

import java.util.Scanner;

public class InputData {
    /**
     * Method to handle users input
     * 
     * @param info
     * @return data of string
     */
    public static String input(String info) {
        System.out.print(info + " >> ");
        Scanner userInput = new Scanner(System.in);
        String data = userInput.nextLine();

        return data;
    }
}
