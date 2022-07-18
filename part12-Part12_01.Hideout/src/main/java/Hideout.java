
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
public class Hideout<T> {
    private T element;
    
    public void putIntoHideout(T toHide){
        if (element != null){
            element = null;
        }
        element = toHide;
    }
    
    public T takeFromHideout(){
        if (isInHideout()){
            T result = element;
            element = null;
            return result;
        }
        return element;
    }
    
    public boolean isInHideout(){
        return element != null;
    }
    
}
