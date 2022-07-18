/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class Container {
    private int value;
    
    public Container(){
        this.value = value;
    }
    
    public int contains(){
        return this.value;
    }
    
    public void add(int amount){
        if (amount < 0){
            return;
        }
        
        this.value += amount;
        
        if (value > 100){
            this.value = 100;
        }
    }
    
    public void remove(int amount){
        if (amount < 0){
            return;
        }
        
        this.value -= amount;
        
        if (value < 0){
            this.value = 0;
        }
    }
    
    public String toString(){
        return value + "/100";
    }
}
