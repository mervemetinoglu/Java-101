import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int math, physics, chemistry,turkish, history, music;
        int sumOfNotes = 0;
        double averageGrade = 0.0;


        System.out.print("Enter your math exam note: ");
        math = scan.nextInt();
        sumOfNotes += math;

        System.out.print("Enter your physics exam note: ");
        physics = scan.nextInt();
        sumOfNotes += physics;

        System.out.print("Enter your chemistry exam note: ");
        chemistry = scan.nextInt();
        sumOfNotes += chemistry;

        System.out.print("Enter your turkish exam note: ");
        turkish = scan.nextInt();
        sumOfNotes += turkish;

        System.out.print("Enter your history exam note: ");
        history = scan.nextInt();
        sumOfNotes += history;

        System.out.print("Enter your music note: ");
        music = scan.nextInt();
        sumOfNotes += music;



        try {
            averageGrade = sumOfNotes / 6;
            System.out.println("Here is your average grade: " + averageGrade);
            String result = (averageGrade >= 60) ? "You Passed.." : "You Failed..";
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
