package com.softserve.service;

/**
 * The Counter class for count operations.
 *
 * @author Myroslav Zvarych
 *
 * @version 1.1
 *
 */
public class Counter implements ICounter
{
    /** method count how many digits in number */
    @Override
    public int countDigit(int n){
        int count =0;
        while (n != 0){
            n = n/10;
            count ++;
        }
        return count;
    }
    @Override
    public int countSumDigit(int n){
        int sum = 0;
        int position = 0;
        while (n != 0) {
            position = n % 10;
            sum = sum + position;
            n = n / 10;
        }
        return sum;
    }

}
