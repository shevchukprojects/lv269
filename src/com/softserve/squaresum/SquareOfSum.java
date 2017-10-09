package com.softserve.squaresum;

import com.softserve.service.Counter;

import java.util.ArrayList;
import java.util.List;

/**
 * The SquareOfSume class performs task 329.
 *
 * @author Myroslav Zvarych
 *
 * Task № 329
 * Given natural numbers n, m. Get all the smaller n
 * Natural numbers, the square of the sum of the digits of which is equal to m.
 *
 * @version 1.1
 *
 */
public class SquareOfSum extends Counter {

    /**
     * Calculate possible variant  parameter naturalN, naturalM
     * and add result to list
     * */
    public List<Integer> lessSquare(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = countSumDigit(i);
            if (m == (int) (Math.pow(sum, 2)+0.5)) {
                list.add(i);
            }
        }
        return list;
    }
}
