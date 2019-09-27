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
    public boolean purchaseMedicines(Medicine m) {
        System.out.print("Select the ID of the medicine you want to buy: \n");
        String input_id = input.nextLine();
        int remain_money = this.getMoney() - m.getPrice();
        if(input_id.equals("1")){
            System.out.println("Your money: "+ remain_money);
        }
        return true;
    }

    @Override
    public void viewPurchasedMedicines(Medicine m) {
        
    }

    @Override
    public void availDiscount(Medicine m) {
 
    }

    @Override
    public void Login(Account a) {
        boolean login = false;
        while (login!=true) {
            int trial = 0;
            while (trial!=3) {
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
    }

    @Override
    public void choices(Pharmacy p) {
        Medicine m1 = new Medicine();
        while(true){
            System.out.print("Select Transaction: \n");
            System.out.println("1. View Available Medicines\n2. Purchase Medicines\n3. View Purchased Medicines");
            String selection = input.nextLine();
            if(selection.equals("1")){
                p.displayAvailableMedicines();
            }else if(selection.equals("2")){
                p.displayAvailableMedicines();
                this.purchaseMedicines(m1);
            }
        }
    }
}
