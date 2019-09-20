/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

/**
 *
 * @author laurentera_sd2022
 */
public interface Transaction extends SeniorCitizenDiscount {
    
    public void viewAvailableMedicines(Pharmacy p);
    public void purchaseMedicines(Medicine m);
    public void viewPurchasedMedicines(Medicine m);
    public void Login();
    public void Logout();
}
