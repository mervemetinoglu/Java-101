import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pearPrice = 2.14,
                applePrice = 3.67,
                tomatoPrice = 1.11,
                bananaPrice = 0.95,
                auberginePrice = 5.00;
        double pearKg,
                appleKg,
                tomatoKg,
                bananaKg,
                aubergineKg;
        double totalPrice = 0.0;

        System.out.print("Kg of pears?: ");
        pearKg = scan.nextDouble();
        pearPrice *= pearKg;
        totalPrice += pearPrice;

        System.out.print("Kg of apples?: ");
        appleKg = scan.nextDouble();
        applePrice *= appleKg;
        totalPrice += applePrice;

        System.out.print("Kg of tomatoes?: ");
        tomatoKg = scan.nextDouble();
        tomatoPrice *= tomatoKg;
        totalPrice += tomatoPrice;

        System.out.print("Kg of bananas?: ");
        bananaKg = scan.nextDouble();
        bananaPrice *= bananaKg;
        totalPrice += bananaPrice;

        System.out.print("Kg of aubergine?: ");
        aubergineKg = scan.nextDouble();
        auberginePrice *= aubergineKg;
        totalPrice += auberginePrice;

        System.out.println("Total price is: " + totalPrice + " TL");

    }
}
