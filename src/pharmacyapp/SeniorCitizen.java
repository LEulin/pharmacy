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

    public SeniorCitizen(Name name, int age) {
        super(name, age);
    }

    public SeniorCitizen(Name name, int money, int age) {
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
        
    }

    @Override
    public void Login() {
        
    }

    @Override
    public void Logout() {
        
    }
    
}
