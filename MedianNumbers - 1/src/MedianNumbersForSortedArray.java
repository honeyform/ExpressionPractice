import java.util.Random;
import java.util.Scanner;
/**
 * Created by Honey on 15.09.2015.
 */
public class MedianNumbersForSortedArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write length of array:");
            int lengthOfArray = scanner.nextInt();
            int[] array = new int[lengthOfArray];

            rundomNumbers(array);
            printArray(array);

            array = sortarray(array);
            System.out.println();
            printArray(array);

            printArrayMedianNumber(array);
        }
    }


    private static void rundomNumbers(int[] array) {
        Random random = new Random();

        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(10);
        }
    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + "  ");
        }
    }

    private static int[] sortarray(int[] array) {
        int border = array.length - 1;
        for (int index = 0; index < array.length - 1; index++){
            for (int i = 0; i < border; i++){
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            border = border - 1;
        }
        return array;
    }



    private static void printArrayMedianNumber(int[] array) {
        System.out.println();

        if (array.length % 2 > 0) {
            System.out.println("Median number in array is: " + array[array.length / 2]);
            System.out.println();
        } else {
            System.out.println("There is not median number! Choose another size of array!");
            System.out.println();
        }
    }
}
