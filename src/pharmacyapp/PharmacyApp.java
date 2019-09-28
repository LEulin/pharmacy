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
        //Medicines for headache -- OBJECTS --
        MedicineForHeadache biogesic = new MedicineForHeadache(0, "Biogesic", "Paracetamol", 5, "Tablet", "January 20 ,2020", 50);
        MedicineForHeadache bioflu = new MedicineForHeadache(0, "Bioflu", "Paracetamol", 6, "Tablet", "August 5 ,2021", 50);
        MedicineForHeadache acetaminophen = new MedicineForHeadache(0, "Acetaminophen", "Thylenol", 15, "Tablet", "June 2 ,2020", 50);
        MedicineForHeadache ibuprofen = new MedicineForHeadache(0, "Ibuprofen", "Advil", 10, "Capsule", "July 7 ,2021", 50);

        //Medicines for cough -- OBJECTS --
        MedicineForCough sulbotamol = new MedicineForCough(0, "Sulbotamol", "Carbociestine", 55, "Syrup", "March 1 ,2022", 50);
        MedicineForCough ambroxol = new MedicineForCough(0, "Ambroxol", "Omoconazole", 16, "Tablet", "September 14 ,2020", 50);
        MedicineForCough lagundi = new MedicineForCough(0, "Lagundi", "Flemex", 75, "Syrup", "April 10 ,2022", 50);
        MedicineForCough tuseran = new MedicineForCough(0, "Tuseran", "Forte", 16, "Capsule", "November 12 ,2020", 50);

        //Medicines for body pain -- OBJECTS --
        MedicineForBodyPain alaxan = new MedicineForBodyPain(0, "Alaxan Fr", "Paracetamol", 6, "Capsule", "March 12 ,2022", 50);
        MedicineForBodyPain mefenamic = new MedicineForBodyPain(0, "Mefenamic", "Dolpenal", 16, "Capsule", "September 5 ,2020", 50);
        MedicineForBodyPain amoxicilin = new MedicineForBodyPain(0, "Amoxicilin", "Flemex", 75, "Syrup", "April 10 ,2022", 50);
        MedicineForBodyPain salonpas = new MedicineForBodyPain(0, "Salonpas", "Forte", 16, "Capsule", "November 12 ,2020", 50);

        //Medicines for allergies -- OBJECTS --
        MedicineForAllergies haplas = new MedicineForAllergies(0, "Haplas", "Paracetamol", 6, "Capsule", "March 12 ,2022", 50);
        MedicineForAllergies vicks = new MedicineForAllergies(0, "Vicks", "Dolpenal", 16, "Capsule", "September 5 ,2020", 50);
        MedicineForAllergies pau = new MedicineForAllergies(0, "Pau de Arco", "Flemex", 75, "Syrup", "April 10 ,2022", 50);
        MedicineForAllergies omega = new MedicineForAllergies(0, "Omega Plus", "Forte", 16, "Capsule", "November 12 ,2020", 50);

        Adult mark = new Adult(500);
        Account a = new Account();
        Pharmacist p = new Pharmacist();

        // --PHARMACIST SIDE--
        // Add medicine for cough
//        p.addMedicineForCough(sulbotamol);
//        p.addMedicineForCough(ambroxol);
//        p.addMedicineForCough(tuseran);
//        p.addMedicineForCough(lagundi);
////      Add medicine for headache
//        p.addMedicineForHeadache(acetaminophen);
//        p.addMedicineForHeadache(ibuprofen);
//        p.addMedicineForHeadache(bioflu);
//        p.addMedicineForHeadache(biogesic);
//        // Add medicine for body pain
//        p.addMedicineForBodyPain(alaxan);
//        p.addMedicineForBodyPain(mefenamic);
//        p.addMedicineForBodyPain(amoxicilin);
//        p.addMedicineForBodyPain(salonpas);
//        // Add medicine for allergies
//        p.addMedicineForAllergies(haplas);
//        p.addMedicineForAllergies(pau);
//        p.addMedicineForAllergies(vicks);
//        p.addMedicineForAllergies(omega);
//        // Pharmacy Side
        p.choices();
        mark.choices();
        rose.displayAllAvailableMedicinesForCough(p);
        // user side
//        mark.Register(a);
//        mark.Login(a);
        mark.purchaseMedicines();
        rose.displayAllAvailableMedicinesForCough(p);
//        mark.viewAvailableMedicines(rose);
        mark.viewPurchasedMedicines();

    }
}
