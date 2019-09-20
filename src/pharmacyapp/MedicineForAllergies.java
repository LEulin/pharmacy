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
 * @author laurentera_sd2022
 */
public class MedicineForAllergies extends Medicine{

    private List<MedicineForAllergies> medicineAllergies = new ArrayList<MedicineForAllergies>();

    public MedicineForAllergies() {
    }

    public MedicineForAllergies(String brandName, String genericName, String type, int quantity) {
        super(brandName, genericName, type, quantity);
    }

    public MedicineForAllergies(String brandName, String genericName, int price, String type, String expirationDate,int quantity) {
        super(brandName, genericName, price, type, expirationDate, quantity);
    }
    
    
}
