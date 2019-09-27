/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

/**
 *
 * @author 2ndyrGroupB
 */
public class SeniorCitizen extends Customer{

    public SeniorCitizen() {
    }

//    public SeniorCitizen(Name name, int age) {
//        super(name, age);
//    }
//
//    public SeniorCitizen(Name name, int money, int age) {
//        super(name, money, age);
//    }

   @Override
    public void viewAvailableMedicines(Pharmacy p){
        
    }

    @Override
    public boolean purchaseMedicines( Medicine m) {
        return true;
    }

    @Override
    public void viewPurchasedMedicines(Medicine m) {
        
    }

    @Override
    public void availDiscount(Medicine m) {
        
    }

    @Override
    public void Login(Account a) {
        
    }

    @Override
    public void Logout() {
        
    }

    @Override
    public void Register(Account a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void choices(Pharmacy p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
