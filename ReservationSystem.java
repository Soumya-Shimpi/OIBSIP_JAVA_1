import java.util.*;

class ReservationSystem {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Reservation> database = new HashMap<>();

    public static void reserve() {
        System.out.println("\n===== Reservation Form =====");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Train Number: ");
        int trainNo = sc.nextInt();
        String trainName = getTrainName(trainNo);
        System.out.print("Class Type (Sleeper/AC): ");
        String classType = sc.next();
        System.out.print("Date of Journey: ");
        String date = sc.next();
        System.out.print("From: ");
        String from = sc.next();
        System.out.print("To: ");
        String to = sc.next();
        String pnr = generatePNR();
        Reservation res = new Reservation(name, trainNo, trainName, classType, date, from, to, pnr);
        database.put(pnr, res);
        System.out.println("Reservation Successful!");
        System.out.println("Your PNR: " + pnr);
    }

    static String getTrainName(int trainNo) {
        if (trainNo == 101)
            return "Express";
        if (trainNo == 102)
            return "Superfast";
        return "Local Train";
    }

    static String generatePNR() {
        return "PNR" + (int) (Math.random() * 10000);
    }
}