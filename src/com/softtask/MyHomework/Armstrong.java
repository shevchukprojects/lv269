package com.softtask.MyHomework;

import java.util.ArrayList;

/**
 * The Armstrong class performs task 562.
 *
 * @author Myroslav Zvarych
 *
 * Task № 562
 * Натуральное число из n цифр является числом Армстронга,
 * если сумма его цифр, возведенных в n-ю степень, равна самому числу
 * (как, например, 153 = 13+ 53+ 33). Получить все числа Армстронга,
 * состоящие из двух, трех и четырех цифр.
 *
 * @version 1.0
 *
 */
public class Armstrong {

    private int naturalN;
    private ArrayList<Integer> list = new ArrayList<Integer>();

    /** Constructor with initialize naturalN */
    public Armstrong() {
        System.out.println("Armstrong number");
        this.naturalN = InputData.scan();
    }

    /**
     * Calculate possible variant for upper border parameter naturalN
     * and add result to list
     * */
    public void numberArmstrong() {
        for (int i = 0; i <= naturalN; i++) {
            int size = String.valueOf(i).length();
            int number = i;
            int sum = 0;
            int position = 0;
            do {
                position = number % 10;
                sum = sum + ((int) Math.pow(position, size));
                number = number / 10;
            } while (number != 0);
            if (sum == i) {
                list.add(i);
            }
        }
    }

    public int getNaturalN() {
        return naturalN;
    }

    public void setNaturalN(int naturalN) {
        this.naturalN = naturalN;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }


}
