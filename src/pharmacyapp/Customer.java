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
public abstract class Customer implements Transaction {
    private Account account;
    private Name name;
    private int money;
    private int age;

    public Customer() {
    }

    public Customer(Account account) {
        this.account = account;
    }

    public Customer(Name name, int age) {
        this.name = name;
        this.age = age;
    }

    public Customer(Name name, int money, int age) {
        this.name = name;
        this.money = money;
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
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
        return "Customer{" + "name=" + name + ", money=" + money + ", age=" + age + '}';
    }

    

  
}
