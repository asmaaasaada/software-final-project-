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
public class Ingredient {
    private String name;
    private String unit;
    private double amount;

    public Ingredient(String name, String unit, double amount) {
        this.name = name;
        this.unit = unit;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmouont(double amount) {
        this.amount = amount;
    }
    
    public String toString(){
    String s=amount+" "+unit+" "+name;
    return s;
    }
}
