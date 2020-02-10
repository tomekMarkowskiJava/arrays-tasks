/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package findarray;

import java.util.Random;
import java.util.Scanner;

public class MyFindArray {

	public int findArray(int[] array, int[] subArray) {

		int index = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == subArray[0]){
				for (int j = 1; j < subArray.length; j++) {
					if (!(subArray[j] == array[i+j])){
						break;
					}if (j == subArray.length-1){
						index = i;
					}
				}
			}
		}
		return index;
	}

	public void findSecond(int[] array) {
		int highestValue = Integer.MIN_VALUE;
		int secondValue = Integer.MIN_VALUE;

		for (int value : array) {
			if (value > highestValue) {
				secondValue = highestValue;
				highestValue = value;
			} else if (value > secondValue) {
				secondValue = value;
			}
		}
		System.out.println("\nThe second largest value of the array is: " + secondValue);
	}


	public int[] createArray() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Choose array lenght: ");
		int arrayLenght = scanner.nextInt();


		int[] array = new int[arrayLenght];

		System.out.println("Your array: ");
		for (int i = 0; i < arrayLenght; i++) {
			array[i] = random.nextInt(2000)-1000;
			System.out.print(array[i] + ", ");
		}

		return array;
	}
}
