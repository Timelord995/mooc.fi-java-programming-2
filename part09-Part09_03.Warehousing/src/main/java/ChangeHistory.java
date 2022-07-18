
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
public class ChangeHistory {
    private final ArrayList<Double> priceHistory;
    
    public ChangeHistory(){
        this.priceHistory = new ArrayList<>();
    }
    
    public void add(double status){
        priceHistory.add(status);
    }
    
    public void clear(){
        priceHistory.clear();
    }
    
    public double maxValue(){
        if (isEmpty()){
            return 0;
        }
        
        double largest = this.priceHistory.get(0);
        for (double number: this.priceHistory){
            if (largest < number){
                largest = number;
            }
        }
        return largest;
    }
    
    public double minValue(){
        if (isEmpty()){
            return 0;
        }
        
        double smallest = this.priceHistory.get(0);
        for (double number: this.priceHistory){
            if (smallest > number){
                smallest = number;
            }
        }
        return smallest;
        
    }
    
    public double average(){
        if (isEmpty()){
            return 0;
        }
        
        double sum = 0;
        for (double number: this.priceHistory){
            sum += number;
        }
        
        return sum/this.priceHistory.size();
    }
    
    private boolean isEmpty(){
        if (this.priceHistory.size() == 0){
            return true;
        }
        return false;
    }
    
    
    @Override
    public String toString(){
        return priceHistory.toString();
    }
}
