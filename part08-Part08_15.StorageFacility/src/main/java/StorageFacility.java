
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility(){
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        
        ArrayList<String> items = this.storage.get(unit);
        items.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        this.storage.get(storageUnit).remove(item);
        if (this.storage.get(storageUnit) == null){
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for (String storage: this.storage.keySet()){
            if (!this.storage.get(storage).isEmpty()){
                units.add(storage);
            }
        }
        return units;
    }
}
