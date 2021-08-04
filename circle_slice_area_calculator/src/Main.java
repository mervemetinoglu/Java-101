import java.util.Scanner;
/*
*  areaFormula = (pi * (r*r) * angle) / 360
* */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int radius, centerAngle;
        double PI = 3.14;
        double area;

        System.out.print("Enter the radius: ");
        radius = scan.nextInt();

        System.out.print("Enter the center angle: ");
        centerAngle = scan.nextInt();

        area = (PI * Math.pow(radius, 2) * centerAngle ) / 360;

        System.out.println("The circle slice area is: " + area);

    }
}
