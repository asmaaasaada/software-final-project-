/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Method {
    private ArrayList<String> steps= new ArrayList();

    public Method(ArrayList<String> steps) {
        this.steps=steps;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }
    public String toString(){
       String s="";
       for (int i=0; i<steps.size(); i++){
          s+=steps.get(i)+"\n";
       }
       return s;    
    }
    
    
}
