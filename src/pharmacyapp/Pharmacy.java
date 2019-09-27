/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class Pharmacy implements Pharmacist {

    Scanner user_input = new Scanner(System.in);

    private String name;

    private List<Medicine> medicineForCough = new ArrayList<Medicine>();
    private List<Medicine> medicineForHeadache = new ArrayList<Medicine>();
    private List<Medicine> medicineForBodyPain = new ArrayList<Medicine>();
    private List<Medicine> medicineForAllergy = new ArrayList<Medicine>();

    public Pharmacy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pharmacy(String name) {
        this.name = name;
    }

    public List<Medicine> getMedicineForCough() {
        return medicineForCough;
    }

    public void setMedicineForCough(List<Medicine> medicineForCough) {
        this.medicineForCough = medicineForCough;
    }

    public List<Medicine> getMedicineForHeadache() {
        return medicineForHeadache;
    }

    public void setMedicineForHeadache(List<Medicine> medicineForHeadache) {
        this.medicineForHeadache = medicineForHeadache;
    }

    public List<Medicine> getMedicineForBodyPain() {
        return medicineForBodyPain;
    }

    public void setMedicineForBodyPain(List<Medicine> medicineForBodyPain) {
        this.medicineForBodyPain = medicineForBodyPain;
    }

    public List<Medicine> getMedicineForAllergy() {
        return medicineForAllergy;
    }

    public void setMedicineForAllergy(List<Medicine> medicineForAllergy) {
        this.medicineForAllergy = medicineForAllergy;
    }

    @Override
    public boolean addMedicine(Medicine m) {
        System.out.print("In what list of medicines you want to add " + m.getBrandName() + "? \n1.Cough\n2.Headache\n3.BodyPain\n4.Allergy\n- ");
        String add_med = user_input.nextLine();
        int i = 1;
        switch (add_med) {
            case "1":
                if (medicineForCough.isEmpty()) {
                    m.setId(i);
                } else {
                    m.setId(i + 1);
                }
                medicineForCough.add(m);
                break;
            case "2":
                m.setId(1);
                medicineForHeadache.add(m);
                break;
            case "3":
                medicineForBodyPain.add(m);
                break;
            case "4":
                medicineForAllergy.add(m);
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public boolean removeMedicine(Medicine m) {
        System.out.print("\nAre you sure you want to remove " + m.getBrandName() + "? Yes/No: ");
        String remove_med = user_input.nextLine();
        if (remove_med.equals("Yes")) {
            System.out.print("From which list of medicine you want to remove this? \n1.Cough\n2.Headache\n3.BodyPain\n4.Allergy\n- ");
            remove_med = user_input.nextLine();
            switch (remove_med) {
                case "1":
                    medicineForCough.remove(m);
                    System.out.println(m + " was removed.");
                    break;
                case "2":
                    medicineForHeadache.remove(m);
                    System.out.println(m + " was removed.");
                    break;
                case "3":
                    medicineForBodyPain.remove(m);
                    System.out.println(m + " was removed.");
                    break;
                case "4":
                    medicineForAllergy.remove(m);
                    System.out.println(m + " was removed.");
                    break;
                default:
                    break;
            }
        }
        return true;
    }

    @Override
    public void inventory(Medicine m) {
        m.displayInventory();
    }

    @Override
    public void displayAvailableMedicines() {
        System.out.print("What list of medicines you want to view? \n1.Cough\n2.Headache\n3.BodyPain\n4.Allergy\n- ");
        String display_med = user_input.nextLine();
        switch (display_med) {
            case "1":
                System.out.println("\nMEDICINES FOR COUGH");
                System.out.println("____________________________________________________________________________________________________________________");
                System.out.printf("  %-12s  |  %-11s   |  %-6s  | %-8s  |  %-9s   |  %10s  |  %12s", "Medicine ID", "Brand Name", "Generic Name", "Price", "Type", "Expiration Date", "Quantity\n");
                System.out.println("____________________________________________________________________________________________________________________");
                for (int i = 0; i < medicineForCough.size(); i++) {
                    System.out.printf("  %-12s  | %-14s | %-14s | %-8d  | %-12s | %-15s | %10d\n", medicineForCough.get(i).getId(), medicineForCough.get(i).getBrandName(), medicineForCough.get(i).getGenericName(), medicineForCough.get(i).getPrice(), medicineForCough.get(i).getType(), medicineForCough.get(i).getExpirationDate(), medicineForCough.get(i).getQuantity());
                    System.out.println("____________________________________________________________________________________________________________________");
                }
                break;
            case "2":
                System.out.println("\nMEDICINES FOR HEADACHE");
                System.out.println("____________________________________________________________________________________________________________________");
                System.out.printf("  %-12s  |  %-11s   |   %-6s   |   %-8s   |  %-9s   |  %10s |  %12s", "Medicine ID", "Brand Name", "Generic Name", "Price", "Type", "Expiration Date", "Quantity\n");
                System.out.println("____________________________________________________________________________________________________________________");
                for (int i = 0; i < medicineForHeadache.size(); i++) {
                    System.out.printf(" %-12s  | %-14s | %-14s | %-8d  | %-12s | %-15s | %10d\n", medicineForHeadache.get(i).getId(), medicineForHeadache.get(i).getBrandName(), medicineForHeadache.get(i).getGenericName(), medicineForHeadache.get(i).getPrice(), medicineForHeadache.get(i).getType(), medicineForHeadache.get(i).getExpirationDate(), medicineForHeadache.get(i).getQuantity());
                    System.out.println("____________________________________________________________________________________________________________________");
                }
                break;
            case "3":
                System.out.println("\nMEDICINES FOR BODY PAIN");
                System.out.println("____________________________________________________________________________________________________________________");
                System.out.printf(" %-12s  |  %-11s   |   %-6s  |   %-8s  |  %-9s   |  %10s |  %12s", "Medicine ID", "Brand Name", "Generic Name", "Price", "Type", "Expiration Date", "Quantity\n");
                System.out.println("____________________________________________________________________________________________________________________");
                for (int i = 0; i < medicineForBodyPain.size(); i++) {
                    System.out.printf(" %-12s   |  %-14s  |  %-14s  |  %-8d  |  %-12s  |  %-15s  | %10d\n", medicineForBodyPain.get(i).getId(), medicineForBodyPain.get(i).getBrandName(), medicineForBodyPain.get(i).getGenericName(), medicineForBodyPain.get(i).getPrice(), medicineForBodyPain.get(i).getType(), medicineForBodyPain.get(i).getExpirationDate(), medicineForBodyPain.get(i).getQuantity());
                    System.out.println("____________________________________________________________________________________________________________________");
                }
                break;
            case "4":
                System.out.println("\nMEDICINES FOR ALLERGY");
                System.out.println("____________________________________________________________________________________________________________________");
                System.out.printf("  %-12s  | %-11s   |   %-6s   |   %-8s   |  %-9s   |  %10s |  %12s", "Medicine ID", "Brand Name", "Generic Name", "Price", "Type", "Expiration Date", "Quantity\n");
                System.out.println("____________________________________________________________________________________________________________________");
                for (int i = 0; i < medicineForAllergy.size(); i++) {
                    System.out.printf(" %-12s  | %-14s | %-14s | %-8d  | %-12s | %-15s | %10d\n", medicineForAllergy.get(i).getId(), medicineForAllergy.get(i).getBrandName(), medicineForAllergy.get(i).getGenericName(), medicineForAllergy.get(i).getPrice(), medicineForAllergy.get(i).getType(), medicineForAllergy.get(i).getExpirationDate(), medicineForAllergy.get(i).getQuantity());
                    System.out.println("____________________________________________________________________________________________________________________");
                }
                break;
            default:
                break;
        }
    }
}
