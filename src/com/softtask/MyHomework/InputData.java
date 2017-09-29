package com.softtask.MyHomework;

import java.util.Scanner;

/**
 * The InputData class scun integer number.
 *
 * @author Myroslav Zvarych
 *
 * @version 1.0
 *
 */
public class InputData {
    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number:");
        int number = 0;
        try {
            number = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Something wrong" + e);
        }

        return number;
    }

}
