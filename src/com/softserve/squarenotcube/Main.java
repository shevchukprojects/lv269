package com.softserve.squarenotcube;

import com.softserve.service.InputOutputData;

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
public class Main {
    public static void main(String[] args){
        InputOutputData inputOutputData = new InputOutputData();
        int n = inputOutputData.dataFromScaner();
        SquareNotCube squareNotCube = new SquareNotCube();
        List<Integer> list = squareNotCube.possibleSquare(n);
        inputOutputData.outByConsole(list);

    }
}
