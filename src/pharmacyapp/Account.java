/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2ndyrGroupB
 */
public class Account {

    List<Account> customer_list = new ArrayList<Account>();
    List<Account> pharmaList = new ArrayList<Account>();

    private String fname;
    private String lname;
    private String userName;
    private String passWord;
    private String address;
    private int pharLicensedNo;
    private int age;

    public Account() {
    }

    public Account(String fname, String lname, String userName, String passWord, String address, int age) {
        this.fname = fname;
        this.lname = lname;
        this.userName = userName;
        this.passWord = passWord;
        this.address = address;
        this.age = age;
    }

    public Account(String fname, String lname, String userName, String passWord, int pharLicensedNo, String address, int age) {
        this.fname = fname;
        this.lname = lname;
        this.userName = userName;
        this.passWord = passWord;
        this.pharLicensedNo = pharLicensedNo;
        this.address = address;
        this.age = age;
    }

    public List<Account> getCustomer_list() {
        return customer_list;
    }

    public void setCustomer_list(List<Account> customer_list) {
        this.customer_list = customer_list;
    }

    public List<Account> getPharmaList() {
        return pharmaList;
    }

    public void setPharmaList(List<Account> pharmaList) {
        this.pharmaList = pharmaList;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPharLicensedNo() {
        return pharLicensedNo;
    }

    public void setPharLicensedNo(int pharLicensedNo) {
        this.pharLicensedNo = pharLicensedNo;
    }

    public void displayAccountsOfCustomers(){
        System.out.println("\n\t\t\t\t\t\t--- REGISTERED CUSTOMERS ---");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.printf("  %-10s  | %-10s   |   %-10s   |   %-10s   |  %-10s   |  %10s ", "First name", "Last name", "Username", "Password", "Address", "Age\n");
        System.out.println("____________________________________________________________________________________________________________________");
        for (int i = 0; i < User.getCustomerList().size(); i++) {
            System.out.printf(" %-10s  |  %-10s  |  %-10s  |  %-10s   |  %-10s  | %10d\n", User.getCustomerList().get(i).getFname(), User.getCustomerList().get(i).getLname(), User.getCustomerList().get(i).getUserName(), User.getCustomerList().get(i).getPassWord(), User.getCustomerList().get(i).getAddress(), User.getCustomerList().get(i).getAge());
            System.out.println("____________________________________________________________________________________________________________________");
        }
    }
    
    public void displayAccountsOfPharmacist(){
        System.out.println("\n\t\t\t\t\t\t--- REGISTERED Pharmacist ---");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.printf("  %-10s  | %-10s   |   %-10s   |   %-10s   |  %-10s   |  %-10s   |  %10s ", "First name", "Last name", "Username", "Password", "Licensed No" ,"Address", "Age\n");
        System.out.println("____________________________________________________________________________________________________________________");
        for (int i = 0; i < User.getPharmaList().size(); i++) {
            System.out.printf(" %-10s  |  %-10s  |  %-10s  |  %-10s   |  %-10d   |  %-10s  | %10d\n", User.getPharmaList().get(i).getFname(), User.getPharmaList().get(i).getLname(), User.getPharmaList().get(i).getUserName(), User.getPharmaList().get(i).getPassWord(),User.getPharmaList().get(i).getPharLicensedNo(), User.getPharmaList().get(i).getAddress(), User.getPharmaList().get(i).getAge());
            System.out.println("____________________________________________________________________________________________________________________");
        }
    }
    
    @Override
    public String toString() {
        this.displayAccountsOfCustomers();
        return " ";
    }

}
