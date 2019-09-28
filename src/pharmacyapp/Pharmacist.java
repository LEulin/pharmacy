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
public class Pharmacist extends Person implements PharmacistOperation {

    private String name;

    Scanner input = new Scanner(System.in);

    public Pharmacist() {
        super();
    }

    @Override
    public void inventoryMedicineForCough(MedicineForCough m) {

    }

    @Override
    public void inventoryMedicineForHeadache(MedicineForHeadache m) {

    }

    @Override
    public void inventoryMedicineForBodyPain(MedicineForBodyPain m) {

    }

    @Override
    public void inventoryMedicineForAllergies(MedicineForAllergies m) {

    }

    @Override
    public boolean addMedicineForCough(MedicineForCough m) {
        m.setId(Person.getMedicineForCough().size() + 1);
        Person.getMedicineForCough().add(m);
        return true;
    }

    @Override
    public boolean addMedicineForHeadache(MedicineForHeadache m) {
        m.setId(Person.getMedicineForHeadache().size() + 1);
        Person.getMedicineForHeadache().add(m);
        return true;
    }

    @Override
    public boolean addMedicineForBodyPain(MedicineForBodyPain m) {
        m.setId(Person.getMedicineForBodyPain().size() + 1);
        Person.getMedicineForBodyPain().add(m);
        return true;
    }

    @Override
    public boolean addMedicineForAllergies(MedicineForAllergies m) {
        m.setId(Person.getMedicineForAllergies().size() + 1);
        Person.getMedicineForAllergies().add(m);
        return true;
    }

    @Override
    public boolean removeMedicineForCough(MedicineForCough m) {
        Person.getMedicineForCough().remove(m);
        return true;
    }

    @Override
    public boolean removeMedicineForHeadache(MedicineForHeadache m) {
        Person.getMedicineForHeadache().remove(m);
        return true;
    }

    @Override
    public boolean removeMedicineForBodyPain(MedicineForBodyPain m) {
        Person.getMedicineForBodyPain().remove(m);
        return true;
    }

    @Override
    public boolean removeMedicineForAllergies(MedicineForAllergies m) {
        Person.getMedicineForAllergies().remove(m);
        return true;
    }

    @Override
    public void displayAvailableMedicinesForCough() {
        System.out.println("\n\t\t\t\t\t\t--- MEDICINES FOR COUGH ---");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.printf("  %-12s  |  %-11s   |   %-6s   |   %-8s   |  %-9s   |  %10s |  %12s", "Medicine ID", "Brand Name", "Generic Name", "Price", "Type", "Expiration Date", "Quantity\n");
        System.out.println("____________________________________________________________________________________________________________________");
        for (int i = 0; i < Person.getMedicineForCough().size(); i++) {
            System.out.printf(" %-12s  | %-14s | %-14s | %-8d  | %-12s | %-15s | %10d\n", Person.getMedicineForCough().get(i).getId(), Person.getMedicineForCough().get(i).getBrandName(), Person.getMedicineForCough().get(i).getGenericName(), Person.getMedicineForCough().get(i).getPrice(), Person.getMedicineForCough().get(i).getType(), Person.getMedicineForCough().get(i).getExpirationDate(), Person.getMedicineForCough().get(i).getQuantity());
            System.out.println("____________________________________________________________________________________________________________________");
        }
    }

    @Override
    public void displayAvailableMedicinesForHeadache() {
        System.out.println("\n\t\t\t\t\t\t--- MEDICINES FOR HEADACHE ---");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.printf("  %-12s  |  %-11s   |   %-6s   |   %-8s   |  %-9s   |  %10s |  %12s", "Medicine ID", "Brand Name", "Generic Name", "Price", "Type", "Expiration Date", "Quantity\n");
        System.out.println("____________________________________________________________________________________________________________________");
        for (int i = 0; i < Person.getMedicineForHeadache().size(); i++) {
            System.out.printf(" %-12s  | %-14s | %-14s | %-8d  | %-12s | %-15s | %10d\n", Person.getMedicineForHeadache().get(i).getId(), Person.getMedicineForHeadache().get(i).getBrandName(), Person.getMedicineForHeadache().get(i).getGenericName(), Person.getMedicineForHeadache().get(i).getPrice(), Person.getMedicineForHeadache().get(i).getType(), Person.getMedicineForHeadache().get(i).getExpirationDate(), Person.getMedicineForHeadache().get(i).getQuantity());
            System.out.println("____________________________________________________________________________________________________________________");
        }
    }

