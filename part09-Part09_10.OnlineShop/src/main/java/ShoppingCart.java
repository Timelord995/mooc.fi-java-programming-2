
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class ShoppingCart {
    private List<Item> items;
    
    public ShoppingCart(){
        this.items = new ArrayList<>();
    }
    
    public void add(String product, int price){
        Item item = new Item(product, 1, price);
        
        for (Item temp: this.items){
            if (item.equals(temp)){
                temp.increaseQuantity();
                return;
            }
        }
        
        this.items.add(item);
    
    }
    
    public int price(){
        int totalPrice = 0;
        for (Item item: this.items){
            totalPrice += item.price();
        }
        return totalPrice;
    }
    
    public void print(){
        for (Item item: this.items){
            System.out.println(item);
        }
    }
    
    
    
}
