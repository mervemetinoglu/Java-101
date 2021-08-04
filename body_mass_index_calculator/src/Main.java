import java.util.Scanner;
/*
* formula = weight / (height * height)
* */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double weight, height, bodyMassIndex;

        System.out.print("Please enter your weight (kg): ");
        weight = scan.nextDouble();

        System.out.print("Please enter your height (m): ");
        height = scan.nextDouble();

        bodyMassIndex = weight / Math.pow(height, 2);

        System.out.println("Your body mass index is: " + bodyMassIndex);

    }
}
