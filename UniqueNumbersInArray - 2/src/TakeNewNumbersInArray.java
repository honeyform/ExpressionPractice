import java.util.Random;
import java.util.Scanner;

/**
 * Created by Honey on 10.09.2015.
 */
public class TakeNewNumbersInArray {
    public static void main(String[] args) {
        System.out.println("Write the size of array:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        randomNumbersForArray(array);
        System.out.println("New array is:");
        printArray(array);
        System.out.println();

        boobleSorting(array);
        System.out.println("Sorting array is:");
        printArray(array);
        System.out.println();

        System.out.println("Unique numbers are: ");
        chooseUniqueNumbers(array);

    }


    private static void randomNumbersForArray(int[] array) {
        Random rand = new Random();

        for (int index = 0; index < array.length; index++) {
            array[index] = rand.nextInt(5);
        }
    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + "  ");
        }
    }

    private static void boobleSorting(int[] array) {
        int border = array.length - 1;
        for (int index = 0; index < array.length; index++) {
            for (int i = 0; i < border; i++) {
                if (array[i] > array[i + 1]) {
                    array = swap(array, i);
                }
            }
            border = border - 1;
        }
    }

    private static int[] swap(int[] array, int i) {
        int temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
        return array;
    }

    private static void chooseUniqueNumbers(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (index == 0) {
                continue;
            }
            if (index == array.length - 1) {
                if (array[index] == array[index - 1]) {
                    continue;
                }
            } else {
                if (array[index] != array[index - 1] && array[index] != array[index + 1]) {
                    System.out.print(array[index] + "  ");
                }
            }
        }
    }
}
