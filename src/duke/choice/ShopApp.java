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
        Customer c1 = new Customer();
        c1.name = "Pinky";
        System.out.println("Welcome to Duke Choice Shop " + c1.name);
        
        String um = "Hello", dois = "World";
        String messa = um.concat(dois);
        System.out.println(messa);
    }
    
}
