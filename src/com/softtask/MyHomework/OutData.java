package com.softtask.MyHomework;

import java.util.ArrayList;

/**
 * The OutData class for output data in console.
 *
 * @author Myroslav Zvarych
 *
  * @version 1.0
 *
 */
public class OutData {

    public static void printList(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("Wrong list");
        } else {
            for (Integer e : list) {
                System.out.println(e);
            }
        }
    }
}
