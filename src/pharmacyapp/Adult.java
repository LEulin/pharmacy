/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class Adult extends Customer {

    Scanner input = new Scanner(System.in);

    public Adult() {
    }

    public Adult(int money) {
        super(money);
    }

    public Adult(Account account, int money, int age) {
        super(account, money, age);
    }

    public Adult(Account account, int age) {
        super(account, age);
    }

    @Override
    public void viewAvailableMedicines(Pharmacy p) {

    }

    @Override
    public boolean purchaseMedicines() {
        System.out.println("Select a specific list of medicines you want to buy of. ");
        System.out.println("1. Medicines For Cough\n2. Medicines For Headache\n3. Medicines For Body Pain\n4. Medicines For Allergies");
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                this.purchaseMedicineForCough(0);
                break;
            case "2":
                this.purchaseMedicineForHeadache(0);
                break;
            case "3":
                this.purchaseMedicineForBodyPain(0);
                break;
            case "4":
                this.purchaseMedicineForAllergies(0);
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
        return true;
    }

    @Override
    public boolean purchaseMedicineForHeadache(int id) {
        Pharmacist p = new Pharmacist();
        p.displayAvailableMedicinesForHeadache();
        System.out.print("Select the ID of the medicine you want to buy: ");
        id = input.nextInt();
        for (MedicineForHeadache med : Customer.getMedicineForHeadache()) {
            if (med.getId() == id) {
                med.setQuantity(med.getQuantity() - 1);
            }
        }
        return true;
    }

    @Override
    public boolean purchaseMedicineForBodyPain(int id) {
        Pharmacist p = new Pharmacist();
        p.displayAvailableMedicinesForBodyPain();
        System.out.print("Select the ID of the medicine you want to buy: ");
        id = input.nextInt();
        for (MedicineForBodyPain med : Customer.getMedicineForBodyPain()) {
            if (med.getId() == id) {
                med.setQuantity(med.getQuantity() - 1);
            }
        }
        return true;
    }

    @Override
    public boolean purchaseMedicineForAllergies(int id) {
        Pharmacist p = new Pharmacist();
        p.displayAvailableMedicinesForAllergies();
        System.out.print("Select the ID of the medicine you want to buy: ");
        id = input.nextInt();
        for (MedicineForAllergies med : Customer.getMedicineForAllergies()) {
            if (med.getId() == id) {
                med.setQuantity(med.getQuantity() - 1);
            }
        }
        return true;
    }

    @Override
    public boolean purchaseMedicineForCough(int id) {
        Pharmacist p = new Pharmacist();
        p.displayAvailableMedicinesForCough();
        System.out.print("Select the ID of the medicine you want to buy: ");
        id = input.nextInt();
        for (MedicineForCough med : Customer.getMedicineForCough()) {
            if (med.getId() == id) {
                med.setQuantity(med.getQuantity() - 1);
            }
        }
        return true;
    }

    @Override
    public void viewPurchasedMedicines() {

    }

    @Override
    public void availDiscount(Medicine m) {

    }

    @Override
    public void Login(Account a) {
        boolean login = false;
        while (login != true) {
            int trial = 0;
            while (trial != 3) {
                System.out.print("Enter Username: ");
                String username = input.nextLine();
                System.out.print("Enter Password: ");
                String password = input.nextLine();
                if (username.equals(a.getUserName()) && password.equals(a.getPassWord()) && a.getAge() >= 60) {
                    System.out.println("You are now logged in.\n");
                    System.out.println("You can now purchase medicine with 20% discount.");
                    login = true;
                } else if (username.equals(a.getUserName()) && password.equals(a.getPassWord())) {
                    System.out.println("You are now logged in.\n");
                    System.out.println("You can now purchase medicines.");
                    login = true;
                } else {
                    System.out.println("Incorrect filled inputs.");
                    trial++;
                    break;
                }
                break;
            }
        }
    }

    @Override
    public void Logout() {
        
    }

    @Override
    public void Register(Account a) {
        System.out.println("Register here!\n");
        System.out.print("Enter First name: ");
        String fname = input.nextLine();
        a.setFname(fname);
        System.out.print("Enter Last name: ");
        String lname = input.nextLine();
        a.setLname(lname);
        System.out.print("Enter your age: ");
        String age = input.nextLine();
        a.setAge(Integer.valueOf(age));
        System.out.print("Enter Username: ");
        String uname = input.nextLine();
        a.setUserName(uname);
        System.out.print("Enter Password: ");
        String pass = input.nextLine();
        a.setPassWord(pass);
        System.out.println("\nYou're now registered.\n_____________________________________");
        this.Login(a);
    }

    @Override
    public void choices() {
        Pharmacist p = new Pharmacist();
        while (true) {
            System.out.println("\n--- CHOOSE OPERATION ---");
            System.out.println("\n1. View Available Medicines\n2. Purchase Medicines\n3. View Purchased Medicines\n");
            System.out.print("Select Transaction: ");
            String selection = input.nextLine();
            switch (selection) {
                case "1":
                    System.out.println("\n1. Medicines for cough\n2. Medicines for headache\n3. Medicines for body pain\n4. Medicines for allergies");
                    System.out.print("\nWhat specific list medicines you want to view?: ");
                    String choose = input.nextLine();
                    switch (choose) {
                        case "1":
                            p.displayAvailableMedicinesForCough();
                            break;
                        case "2":
                            p.displayAvailableMedicinesForHeadache();
                            break;
                        case "3":
                            p.displayAvailableMedicinesForBodyPain();
                            break;
                        case "4":
                            p.displayAvailableMedicinesForAllergies();
                            break;
                        default:
                            System.out.println("Invalid Input!");
                            break;
                    }
                    break;
                case "2":
                    this.purchaseMedicines();
                    break;
                case "3":
                    this.viewPurchasedMedicines();
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }

}
