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
public class Recipe {
    private String title;
    private ArrayList<Ingredient> ingredients = new ArrayList();
    private Method method;

    public Recipe(String title, Method method, ArrayList<Ingredient> ingredients) {
        this.title = title;
        this.method = method;
        this.ingredients=ingredients;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }
    
    public String toString(){
    String s=title+"\n \n";
    for (int i=0; i<ingredients.size(); i++){
    s+=ingredients.get(i).toString()+"\n \n";
    }
    s+=method.toString();
    return s;
    }
    
}

