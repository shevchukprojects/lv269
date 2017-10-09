package com.softserve.armstrong;

import java.util.List;
/**
 * The Armstrong class performs task 562.
 *
 * @author Myroslav Zvarych
 *
 * Task № 562
 * The natural number of n digits is the Armstrong number,
 * if the sum of its digits raised to the n-th power is equal to the number itself
 * (as, for example, 153 = 1^3 + 5^3 + 3^3). Get all the numbers of Armstrong,
 * consisting of two, three and four digits.
 *
 * @version 1.1
 *
 */

public class Main {

    public static void main(String[] args) {
        CountArmstrong countArmstrong = new CountArmstrong();
        int n = countArmstrong.inputOutputData.dataFromScaner();
        List<Integer> list= countArmstrong.numberArmstrong(n);
        countArmstrong.inputOutputData.outByConsole(list);
    }
}
