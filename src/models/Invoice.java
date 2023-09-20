package models;

import java.time.LocalDate;
import java.util.UUID;

public class Invoice {
    private String id;
    private LocalDate date;
    private double totalWithdrawn;
    private double totalDeposit;
    private User user;

    public Invoice(User user, double totalWithdrawn, double totalDeposit){
        this.id = generateUUID();
        this.date = LocalDate.now();
        this.user = user;
        this.totalWithdrawn = totalWithdrawn;
        this.totalDeposit = totalDeposit;
    }

    public static String generateUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    public void getInvoice() {
        System.out.println("====================================");
        System.out.println("           Invoice Details           ");
        System.out.println("====================================");
        System.out.println("Invoice ID: " + id);
        System.out.println("Date: " + date);
        System.out.println("User: " + user.getUserName());
        System.out.println("------------------------------------");
        System.out.println("Withdrawn: " + totalWithdrawn);
        System.out.println("Deposited: " + totalDeposit);
        System.out.println("Total Balance: " + user.getTotalBalance());
        System.out.println("====================================");
    }
    

}
