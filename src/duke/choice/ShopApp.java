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

        System.out.println("Welcome to Duke Choice Shop ");

        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");
        c1.setSize(3);
        System.out.println(c1.getSize());

        System.out.println("Customer is " + c1.getName());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();
        Clothing[] items = {item1, item2, item3, item4};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        item3.setDescription("Green scarf");
        item3.setPrice(5);
        item3.setSize("S");

        item4.setDescription("Blue T-Shirt");
        item4.setPrice(10.5);
        item4.setSize("S");
        
        c1.addItems(items);
        System.out.println(c1.getTotalClothingCost());
        for (Clothing item : items) {
            System.out.println(item.getDescription() + ", " + item.getSize() + ", " + item.getPrice());
        }

    }

}
