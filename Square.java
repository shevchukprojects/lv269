package ua.soft;

import java.util.Scanner;

/**
 * Created by ${Mirek} on 24.09.2017.
 */
public class Square {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i< n; i++){
            int number = i;
            int sum = 0;
            int position = 0;
            while (number != 0){
                position = number%10;
                sum = sum +position;
                number = number / 10;
            }
            if (m == (int)Math.pow(sum,2) ){
                System.out.println(i);
            }
        }
    }
}
