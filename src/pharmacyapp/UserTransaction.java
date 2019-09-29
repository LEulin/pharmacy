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
public interface UserTransaction {

    public void LoginAsCustomer(Account a);

    public void LoginAsPharmacist(Account a);

    public void Logout(Account a);

    public void Register(Account a);
    
    public void RegisterAsCustomer(Account a);
    
    public void RegisterAsPharmacist(Account a);
}
