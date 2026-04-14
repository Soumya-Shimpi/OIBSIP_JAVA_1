class Reservation {
    String name;
    int trainNo;
    String trainName;
    String classType;
    String date;
    String from;
    String to;
    String pnr;

    public Reservation(String name, int trainNo, String trainName,
            String classType, String date, String from,
            String to, String pnr) {
        this.name = name;
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.classType = classType;
        this.date = date;
        this.from = from;
        this.to = to;
        this.pnr = pnr;
    }

    void display() {
        System.out.println("\n--- Reservation Details ---");
        System.out.println("Name: " + name);
        System.out.println("Train No: " + trainNo);
        System.out.println("Train Name: " + trainName);
        System.out.println("Class: " + classType);
        System.out.println("Date: " + date);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("PNR: " + pnr);
    }
}