    @Override
    public void displayAvailableMedicinesForBodyPain() {
        System.out.println("\n\t\t\t\t\t\t--- MEDICINES FOR BODY PAIN ---");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.printf(" %-12s  |  %-11s   |   %-6s  |   %-8s  |  %-9s   |  %10s |  %12s", "Medicine ID", "Brand Name", "Generic Name", "Price", "Type", "Expiration Date", "Quantity\n");
        System.out.println("____________________________________________________________________________________________________________________");
        for (int i = 0; i < Person.getMedicineForBodyPain().size(); i++) {
            System.out.printf(" %-12s   |  %-14s  |  %-14s  |  %-8d  |  %-12s  |  %-15s  | %10d\n", Person.getMedicineForBodyPain().get(i).getId(), Person.getMedicineForBodyPain().get(i).getBrandName(), Person.getMedicineForBodyPain().get(i).getGenericName(), Person.getMedicineForBodyPain().get(i).getPrice(), Person.getMedicineForBodyPain().get(i).getType(), Person.getMedicineForBodyPain().get(i).getExpirationDate(), Person.getMedicineForBodyPain().get(i).getQuantity());
            System.out.println("____________________________________________________________________________________________________________________");
        }
    }

    @Override
    public void displayAvailableMedicinesForAllergies() {
        System.out.println("\n\t\t\t\t\t\t--- MEDICINES FOR ALLERGIES ---");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.printf("  %-12s  | %-11s   |   %-6s   |   %-8s   |  %-9s   |  %10s |  %12s", "Medicine ID", "Brand Name", "Generic Name", "Price", "Type", "Expiration Date", "Quantity\n");
        System.out.println("____________________________________________________________________________________________________________________");
        for (int i = 0; i < Person.getMedicineForAllergies().size(); i++) {
            System.out.printf(" %-12s  | %-14s | %-14s | %-8d  | %-12s | %-15s | %10d\n", Person.getMedicineForAllergies().get(i).getId(), Person.getMedicineForAllergies().get(i).getBrandName(), Person.getMedicineForAllergies().get(i).getGenericName(), Person.getMedicineForAllergies().get(i).getPrice(), Person.getMedicineForAllergies().get(i).getType(), Person.getMedicineForAllergies().get(i).getExpirationDate(), Person.getMedicineForAllergies().get(i).getQuantity());
            System.out.println("____________________________________________________________________________________________________________________");
        }
    }

