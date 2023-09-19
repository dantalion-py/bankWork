package models;

import java.util.Scanner;

public class Bank {
    private String nameBank;
    private Scanner scanner;
    private Account account;
    public Bank(String nammeBank){
        this.nameBank = nammeBank;
        this.scanner = new Scanner(System.in); 
    }
    public void menuBank() {
        while (true) { 
            System.out.println("Bienvenido a " + nameBank);
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Crear cuenta");
            System.out.println("3. Salir");

            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt(); 

            switch (opcion) {
                case 1:
                    try{
                        System.out.println("Ingrese su contraseña: ");
                        String password = scanner.next(); 
                
                        account.sigIn(password); 
                
                    }catch(Exception e){
                        System.out.println("Failed to log in " + e);
                    }
                    
                break;
                case 2:
                    try{

                        var newUser = new User(nameBank, nameBank, null, opcion);
                        var newAccount = new Account(newUser);
                    }catch(Exception e){
                        System.out.println("Failed to create an account " + e);
                    }
                break;
                case 3:
                    System.out.println("Gracias por usar " + nameBank + ". ¡Hasta luego!");
                    scanner.close(); 
                    return; 
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        }
    }

}
