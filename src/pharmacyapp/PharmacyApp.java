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

        MedicineForHeadache biogesic = new MedicineForHeadache(0, "Biogesic", "Paracetamol", 15, "Tablet", "January 20 ,2019", 50);
        MedicineForAllergies fongamil = new MedicineForAllergies(0, "Fongamil", "Omoconazole", 16, "Tablet", "January 20 ,2019", 50);
        Adult mark = new Adult(500);
        Account a = new Account();
        
        
        //pharmacist side
        
        rose.addMedicine(biogesic);
        rose.addMedicine(fongamil);
        
        // user side
        mark.Register(a);
        mark.Login(a);
        rose.displayAvailableMedicines();
        mark.purchaseMedicines(fongamil);
//        mark.choices(rose);
        rose.displayAvailableMedicines();
    }
}