    @Override
    public void choices() {
        while (true) {
            System.out.println("\n--- CHOOSE OPERATION ---");
            System.out.println("\n1. Add Medicine\n2. Remove Medicine\n3. Display Medicines\n4. Inventory");
            System.out.print("\nSelect Operation: ");
            String operation = input.nextLine();
            
            if (operation.equals("1")) {
                System.out.println("\nIn what list of medicine do you want to add medicine?");
                System.out.println("\n1. Medicine For Cough\n2. Medicine For Headache\n3. Medicine For Body Pain\n4. Medicine For Allergies\n");
                String select = input.nextLine();
                switch (select) {
                    case "1": {
                        MedicineForCough mfc = new MedicineForCough(0);
                        System.out.print("Brand Name: ");
                        String brandname = input.nextLine();
                        mfc.setBrandName(brandname);
                        System.out.print("Generic Name: ");
                        String genericname = input.nextLine();
                        mfc.setGenericName(genericname);
                        System.out.print("Type(Capsule/Table/Syrup): ");
                        String type = input.nextLine();
                        mfc.setType(type);
                        System.out.print("Price: ");
                        int price = input.nextInt();
                        mfc.setPrice(price);
                        System.out.print("Expiration Date: ");
                        String exp = input.nextLine();
                        mfc.setExpirationDate(exp);
                        System.out.print("\nQuantity: ");
                        int qty = input.nextInt();
                        mfc.setQuantity(qty);
                        this.addMedicineForCough(mfc);
                        break;
                    }
                    case "2": {
                        MedicineForHeadache mfh = new MedicineForHeadache(0);
                        System.out.print("Brand Name: ");
                        String brandname = input.nextLine();
                        mfh.setBrandName(brandname);
                        System.out.print("Generic Name: ");
                        String genericname = input.nextLine();
                        mfh.setGenericName(genericname);
                        System.out.print("Type(Capsule/Table/Syrup): ");
                        String type = input.nextLine();
                        mfh.setType(type);
                        System.out.print("Price: ");
                        int price = input.nextInt();
                        mfh.setPrice(price);
                        System.out.print("Expiration Date: ");
                        String exp = input.nextLine();
                        mfh.setExpirationDate(exp);
                        System.out.print("Quantity: ");
                        int qty = input.nextInt();
                        mfh.setQuantity(qty);
                        this.addMedicineForHeadache(mfh);
                        break;
                    }
                    case "3": {
                        MedicineForBodyPain mfb = new MedicineForBodyPain(0);
                        System.out.print("Brand Name: ");
                        String brandname = input.nextLine();
                        mfb.setBrandName(brandname);
                        System.out.print("Generic Name: ");
                        String genericname = input.nextLine();
                        mfb.setGenericName(genericname);
                        System.out.print("Type(Capsule/Table/Syrup): ");
                        String type = input.nextLine();
                        mfb.setType(type);
                        System.out.print("Price: ");
                        int price = input.nextInt();
                        mfb.setPrice(price);
                        System.out.print("Expiration Date: ");
                        String exp = input.nextLine();
                        mfb.setExpirationDate(exp);
                        System.out.print("Quantity: ");
                        int qty = input.nextInt();
                        mfb.setQuantity(qty);
                        this.addMedicineForBodyPain(mfb);
                        break;
                    }
                    case "4": {
                        MedicineForAllergies mfa = new MedicineForAllergies(0);
                        System.out.print("Brand Name: ");
                        String brandname = input.nextLine();
                        mfa.setBrandName(brandname);
                        System.out.print("Generic Name: ");
                        String genericname = input.nextLine();
                        mfa.setGenericName(genericname);
                        System.out.print("Type(Capsule/Table/Syrup): ");
                        String type = input.nextLine();
                        mfa.setType(type);
                        System.out.print("Price: ");
                        int price = input.nextInt();
                        mfa.setPrice(price);
                        System.out.print("Expiration Date: ");
                        String exp = input.nextLine();
                        mfa.setExpirationDate(exp);
                        System.out.print("Quantity: ");
                        int qty = input.nextInt();
                        mfa.setQuantity(qty);
                        this.addMedicineForAllergies(mfa);
                        break;
                    }
                    default:
                        System.out.println("Invalid Input!");
                        break;
                }
            } else if (operation.equals("2")) {
                System.out.println("\nIn what list of medicine do you want to remove medicine?");
                System.out.println("\n1. Medicine For Cough\n2. Medicine For Headache\n3. Medicine For Body Pain\n4. Medicine For Allergies\n");
                String select = input.nextLine();
                if (select.equals("1")) {
                    System.out.println("Enter the id of the medicine you want to remove.");
                    int id = input.nextInt();
                    for (MedicineForCough mfc : Person.getMedicineForCough()) {
                        if (id == mfc.getId()) {
                            this.removeMedicineForCough(mfc);
                        }
                    }
                } else if (select.equals("2")) {
                    System.out.println("Enter the id of the medicine you want to remove.");
                    int id = input.nextInt();
                    for (MedicineForHeadache mfh : Person.getMedicineForHeadache()) {
                        if (id == mfh.getId()) {
                            this.removeMedicineForHeadache(mfh);
                        }
                    }
                } else if (select.equals("3")) {
                    System.out.println("Enter the id of the medicine you want to remove.");
                    int id = input.nextInt();
                    for (MedicineForBodyPain mfb : Person.getMedicineForBodyPain()) {
                        if (id == mfb.getId()) {
                            this.removeMedicineForBodyPain(mfb);
                        }
                    }
                }else if (select.equals("4")) {
                    System.out.println("Enter the id of the medicine you want to remove.");
                    int id = input.nextInt();
                    for (MedicineForAllergies mfa : Person.getMedicineForAllergies()) {
                        if (id == mfa.getId()) {
                            this.removeMedicineForAllergies(mfa);
                        }
                    }
                }else{
                    System.out.println("Invalid Input!");
                }
            }else if(operation.equals("3")){
                System.out.println("\nWhat list of medicine you want to display?");
                System.out.println("\n1. Medicine For Cough\n2. Medicine For Headache\n3. Medicine For Body Pain\n4. Medicine For Allergies\n");
                String dis = input.nextLine();
                switch (dis) {
                    case "1":
                        this.displayAvailableMedicinesForCough();
                        break;
                    case "2":
                        this.displayAvailableMedicinesForHeadache();
                        break;
                    case "3":
                        this.displayAvailableMedicinesForBodyPain();
                        break;
                    case "4":
                        this.displayAvailableMedicinesForAllergies();
                        break;
                    default:
                        break;
                }
            }else if(operation.equals("4")){
                System.out.println("\nWhat list of medicine you want to display the inventory?");
                System.out.println("\n1. Medicine For Cough\n2. Medicine For Headache\n3. Medicine For Body Pain\n4. Medicine For Allergies\n");
                String inv = input.nextLine();
                switch (inv) {
                    case "1":
                        System.out.println("Inventory for medicine for cough");
                        break;
                    case "2":
                        System.out.println("Inventory for medicine for head ache");
                        break;
                    case "3":
                        System.out.println("Inventory for medicine for body pain");
                        break;
                    case "4":
                        System.out.println("Inventory for medicine for allergies");
                        break;
                    default:
                        System.out.println("Invalid Input!");
                        break;
                }
            }else{
                System.out.println("Invalid Input!");
            }
        }
    }

}
