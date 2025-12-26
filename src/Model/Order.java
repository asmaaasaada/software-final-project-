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
public class Order {
    private static int orderNb;
    private ArrayList<Item> items=new ArrayList();

    public Order(int orderNb, ArrayList<Item> items) {
        this.items=items;
        this.orderNb=orderNb;
    }

    public static int getOrderNb() {
        return orderNb;
    }

    public static void setOrderNb(int orderNb) {
        Order.orderNb = orderNb;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    public String toString(){
    String s="Order "+orderNb+": ";
    for (int i=0; i<items.size(); i++){
    s+=items.get(i).toString();
    }
    return s;
    }    
}
