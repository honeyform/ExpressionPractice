import java.util.Scanner;

/**
 * Created by Honey on 11.09.2015.
 */
public class StringWithUniqueSymbols {
    public static void main (String[] args){
        System.out.println("Write some string:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printStringWithUniqueSymbols(text);

    }

    private static void printStringWithUniqueSymbols(String text) {

        for (int index = 0; index < text.length(); index++){
            boolean thereAreSuchSymbol = false;
            char symbolForCheck = text.charAt(index);

            if (index == 0){
                System.out.print(text.charAt(index));
                continue;
            }
            else{
                for (int i = index; i > 0; i--){
                     if (symbolForCheck == text.charAt(i-1)){
                        thereAreSuchSymbol = true;
                    }
                }
            }

            if (thereAreSuchSymbol == false){
                System.out.print(text.charAt(index));
            }

        }
    }
}
