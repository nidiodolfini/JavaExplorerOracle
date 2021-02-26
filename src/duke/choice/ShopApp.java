/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author nidio
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double tax = 0.2;
        double total = 0;
        Customer c1 = new Customer();
        c1.name = "Pinky";
        System.out.println("Welcome to Duke Choice Shop " + c1.name);
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";
        
        
        System.out.println("Item one in: " + item1.description + " Price is " + item1.price + " and Size is " + item1.size);
        System.out.println("Item two in: " + item2.description + " Price is " + item2.price + " and Size is " + item2.size);
        total = (item1.price + (item2.price * 2));
        Double totalTax = total * tax;
        System.out.println(total + totalTax);

        
    }
    
}
