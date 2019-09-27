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
public interface Transaction {
    
    public void viewAvailableMedicines(Pharmacy p);
    public boolean purchaseMedicines(Medicine m);
    public void viewPurchasedMedicines(Medicine m);
    public void choices(Pharmacy p);
    public void availDiscount(Medicine m);
    public void Register(Account a);
    public void Login(Account a);
    public void Logout();
}
