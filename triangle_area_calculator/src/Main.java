import java.util.Scanner;

/*
* triangle perimeter = 2u
* u = (a+b+c) / 2
 area * area = u * (u-a) * (u-b) * (u-c)
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        double u, area;

        System.out.print("Enter the first side length of triangle: " );
        a = scanner.nextInt();
        System.out.print("Enter the second side length of triangle: " );
        b = scanner.nextInt();
        System.out.print("Enter the third side length of triangle: " );
        c = scanner.nextInt();

        u = (a+b+c) / 2;
        area = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("The area is: " + area);
    }
}
