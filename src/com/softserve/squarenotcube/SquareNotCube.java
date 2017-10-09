package com.softserve.squarenotcube;

import java.util.ArrayList;
import java.util.List;

/**
 * The SquareNotCube class performs task 225.
 *
 * @author Myroslav Zvarych
 *
 * Task № 225
 * Given a natural number n. Get all such
 * natural q such that n is divisible by q^2 and is not divisible by q^3
 *
 * @version 1.1
 *
 */
public class SquareNotCube {

    /**
     * Calculate possible variant for parameter naturalN
     * and add result to list
     * */
    public List<Integer> possibleSquare(int n) {
        List<Integer> list = new ArrayList<>();
        int k = (int) (Math.sqrt(n)+0.5);
        for (int i = 2; i <= k + 1; i++) {
            int square = (int) (Math.pow(i, 2)+0.5);
            int cube = (int) Math.pow(i, 3);
            if (n % square == 0 && n% cube != 0) {
                list.add(i);
            }
        }
        return list;
    }
}
