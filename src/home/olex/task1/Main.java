/*
* @Main.java 2017/09/25 
*/

package home.olex.task1;

import home.olex.tools.UI;

/**
 * Class Main has entry point of first task application.
 *
 * @version 25 Sep 2017
 * @author Oleksandr Kutaiev
 */
public class Main {

	/**
	 * Program's entry point.
	 * 
	 * @param args
	 *            - input arguments.
	 */
	public static void main(String[] args) {
		System.out.print("Enter number n: ");
		int n = UI.getValueFromKeyboard();
		System.out.print("Enter number m: ");
		int m = UI.getValueFromKeyboard();		
		
		FirstTask ft = new FirstTask(n, m);
		
		UI.showResult(ft.getTaskResult());
	}
}