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
public class Customer {
    
    private String name;
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void setSize(int size){
        if(size >= 3){
            this.size = "S";
        }else if(size >= 6){
            this.size = "M";
        }else if (size >= 9){
            this.size = "L";
        }else{
            this.size = "X";
        }
    }
    
}
