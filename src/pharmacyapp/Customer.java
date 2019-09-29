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
public abstract class Customer extends User implements CustomerOperation {
    
    private Account account;
    private int money;
    private int age;

    public Customer() {
    }

    public Customer(int money) {
        this.money = money;
    }

    public Customer(Account account, int age) {
        this.account = account;
        this.age = age;
    }

    public Customer(Account account, int money, int age) {
        this.account = account;
        this.money = money;
        this.age = age;
    }
    
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" + "account=" + account + ", money=" + money + ", age=" + age + '}';
    }
    
    
 
    

  
}
