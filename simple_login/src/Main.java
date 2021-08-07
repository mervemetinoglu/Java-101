import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String USER_NAME = "MM", PASSWORD = "pass123";
        String userName, password, newPassword;
        byte userChoice;
        boolean notChangedPass = true;

        System.out.print("Username: ");
        userName = scanner.nextLine();

        System.out.print("Password: ");
        password = scanner.nextLine();


        if(userName.equals(USER_NAME) && !password.equals(PASSWORD)) {
            System.out.print("The password is wrong. Do you want to change the password? [Yes:1, No:0]: ");
            userChoice = scanner.nextByte();
            scanner.nextLine();

            if(userChoice == 1) {
                System.out.print("Please enter a new password: ");
                newPassword = scanner.nextLine();

                while(notChangedPass) {
                    if(!(newPassword.equals(PASSWORD)) && !(newPassword.equals(password))){
                        PASSWORD = newPassword;
                        System.out.println("Password has changed..");
                        notChangedPass = false;
                    } else {
                        System.out.print("Could not create password, please enter another password: ");
                        newPassword = scanner.nextLine();
                    }
                }

            }
        } else if(!userName.equals(USER_NAME)){
            System.out.println("Wrong username, please try again..");
        } else{
            System.out.println("Signed in..");
        }

    }
}
