package com.softserve.service;

import java.util.List;
import java.util.Scanner;

/**
 * The InputOutputData class for input output data with console.
 *
 * @author Myroslav Zvarych
 *
 * @version 1.1
 *
 */
public class InputOutputData implements IInputOutputData {


    @Override
    public int dataFromScaner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number:");
        int number = 0;
        try {
            number = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Something wrong" + e);
            e.printStackTrace();
        }

        return number;
    }

    public void outByConsole(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("Wrong list");
        } else {
            for (Integer e : list) {
                System.out.println(e);
            }
        }
    }
}
