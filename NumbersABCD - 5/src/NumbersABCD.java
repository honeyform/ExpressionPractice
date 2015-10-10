import java.util.Scanner;

/**
 * Created by Honey on 11.09.2015.
 */
public class NumbersABCD {
    public static void main (String[] args){
        while(true){
            System.out.println("Write number with 4 elements:");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            checkNumberSummPrint(number);
        }
    }

    private static void checkNumberSummPrint(int number) {
        if (number % 100 <= 0 || number / 100 <= 0) {
            System.out.println("U wrote wrong number!");
            System.out.println();
        }
        else {
            System.out.println("summ of numbers = " + summNumbers(number));
            System.out.println();
        }
    }
    private static int summNumbers(int number) {
        int summ = (number/100)+(number%100);
        return summ;
    }
}
