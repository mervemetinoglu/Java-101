import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double km, perKm = 2.20, totalPrice;
        int startPrice = 10;

        System.out.print("Enter the km info: ");
        km = scan.nextDouble();

        totalPrice = startPrice + (km * perKm);

        totalPrice = (totalPrice <= 20.0) ? 20.0 : totalPrice;

        System.out.println("The total price is: " + totalPrice + " TL");


    }
}
