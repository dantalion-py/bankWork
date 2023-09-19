package models;

import java.util.Scanner;

public class Opcions {
    private Scanner scanner;
    public void createUser(){
        try{

            this.scanner = new Scanner(System.in); 
            
            System.out.println("Enter a user: ");
            String user = scanner.next(); 
            System.out.println("Enter a password: ");
            String password = scanner.next(); 

            System.out.println("Enter a Account type (CHECKING_ACCOUNT, SAVINGS_ACCOUNT, C2000_ACCOUNT): ");
            String accountTypeStr = scanner.next();
    
            AccountTypes accountType = null; 
            
            switch (accountTypeStr.toUpperCase()) {
                case "CHECKING":
                    accountType = AccountTypes.CHECKING_ACCOUNT;
                    break;
                case "SAVING":
                    accountType = AccountTypes.SAVINGS_ACCOUNT;
                    break;
                case "C2000":
                    accountType = AccountTypes.C2000_ACCOUNT;
                    break;
                default:
                    System.out.println("Tipo de cuenta no válido.");
            }
            
            System.out.println("Enter a total balance: ");
            double totalBalance = scanner.nextDouble(); 
            var newUser = new User(user, password,accountType , totalBalance);
            System.out.println(newUser);
        }catch(Exception e){
            System.out.println("fail");
        }

    }
    
}
