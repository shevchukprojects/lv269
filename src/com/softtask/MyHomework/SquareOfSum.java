package com.softtask.MyHomework;

import java.util.ArrayList;

/**
 * The SquareOfSume class performs task 329.
 *
 * @author Myroslav Zvarych
 *
 * Task № 329
 * Даны натуральные числа n, m. Получить все меньшие n
 * натуральные числа, квадрат суммы цифр которых равен m.
 *
 * @version 1.0
 *
 */
public class SquareOfSum {
    private int naturalN;
    private int naturalM;
    private ArrayList<Integer> list = new ArrayList<Integer>();

    /** Constructor with initialize naturalN  and naturalM*/
    public SquareOfSum() {
        System.out.println("Please enter two natural namber");
        this.naturalN = InputData.scan();
        this.naturalM = InputData.scan();
    }
    /**
     * Calculate possible variant  parameter naturalN, naturalM
     * and add result to list
     * */
    public void lessSquare() {
        for (int i = 0; i < naturalN; i++) {
            int number = i;
            int sum = 0;
            int position = 0;
            while (number != 0) {
                position = number % 10;
                sum = sum + position;
                number = number / 10;
            }
            if (naturalM == (int) Math.pow(sum, 2)) {
                list.add(i);
            }
        }
    }

    public void setNaturalN(int naturalN) {
        this.naturalN = naturalN;
    }

    public int getNaturalN() {
        return naturalN;
    }

    public int getNaturalM() {
        return naturalM;
    }

    public void setNaturalM(int naturalM) {
        this.naturalM = naturalM;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }
}
