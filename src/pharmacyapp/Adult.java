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
        System.out.print("\nSelect the ID of the medicine you want to buy: ");
        id = input.nextInt();
        for (MedicineForHeadache med : Customer.getMedicineForHeadache()) {
            if (med.getId() == id) {
                med.setQuantity(med.getQuantity() - 1);
            } else if (id != med.getId()) {
                System.out.println("Medicine does not exist.");
            }
        }
        return true;
    }

    @Override
    public boolean purchaseMedicineForBodyPain(int id) {
        Pharmacist p = new Pharmacist();
        p.displayAvailableMedicinesForBodyPain();
        System.out.print("\nSelect the ID of the medicine you want to buy: ");
        id = input.nextInt();
        for (MedicineForBodyPain med : Customer.getMedicineForBodyPain()) {
            if (med.getId() == id) {
                med.setQuantity(med.getQuantity() - 1);
            } else if (id != med.getId()) {
                System.out.println("Medicine does not exist.");
            }

        }
        return true;
    }

    @Override
    public boolean purchaseMedicineForAllergies(int id) {
        Pharmacist p = new Pharmacist();
        p.displayAvailableMedicinesForAllergies();
        System.out.print("\nSelect the ID of the medicine you want to buy: ");
        id = input.nextInt();
        for (MedicineForAllergies med : Pharmacist.getMedicineForAllergies()) {
            if (med.getId() == id) {
                System.out.print("\nHow many " + med.getBrandName() + " do you want to buy? : ");
                int buy = input.nextInt();
                if (med.getQuantity() == buy) {
                    User.getMedicineForAllergies().remove(med);
                } else if (med.getQuantity() > buy) {
                    med.setQuantity(med.getQuantity() - buy);
                }
            } else if (id != med.getId()) {
                System.out.println("Medicine does not exist.");
            }
        }
        return true;
    }

    @Override
    public boolean purchaseMedicineForCough(int id) {
        Pharmacist p = new Pharmacist();
        p.displayAvailableMedicinesForCough();
        System.out.print("\nSelect the ID of the medicine you want to buy: ");
        id = input.nextInt();
        for (MedicineForCough med : Customer.getMedicineForCough()) {
            if (med.getId() == id) {
                med.setQuantity(med.getQuantity() - 1);
            } else if (id != med.getId()) {
                System.out.println("Medicine does not exist.");
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
    public void LoginAsAdult(Account a) {
        System.out.println("\n--- LOGIN ---\nYou have 3 trials to Login");
        int trial = 0;
        while (trial != 3) {
            System.out.print("\nEnter Username: ");
            String username = input.nextLine();
            System.out.print("Enter Password: ");
            String password = input.nextLine();
            if (username.equals(a.getUserName()) && password.equals(a.getPassWord())) {
                Pharmacy rose = new Pharmacy("Rose Pharmacy");
                System.out.println("\n--- WELCOME " + rose.getName() + "  ---\n\n" + a.getFname() + " " + a.getLname() + " You are now logged in.\n");
                System.out.println("You can now purchase medicines.");
                this.choices(a);
            } else {
                System.out.println("Incorrect filled inputs.");
                trial++;
            }
        }
    }

    @Override
    public void choices(Account a) {
        Pharmacist p = new Pharmacist();
        while (true) {
            System.out.println("\n--- CHOOSE OPERATION ---");
            System.out.println("\n1. View Available Medicines\n2. Purchase Medicines\n3. View Purchased Medicines\n4. Logout");
            System.out.print("\nSelect Transaction: ");
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
                case "4":
                    System.out.print("\nAre you sure to Logout? yes/no : ");
                    String logout = input.nextLine();
                    if (logout.equals("yes")) {
                        this.Logout(a);
                    } else if (logout.equals("no")) {

                    }
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }

    @Override
    public void Logout(Account a) {
        super.Logout(a);
    }

    @Override
    public void LoginAsSeniorCitizen(Account a) {
        
    }
}
