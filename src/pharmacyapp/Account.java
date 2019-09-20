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
public class Account {
    
    private String fname;
    private String lname;
    private String userName;
    private String passWord;
    private int age;

    public Account() {
    }
    
    public Account(String fname, String lname, String userName, String passWord, int age) {
        this.fname = fname;
        this.lname = lname;
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
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

    @Override
    public String toString() {
        return "Account{" + "fname=" + fname + ", lname=" + lname + ", userName=" + userName + ", passWord=" + passWord + ", age=" + age + '}';
    }  
    
}
