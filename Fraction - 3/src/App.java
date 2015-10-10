import java.time.LocalDate;

/**
 * Created by Honey on 18.09.2015.
 */
public class App {

    public static void main(String[] args) {
        Fraction firstFraction = new Fraction(3,2);
        Fraction secondFraction = new Fraction(3,2);
        System.out.println("First fraction is: " + firstFraction.toString() + ", second: " + secondFraction.toString());


        Fraction resultSumm = firstFraction.add(secondFraction);
        System.out.println("Summ is: " + resultSumm.toString());
//        System.out.println("Reducing fraction is: " + resultSumm.reducing());
        resultSumm.getIntegerPart();
        System.out.println();

        Fraction resultSubstruct = firstFraction.substruct(secondFraction);
        System.out.println("Substruct is: " + resultSubstruct.toString());
//        System.out.println("Reducing fraction is: " + resultSubstruct.reducing());
        resultSubstruct.getIntegerPart();
        System.out.println();

        Fraction resultDividing = firstFraction.dividing(secondFraction);
        System.out.println("Dividing is: " + resultDividing.toString());
//        System.out.println("Reducing fraction is: " + resultDividing.reducing());
        resultDividing.getIntegerPart();
        System.out.println();

        Fraction resultMultiply = firstFraction.multiply(secondFraction);
        System.out.println("Multiply is: " + resultMultiply.toString());
//        System.out.println("Reducing fraction is: " + resultMultiply.reducing());
        resultMultiply.getIntegerPart();
        System.out.println();

        firstFraction.compareFractions(secondFraction);
    }
}
