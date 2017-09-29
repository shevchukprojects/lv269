package com.softtask.MyHomework;

/**
 * The Main class is the main menu of program.
 *
 * @author Myroslav Zvarych
 *
 * Task № 225, 329, 569
 *
 * @version 1.0
 *
 */
public class Main {
    public static void main(String[] args){
        /**
         * implement the choice of tasks.
         */
        System.out.println("Please enter number of task 1 .. 3");
        int task = InputData.scan();
        switch (task){
            /** Task 562 */
            case 1 :
                Armstrong armstrong = new Armstrong();
                armstrong.numberArmstrong();
                OutData.printList(armstrong.getList());
                break;
            /** Task 225 */
            case 2 :
                SquareNotCube squareNotCube = new SquareNotCube();
                squareNotCube.possibleSquare();
                OutData.printList(squareNotCube.getList());
                break;
            /** Task 329*/
            case 3 :
                SquareOfSum squareOfSum = new SquareOfSum();
                squareOfSum.lessSquare();
                OutData.printList(squareOfSum.getList());
                break;
            default:
                System.out.println("Wrong number");
                break;
        }

    }
}
