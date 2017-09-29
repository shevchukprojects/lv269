package com.softtask.MyHomework;

import java.util.ArrayList;

/**
 * The SquareNotCube class performs task 225.
 *
 * @author Myroslav Zvarych
 *
 * Task № 225
 * Дано натуральное число n. Получить все такие
 * натуральные q, что n делится на q2 и не делится на q3
 *
 * @version 1.0
 *
 */
public class SquareNotCube {

    private int naturalN;
    private ArrayList<Integer> list = new ArrayList<Integer>();

    /** Constructor with initialize naturalN */
    public SquareNotCube() {
        System.out.println(" Square not Cube");
        this.naturalN = InputData.scan();
    }

    /**
     * Calculate possible variant for parameter naturalN
     * and add result to list
     * */
    public void possibleSquare() {
        int k = (int) Math.sqrt(naturalN);
        for (int i = 2; i <= k + 1; i++) {
            int square = (int) Math.pow(i, 2);
            int cube = (int) Math.pow(i, 3);
            if (naturalN % square == 0 && naturalN % cube != 0) {
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
