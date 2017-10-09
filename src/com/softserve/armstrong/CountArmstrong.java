package com.softserve.armstrong;

import com.softserve.service.Counter;
import com.softserve.service.InputOutputData;

import java.util.ArrayList;
import java.util.List;

/**
 * The CountArmstrong class for count Armstrong numers.
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
public class CountArmstrong extends Counter {

    public InputOutputData inputOutputData = new InputOutputData();

    /**
     * Calculate possible variant for upper border parameter naturalN
     * and add result to list
     * */
    public List<Integer>  numberArmstrong(int naturalN) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= naturalN; i++) {
            int size = countDigit(i);
            int number = i;
            int sum = 0;
            int position = 0;
            do {
                position = number % 10;
                sum = sum + ((int) (Math.pow(position, size)+0.5));
                number = number / 10;
            } while (number != 0);
            if (sum == i) {
                list.add(i);
            }
        }
        return list;
    }
}
