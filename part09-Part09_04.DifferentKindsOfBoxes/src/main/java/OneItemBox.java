/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class OneItemBox extends Box{
    private Item itemInTheBox;
    
    public OneItemBox(){
        this.itemInTheBox = null;
    }

    @Override
    public void add(Item item) {
        if (itemInTheBox == null){
            itemInTheBox = item;        }
    }

    @Override
    public boolean isInBox(Item item) {
        return item.equals(itemInTheBox);
    }
    
}
