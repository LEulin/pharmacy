package pharmacyapp;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurentera_sd2022
 */
public class MedicineForCough extends Medicine{
    
    private List<MedicineForCough> medicineCough = new ArrayList<MedicineForCough>();    

    public MedicineForCough() {
    }

    public MedicineForCough(String brandName, String genericName, String type, int quantity) {
        super(brandName, genericName, type, quantity);
    }

    public MedicineForCough(String brandName, String genericName, int price, String type, String expirationDate, int quantity) {
        super(brandName, genericName, price, type, expirationDate, quantity);
    }
 
    
}
