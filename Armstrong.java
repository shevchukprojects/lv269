package ua.soft;

import java.util.Scanner;

/**
 * Created by ${Mirek} on 24.09.2017.
 */
public class Armstrong {
    public static void main(String[]args) {
        int k = 9999;
        for (int i = 0; i <= k; i++) {
            int size = String.valueOf(i).length();
            int number = i;
            int sum = 0;
            int figure =0;
            do {
                figure = number%10;
                sum = sum +((int)Math.pow(figure,size));
                number=number/ 10;
            }while (number!=0);
            if (sum == i){
                System.out.println(sum);
            }
        }
    }
}

