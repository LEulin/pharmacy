/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

import java.util.List;

/**
 *
 * @author laurentera_sd2022
 */
public interface Pharmacist {
    
//    public List<Medicine> displayMedicines();
    public void inventory(Medicine m);
    public boolean addMedicine(Medicine m);
    public boolean removeMedicine(Medicine m);
    public void displayAvailableMedicines();
}
