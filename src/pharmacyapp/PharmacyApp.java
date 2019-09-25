/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;
//import java.util.HashMap;
//import java.util.Scanner;
/**
 *
 * @author 2ndyrGroupB
 */
public class PharmacyApp {

    
    public static void main(String[] args) {
        
        
        
        Pharmacy rose = new Pharmacy("Rose Pharmacy");


       MedicineForCough ambroxol = new MedicineForCough("1-AL AX [+ Levocetirizine]","Ambroxol (OS: BAN, DCF)",20,"Tablet","September 30 ,2019",50);
       MedicineForBodyPain ibuprofen = new MedicineForBodyPain("Alaxan Fr","Ibuprofen",20,"Tablet","September 25 ,2019",50);
       MedicineForHeadache biogesic = new MedicineForHeadache("Biogesic","Paracetamol",20,"Tablet","January 20 ,2019",50);
       MedicineForAllergies fongamil = new MedicineForAllergies("Fongamil","Omoconazole",20,"Tablet","January 20 ,2019",50);
       SeniorCitizen lyda = new SeniorCitizen();
         
       rose.addMedicine(fongamil);
       rose.displayAvailableMedicines();
        
        
    }
}
//        HashMap<String, String> userInput = new HashMap<>();
//        int trial = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome To Rose Pharmacy\n");
//        while(true){
//            SeniorCitizen s1 = new SeniorCitizen();
//            System.out.print("Do you have an Account? Yes/No: ");
//            String ans = input.nextLine();
//            if(ans.equals("Yes")){
//                while(trial != 3){
//                    System.out.print("Enter Username: ");
//                    String unameInput = input.nextLine();
//                    System.out.print("Enter Password: ");
//                    String passInput = input.nextLine();
//                    for(String i : userInput.values()){
//                        System.out.println(i);
//                        if(unameInput.equals(userInput.get(i)) && passInput.equals(userInput.get(i))){
//                            System.out.println("You are logged in.");
//                            break;
//                        }else{
//                            System.out.println("Incorrect Input.");
//                            trial+=1;
//                            break;
//                        }
//                    }
//                }
//                System.out.println("You've reached the limit of logging in.");
//                break;
//            }else if(ans.equals("No")){
//                System.out.println("Please fill in the registration form.\n");
//                while(true){
//                    System.out.print("First Name: ");
//                    String fname = input.nextLine();
//                    userInput.put("First Name ", fname);
//                    System.out.print("Last Name: ");
//                    String lname = input.nextLine();
//                    userInput.put("Last Name ", lname);
//                    System.out.print("Age: ");
//                    String age = input.nextLine();
//                    userInput.put("Age ", age);
//                    System.out.print("Username: ");
//                    String uname = input.nextLine();
//                    userInput.put("Username ", uname);
//                    System.out.print("Password: ");
//                    String pass = input.nextLine();
//                    userInput.put("Password ", pass);
//                    if(Integer.valueOf(age) > 59){
//                        System.out.println("\nYou can avail 20% discount on any medicines.");
//                    }
//                    if(fname.isEmpty() || lname.isEmpty() || age.isEmpty() || uname.isEmpty() || pass.isEmpty()){
//                        System.out.println("Please fill in the following data");
//                        break;
//                    }else{
//                        System.out.println("\n");
//                        System.out.println(userInput+"\n");
//                        break;
//                    }
//                }
//            }
//        }
//    }
//}