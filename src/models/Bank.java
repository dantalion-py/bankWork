package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.account.Account;
import models.account.AccountFactory;

public class Bank {
    private String nameBank;
    private Scanner scanner;
    private List<Account> accounts; // Lista de usuarios registrados

    public Bank(String nameBank) {
        this.nameBank = nameBank;
        this.scanner = new Scanner(System.in);
        this.accounts = new ArrayList<>(); // Inicializar la lista de usuarios
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
                    try {
                        System.out.println("Ingrese su nombre de usuario: ");
                        String username = scanner.next();
                        System.out.println("Ingrese su contraseña: ");
                        String password = scanner.next();

                        Account loggedInUser = null;

                        // Buscar al usuario por nombre de usuario
                        for (Account account : accounts) {
                            if (account.getNameAccount().equals(username)) {
                                loggedInUser = account;
                                break;
                            }
                        }

                        if (loggedInUser != null && loggedInUser.validate(password)) {
                            System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + loggedInUser.getNameAccount() + "!");
                            new Opcions().acctionsUser(loggedInUser);

                        } else {
                            System.out.println("Nombre de usuario o contraseña incorrectos. Inicio de sesión fallido.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error al intentar iniciar sesión: " + e);
                    }

                    break;
                case 2:
                    try {
                        var newUser = new Opcions().createUser();
                        Account account = AccountFactory.createAccount(newUser, newUser.getAccountTypes());
                        accounts.add(account); 
                        System.out.println("Usuario y cuenta creados exitosamente.");
                    } catch (Exception e) {
                        System.out.println("Error al crear una cuenta: " + e);
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
