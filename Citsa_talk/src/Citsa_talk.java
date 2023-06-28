import java.util.Scanner;

public class Citsa_talk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean isLoggedIn = false;
        String username = "";
        
        while (true) {
            System.out.println("==== Discussion Forum ====");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.println("==========================");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    if (isLoggedIn) {
                        System.out.println("You are already logged in as " + username);
                    } else {
                        System.out.print("Enter your username: ");
                        String inputUsername = scanner.next();
                        System.out.println("Welcome, " + inputUsername + "!");
                        isLoggedIn = true;
                        username = inputUsername;
                    }
                    break;
                case 2:
                    if (isLoggedIn) {
                        System.out.println("You are already logged in as " + username);
                    } else {
                        System.out.print("Enter your desired username: ");
                        String newUsername = scanner.next();
                        System.out.println("Registration successful. Welcome, " + newUsername + "!");
                        isLoggedIn = true;
                        username = newUsername;
                    }
                    break;
                case 3:
                    System.out.println("Exiting the discussion forum. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
