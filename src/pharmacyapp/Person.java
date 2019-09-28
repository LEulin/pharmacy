/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2ndyrGroupB
 */
public abstract class Person {

    private static List<MedicineForCough> medicineForCough = new ArrayList<MedicineForCough>();
    private static List<MedicineForHeadache> medicineForHeadache = new ArrayList<MedicineForHeadache>();
    private static List<MedicineForBodyPain> medicineForBodyPain = new ArrayList<MedicineForBodyPain>();
    private static List<MedicineForAllergies> medicineForAllergies = new ArrayList<MedicineForAllergies>();

    public Person() {
    }

    public static List<MedicineForCough> getMedicineForCough() {
        return medicineForCough;
    }

    public static void setMedicineForCough(List<MedicineForCough> medicineForCough) {
        Person.medicineForCough = medicineForCough;
    }

    public static List<MedicineForHeadache> getMedicineForHeadache() {
        return medicineForHeadache;
    }

    public static void setMedicineForHeadache(List<MedicineForHeadache> medicineForHeadache) {
        Person.medicineForHeadache = medicineForHeadache;
    }

    public static List<MedicineForBodyPain> getMedicineForBodyPain() {
        return medicineForBodyPain;
    }

    public static void setMedicineForBodyPain(List<MedicineForBodyPain> medicineForBodyPain) {
        Person.medicineForBodyPain = medicineForBodyPain;
    }

    public static List<MedicineForAllergies> getMedicineForAllergies() {
        return medicineForAllergies;
    }

    public static void setMedicineForAllergies(List<MedicineForAllergies> medicineForAllergies) {
        Person.medicineForAllergies = medicineForAllergies;
    }
    
    
}
