import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amount, vatRate, vatAmount, totalAmount;

        System.out.print("Please enter the amount: ");
        amount = scan.nextDouble();

        vatRate = (amount < 1000 && amount > 0) ? 0.18 : 0.08;
        vatAmount = amount * vatRate;
        totalAmount = amount + vatAmount;

        System.out.println("VAT rate is: " + vatRate * 100);
        System.out.println("Total amount with VAT: " + totalAmount);

    }
}
