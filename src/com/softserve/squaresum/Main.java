package com.softserve.squaresum;

import com.softserve.service.InputOutputData;

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
public class Main {
    public static void main(String[] args){
        SquareOfSum squareOfSum = new SquareOfSum();
        InputOutputData inputOutputData = new InputOutputData();
        int n = inputOutputData.dataFromScaner();
        int m = inputOutputData.dataFromScaner();
        inputOutputData.outByConsole(squareOfSum.lessSquare(n,m));

    }
}
