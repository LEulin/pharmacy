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
public interface CustomerOperation {

    public void viewAvailableMedicines(Pharmacy p);

    public boolean purchaseMedicines();

    public boolean purchaseMedicineForCough(int id);

    public boolean purchaseMedicineForHeadache(int id);

    public boolean purchaseMedicineForBodyPain(int id);

    public boolean purchaseMedicineForAllergies(int id);

    public void viewPurchasedMedicines();

    public void choices(Account a);

    public void availDiscount(Medicine m);

    public void LoginAsAdult(Account a);

    public void LoginAsSeniorCitizen(Account a);
}
