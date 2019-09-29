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
public class Pharmacy {

    private String name;

    
    public Pharmacy() {
        
    }

    public Pharmacy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void displayAllAvailableMedicinesForCough(Pharmacist p){
        p.displayAvailableMedicinesForCough();
    }
    
    public void displayAllAvailableMedicinesForHeadache(Pharmacist p){
        p.displayAvailableMedicinesForHeadache();
    }
    
    public void displayAllAvailableMedicinesForBodyPain(Pharmacist p){
        p.displayAvailableMedicinesForBodyPain();
    }
    
    public void displayAllAvailableMedicinesForAllergies(Pharmacist p){
        p.displayAvailableMedicinesForAllergies();
    }    
}
