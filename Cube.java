package ua.soft;
import java.util.Scanner;

/**
 * Created by ${Mirek} on 23.09.2017.
 */
public class Cube {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = (int) Math.sqrt(n);
        for (int i = 2; i<= k+1; i++){
           double square = Math.pow(i,2);
           double cube = Math.pow(i,3);
           if (n % square == 0 && n % cube != 0){
              System.out.println(i);
           }
        }
    }
}
