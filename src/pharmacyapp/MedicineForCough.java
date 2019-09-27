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

    public MedicineForCough(int id, String brandName, String genericName, int price, String expirationDate, String type, int quantity) {
        super(id, brandName, genericName, price, expirationDate, type, quantity);
    }
    
    
    
}
