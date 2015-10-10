import java.util.Random;
import java.lang.Math;

/**
 * Created by Honey on 10.09.2015.
 */
public class Triangle {
    public static void main(String[] args) {

        Random rand = new Random();
        Point point1 = new Point(rand.nextInt(10),rand.nextInt(10));
        Point point2 = new Point(rand.nextInt(10),rand.nextInt(10));
        Point point3 = new Point(rand.nextInt(10),rand.nextInt(10));

        printPoints(point1);
        printPoints(point2);
        printPoints(point3);

        System.out.println();

        int side1 = countSidesOfTriangle(point1, point2);
        int side2 = countSidesOfTriangle(point2, point3);
        int side3 = countSidesOfTriangle(point1, point3);

        System.out.println("side 1 = " + side1);
        System.out.println("side 2 = " + side2);
        System.out.println("side 3 = " + side3);

        checkIsItATriangle(side1, side2, side3);

    }

    private static void printPoints(Point point) {
        System.out.println("Point {" + point.x + " : " + point.y + "}");
    }


    private static int countSidesOfTriangle(Point point1, Point point2) {
        int side = (int)Math.pow((Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2)), (0.5));
        return side;
    }


    private static void checkIsItATriangle(double side1, double side2, double side3) {
        if ((side1 + side2) > side3) {
            System.out.println("Congratulations!!! It's a triangle!!!");
        } else {
            System.out.println("No, it's not a triangle...");
        }
    }
}
