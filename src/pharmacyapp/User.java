/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class User implements UserTransaction {
    
    private static List<Account> customerList = new ArrayList<Account>();
    private static List<MedicineForCough> medicineForCough = new ArrayList<MedicineForCough>();
    private static List<MedicineForHeadache> medicineForHeadache = new ArrayList<MedicineForHeadache>();
    private static List<MedicineForBodyPain> medicineForBodyPain = new ArrayList<MedicineForBodyPain>();
    private static List<MedicineForAllergies> medicineForAllergies = new ArrayList<MedicineForAllergies>();
    Scanner user_input = new Scanner(System.in);

    public static List<Account> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(List<Account> customerList) {
        User.customerList = customerList;
    }

    public User() {

    }

    public static List<MedicineForCough> getMedicineForCough() {
        return medicineForCough;
    }

    public static void setMedicineForCough(List<MedicineForCough> medicineForCough) {
        User.medicineForCough = medicineForCough;
    }

    public static List<MedicineForHeadache> getMedicineForHeadache() {
        return medicineForHeadache;
    }

    public static void setMedicineForHeadache(List<MedicineForHeadache> medicineForHeadache) {
        User.medicineForHeadache = medicineForHeadache;
    }

    public static List<MedicineForBodyPain> getMedicineForBodyPain() {
        return medicineForBodyPain;
    }

    public static void setMedicineForBodyPain(List<MedicineForBodyPain> medicineForBodyPain) {
        User.medicineForBodyPain = medicineForBodyPain;
    }

    public static List<MedicineForAllergies> getMedicineForAllergies() {
        return medicineForAllergies;
    }

    public static void setMedicineForAllergies(List<MedicineForAllergies> medicineForAllergies) {
        User.medicineForAllergies = medicineForAllergies;
    }

    public void AfterLoggedout(Account a) {
        System.out.println("\n1. Register\n2. Log in\n");
        String des = user_input.nextLine();
        switch (des) {
            case "1":
                User a1 = new User();
                Account newAcc = new Account();
                a1.Basic(newAcc);
                break;
            case "2":
                this.LoginAs(a);
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }

    public void LoginAs(Account a) {
        System.out.print("Login as Customer or Pharmacist? : ");
        String log = user_input.nextLine();
        if (log.equals("Customer")) {
            this.LoginAsCustomer(a);
        } else if (log.equals("Pharmacist")) {
            this.LoginAsPharmacist(a);
        }
    }

    public void Login(Account a) {
        System.out.print("\nLogin as Customer or Pharmacist? : ");
        String log = user_input.nextLine();
        if (log.equals("Customer")) {
            this.LoginAsCustomer(a);
        } else if (log.equals("Pharmacist")) {
            this.LoginAsPharmacist(a);
        }
    }

    public void Basic(Account a) {
        System.out.print("Already have an account? yes/no : ");
        String log = user_input.nextLine();
        switch (log) {
            case "yes":
                this.Login(a);
                break;
            case "no":
                this.Register(a);
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }

    @Override
    public void Register(Account a) {
        System.out.println("\n--- REGISTER HERE ---");
        System.out.println("\n1. Customer\n2. Pharmacist\n");
        System.out.print("\nRegister as: ");
        String register = user_input.nextLine();
        switch (register) {
            case "Customer": {
                this.RegisterAsCustomer(a);
                break;
            }
            case "Pharmacist": {
                this.RegisterAsPharmacist(a);
                break;
            }
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }

    @Override
    public void LoginAsPharmacist(Account a) {
        Pharmacist pharmacist = new Pharmacist();
        pharmacist.Login(a);
    }

    @Override
    public void LoginAsCustomer(Account a) {
        if (a.getAge() < 60) {
            Adult adult = new Adult();
            adult.LoginAsAdult(a);
        } else if (a.getAge() > 60) {
            SeniorCitizen senior = new SeniorCitizen();
            senior.LoginAsSeniorCitizen(a);
        } else if (a.getAge() < 1) {
            System.out.println("Invalid Age!");
        }
    }

    @Override
    public void Logout(Account a) {
        while (true) {
            System.out.println("\nYou are now logged out.\n");
            System.out.print("Do you want to exit the program? yes/no: ");
            String exit = user_input.nextLine();
            if (exit.equals("no")) {
                this.AfterLoggedout(a);
            } else if (exit.equals("yes")) {
                System.out.println("\nExit");
                Runtime.getRuntime().exit(0);
            }
            break;
        }
    }

    @Override
    public void RegisterAsCustomer(Account a) {
        System.out.print("\nEnter first name: ");
        String fname = user_input.nextLine();
        a.setFname(fname);
        System.out.print("Enter last name: ");
        String lname = user_input.nextLine();
        a.setLname(lname);
        System.out.print("Enter username: ");
        String uname = user_input.nextLine();
        a.setUserName(uname);
        System.out.print("Enter password: ");
        String pass = user_input.nextLine();
        a.setPassWord(pass);
        System.out.print("Enter address: ");
        String address = user_input.nextLine();
        a.setAddress(address);
        System.out.print("Enter age: ");
        String age = user_input.nextLine();
        a.setAge(Integer.valueOf(age));
        customerList.add(a);
        this.LoginAsCustomer(a);
    }

    @Override
    public void RegisterAsPharmacist(Account a) {
        System.out.print("\nEnter first name: ");
        String fname = user_input.nextLine();
        a.setFname(fname);
        System.out.print("Enter last name: ");
        String lname = user_input.nextLine();
        a.setLname(lname);
        System.out.print("Enter username: ");
        String uname = user_input.nextLine();
        a.setUserName(uname);
        System.out.print("Enter password: ");
        String pass = user_input.nextLine();
        a.setPassWord(pass);
        System.out.print("Enter Licensed No: ");
        String licensed = user_input.nextLine();
        a.setPharLicensedNo(Integer.valueOf(licensed));
        System.out.print("Enter address: ");
        String address = user_input.nextLine();
        a.setAddress(address);
        System.out.print("Enter age : ");
        String age = user_input.nextLine();
        a.setAge(Integer.valueOf(age));
        this.LoginAsPharmacist(a);
    }

}
