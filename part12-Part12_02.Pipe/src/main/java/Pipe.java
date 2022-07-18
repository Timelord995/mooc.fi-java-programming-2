
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
public class Pipe<T> {
    private List<T> pipeElement;
    
    public Pipe(){
        this.pipeElement = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pipeElement.add(value);
    }
    
    public T takeFromPipe(){
        if (isInPipe()){
            T element = pipeElement.get(0);
            pipeElement.remove(element);
            return element;
        }
        return null;
    }
    
    public boolean isInPipe(){
        return !pipeElement.isEmpty();
    }
    
}
