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
public class MedicineForBodyPain extends Medicine{

    private List<MedicineForBodyPain> medicineBodyPain = new ArrayList<MedicineForBodyPain>();
     
    public MedicineForBodyPain() {
    }
    
    public MedicineForBodyPain(int id, String brandName, String genericName, int price, String expirationDate, String type, int quantity) {
        super(id, brandName, genericName, price, expirationDate, type, quantity);
    }
    
   

}
