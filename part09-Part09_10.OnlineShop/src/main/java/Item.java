
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return this.unitPrice * this.qty;
    }
    
    public void increaseQuantity(){
        this.qty++;
    }
    
    public String toString(){
        return this.product + ": " + this.qty;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        
        Item item = (Item) o;
        return unitPrice == item.unitPrice && Objects.equals(product, item.product);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(product, unitPrice);
    }
}
