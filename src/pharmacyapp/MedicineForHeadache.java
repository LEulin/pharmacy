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
public class MedicineForHeadache extends Medicine{
    
    private List<MedicineForHeadache> medicineHeadache = new ArrayList<MedicineForHeadache>();    

    public MedicineForHeadache() {
    }

    public MedicineForHeadache(String brandName, String genericName, String type, int quantity) {
        super(brandName, genericName, type, quantity);
    }

    public MedicineForHeadache(String brandName, String genericName, int price, String type, String expirationDate,int quantity) {
        super(brandName, genericName, price, type, expirationDate, quantity);
    }
    
}
