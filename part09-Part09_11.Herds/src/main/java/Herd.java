
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
public class Herd implements Movable{
    private List<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public String toString(){
        String herd = "";
        
        for (Movable movable: this.herd){
            herd += movable.toString() + "\n";
        }
        return herd;
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    

    @Override
    public void move(int dx, int dy) {
        for (Movable movable: this.herd){
            movable.move(dx, dy);
        }
    }
    
    
}
