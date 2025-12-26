/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author USER
 */
public class Item {
    private String itemName;
    private double quantites;
    private String exceptions;

    public Item(String itemName, double quantites, String exceptions) {
        this.itemName = itemName;
        this.quantites = quantites;
        this.exceptions = exceptions;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getQuantites() {
        return quantites;
    }

    public void setQuantites(double quantites) {
        this.quantites = quantites;
    }

    public String getExceptions() {
        return exceptions;
    }

    public void setExceptions(String exceptions) {
        this.exceptions = exceptions;
    }
    
    public String toString(){
    String s=quantites+" "+itemName+" "+exceptions;
    return s;
    }   
}
