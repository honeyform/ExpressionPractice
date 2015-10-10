/**
 * Created by Honey on 18.09.2015.
 */
public class Fraction {
    private final int numenator;
    private final int denominator;

    public Fraction(int numenator, int denominator) {
        this.numenator = numenator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction second) {
        if (denominator != second.denominator) {
            int newDenominator = denominator * second.denominator;
            int newNumenator = numenator * second.denominator + second.numenator * denominator;
            return new Fraction(newNumenator, newDenominator).reducing();
        }
        return new Fraction(numenator + second.numenator, denominator).reducing();
    }

    public Fraction substruct(Fraction second) {
        if (denominator != second.denominator) {
            int newDenominator = denominator * second.denominator;
            int newNumenator = numenator * second.denominator - second.numenator * denominator;
            return new Fraction(newNumenator, newDenominator).reducing();
        }
        return (numenator - second.numenator)==0?new Fraction(numenator - second.numenator, denominator):
                new Fraction(numenator - second.numenator, denominator).reducing();
    }

    public Fraction dividing(Fraction second) {
        int newNumenator = numenator * second.denominator;
        int newDenominator = denominator * second.numenator;
        return new Fraction(newNumenator, newDenominator).reducing();
    }

    public Fraction multiply(Fraction second) {
        int newNumenator = numenator * second.numenator;
        int newDenominator = denominator * second.denominator;
        return new Fraction(newNumenator, newDenominator).reducing();
    }

    public void compareFractions(Fraction second){
        if (denominator != second.denominator) {
            int newDenominator = denominator * second.denominator;
            int newFirstNumenator = numenator*second.denominator;
            int newSecondNumenator = second.numenator*denominator;

            if (newFirstNumenator == newSecondNumenator){
                System.out.println("Fractions are equal!");
            }
            System.out.println("Fraction " + numenator + "/" + denominator + " is " + ((newFirstNumenator > newSecondNumenator) ? "more":"less")
                    + " then fraction " + second.numenator + "/" + second.denominator + " for " + new Fraction(newFirstNumenator-newSecondNumenator, newDenominator).reducing());
        }
        else {
            if (numenator == second.numenator){
                System.out.println("Fractions are equal!");
            }
            else {
                System.out.println("Fraction " + numenator + "/" + denominator + " is " + ((numenator > second.numenator) ? "more":"less")
                        + " then fraction " + second.numenator + "/" + second.denominator + " for " + new Fraction(numenator-second.numenator, denominator).reducing());
            }

        }
    }

    private Fraction reducing() {
        int commonDenominator = findCommonDenominatorByEvclin(numenator,denominator);
        if (commonDenominator > 1) {
            return new Fraction(numenator / commonDenominator, denominator / commonDenominator);
        }
        return this;
    }

    private int findCommonDenominatorByEvclin(int first, int second) {
        if (second == 0){
            return first;
        } else {
            return findCommonDenominatorByEvclin(second, first%second);
        }
    }

    public void getIntegerPart (){
        System.out.println("The fraction with integer part is: " + ((numenator == 0) ? numenator : numenator/denominator) + " " + ((numenator%denominator == 0) ? "" : numenator%denominator + "/" + denominator));
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return "" + numenator;
        }
        else if (numenator == 0){
            return "" + numenator;
        }
        else {
            return numenator + "/" + denominator;
        }

    }
}
