
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
public class Box implements Packable{
    private List<Packable> boxItems;
    private double maxWeight;
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.boxItems = new ArrayList<>();
    }
    
    public void add(Packable item){
        if (maxWeight >= item.weight() + this.weight()){
            boxItems.add(item);
        }
    }
    
    @Override
    public String toString(){
        return "Box: " + boxItems.size() + " items, total weight " + weight() + " kg";
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable packable: this.boxItems){
            totalWeight += packable.weight();
        }
        return totalWeight;
    }
    
    
    
}
