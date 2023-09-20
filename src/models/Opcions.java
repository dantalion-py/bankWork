package models;

import java.util.InputMismatchException;
import java.util.Scanner;

import models.account.Account;
import models.account.AccountTypes;

public class Opcions {
    private Scanner scanner = new Scanner(System.in);
    public User createUser() {
        try {
    
            System.out.println("Enter a user: ");
            String username = scanner.next();
    
            System.out.println("Enter a password: ");
            String password = scanner.next();
    
            System.out.println("Enter an Account type (CHECKING, SAVINGS, C2000): ");
            String accountTypeStr = scanner.next();
    
            AccountTypes accountType = null;
    
            switch (accountTypeStr.toUpperCase()) {
                case "CHECKING":
                    accountType = AccountTypes.CHECKING;
                    break;
                case "SAVINGS":
                    accountType = AccountTypes.SAVINGS;
                    break;
                case "C2000":
                    accountType = AccountTypes.C2000;
                    break;
                default:
                    System.out.println("Invalid account type.");
                    return null; // Retorna null en caso de error.
            }
    
            System.out.println("Enter a total balance: ");
            double totalBalance = scanner.nextDouble();
            var newUser = new User(username, password, accountType, totalBalance);
    
            return newUser; // Retorna el usuario creado.
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format.");
            return null; // Retorna null en caso de error.
        }
    }
    public void acctionsUser(Account account){
        System.out.println("1.- hacer retiro con factura: ");
        System.out.println("2.- hacer retiro sin factura: ");
        System.out.println("3.- hacer deposito con factura: ");
        System.out.println("4.- hacer deposito sin factura: ");
        String option = scanner.next();
        switch (option) {
            case "1":
                account.withdrawalWithInvoice(acctionsUserEconomicMovementWithdrawal());
                break;
            case "2":
                account.withdrawalWithoutInvoice(acctionsUserEconomicMovementWithdrawal());;
            break;
            case "3":
                account.depositWithInvoice(acctionsUserEconomicMovementDeposit());
            break;
            case "4":
                account.depositWithoutInvoice(acctionsUserEconomicMovementDeposit());
            break;
            default:
            System.out.println("Invalid account type.");
            }

    }
    public double acctionsUserEconomicMovementWithdrawal(){
        System.out.println("Ingrese la cantidad que desea retirar: ");
        double amount = scanner.nextDouble();
        return amount;
    }
    public double acctionsUserEconomicMovementDeposit(){
        System.out.println("Ingrese la cantidad que desea depositar: ");
        double amount = scanner.nextDouble();
        return amount;
    }
}
