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
public class Adult extends Customer{

    public Adult() {
    }

    public Adult(Name name, int age) {
        super(name, age);
    }

    public Adult(Name name, int money, int age) {
        super(name, money, age);
    }
    
    @Override
    public void viewAvailableMedicines(Pharmacy p){
        
    }

    @Override
    public void purchaseMedicines(Medicine m) {
        
    }

    @Override
    public void viewPurchasedMedicines(Medicine m) {
    
    }
  
    @Override
    public void availDiscount(Medicine m) {
        throw new UnsupportedOperationException("This functionality has not been implemented yet.");     
    }

    @Override
    public void Login() {
        
    }

    @Override
    public void Logout() {
        
    }
}
