import java.util.*;

public class Login {
    static Scanner sc = new Scanner(System.in);
    static String USERNAME = "user";
    static String PASSWORD = "1919";

    public static void main(String[] args) {
        if (login()) {
            int choice;
            do {
                System.out.println("\n===== Online Reservation System =====");
                System.out.println("1. Reservation");
                System.out.println("2. Cancellation");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        ReservationSystem.reserve();
                        break;
                    case 2:
                        CancellationSystem.cancel();
                        break;
                    case 3:
                        System.out.println("Thank you!");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 3);
        }
    }

    static boolean login() {
        System.out.println("===== Login =====");
        System.out.print("Username: ");
        String user = sc.next();
        System.out.print("Password: ");
        String pass = sc.next();
        if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
            System.out.println("Login Successful!");
            return true;
        } else {
            System.out.println("Invalid Credentials!");
            return false;
        }
    }
}