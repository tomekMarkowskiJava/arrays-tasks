import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbers = createArray();
        findSecond(numbers);


    }


    private static int[] createArray() {
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

    private static void findSecond(int[] array) {
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


}
