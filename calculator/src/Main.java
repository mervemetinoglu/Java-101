import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber, secondNumber;
        int userChoice;

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextDouble();

        System.out.print("1-Sum\t2-Subtraction\t3-Division\t4-Multiplication: ");
        userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("Sum: " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("Subtraction: " + (firstNumber - secondNumber));
                break;
            case 3:
                if(secondNumber > 0)
                    System.out.println("Division: " + firstNumber / secondNumber);
                else
                    System.out.println("You can not divide by 0.");
                break;
            case 4:
                System.out.println("Multiplication: " + (firstNumber * secondNumber));
                break;
            default:
                System.out.println("Invalid choice..");

        }

    }
}
