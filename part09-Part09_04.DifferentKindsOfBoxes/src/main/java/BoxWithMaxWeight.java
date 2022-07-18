
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class BoxWithMaxWeight extends Box{
    
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        int sum = 0;
        for (Item temp: this.items){
            sum += temp.getWeight();
        }
        
        if (sum + item.getWeight() > capacity){
            return;
        }
        this.items.add(item);
        
    }
    
   
    @Override
    public boolean isInBox(Item item) {
        if (this.items.contains(item)){
            return true;
        }
        return false;
    }
    
}
