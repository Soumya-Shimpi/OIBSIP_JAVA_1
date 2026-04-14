import java.util.*;

class CancellationSystem {
    static Scanner sc = new Scanner(System.in);

    public static void cancel() {
        System.out.println("\n===== Cancellation =====");
        System.out.print("Enter PNR: ");
        String pnr = sc.next();
        Reservation res = ReservationSystem.database.get(pnr);
        if (res != null) {
            res.display();
            System.out.print("Confirm cancellation? (yes/no): ");
            String confirm = sc.next();
            if (confirm.equalsIgnoreCase("yes")) {
                ReservationSystem.database.remove(pnr);
                System.out.println("Ticket Cancelled Successfully!");
            } else {
                System.out.println("Cancellation Aborted.");
            }
        } else {
            System.out.println("PNR not found!");
        }
    }
}