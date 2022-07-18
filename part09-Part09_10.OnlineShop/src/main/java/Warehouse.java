
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;
    
    public Warehouse(){
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        return this.prices.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return this.stock.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if (!this.stock.containsKey(product)){
            return false;
        }
        
        if (this.stock.get(product) == 0){
            return false;
        }
        this.stock.put(product, this.stock.get(product) - 1);
        
        if (this.stock.get(product) == 0){
            return false;
        }
        return true;
    }
    
    public Set<String> products(){
        return this.prices.keySet();
    }
}
