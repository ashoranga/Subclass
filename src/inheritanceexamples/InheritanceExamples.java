/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexamples;

/**
 *
 * @author MERC-LAB-01
 */
public class InheritanceExamples {

    /**
     * @param args the command line arguments
     */
    public static void printDetails(Item item){
        System.out.println(item.name + " cost is " + item.value + " rupees.");
    }
    
    public static void main(String[] args) {
        Item i1 = new Item();
        i1.name = "item1";
        i1.code = "1";
        i1.value = 150.00;

        Investigation ix1 = new Investigation();
        ix1.name = "FBC";
        ix1.code = "2";
        ix1.value = 250.00;
        ix1.reportFormat = "Test    Value    reference";

        System.out.println(ix1.name + " cost is " + ix1.value + " rupees");
        System.out.println("The report format of " + ix1.value + " is " + ix1.reportFormat);
        printDetails(ix1);
        
        

        Medicine med1 = new Medicine();
        med1.name = "Paraceramol";
        med1.code = "001";
        med1.dose = 500;
        med1.dossageForm = "tablet";
        med1.value = 1.25;

        System.out.println(med1.name + med1.dose + "mg" + med1.dossageForm + "cost" + med1.value + "rupees");
        printDetails(med1);

// TODO code application logic here
    }

}
