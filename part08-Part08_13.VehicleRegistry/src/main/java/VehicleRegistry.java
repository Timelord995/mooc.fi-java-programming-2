
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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> reg;
    
    public VehicleRegistry(){
        this.reg = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (reg.get(licensePlate) == null){
            reg.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        return this.reg.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if (reg.containsKey(licensePlate)){
            reg.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for (LicensePlate licensePlate: reg.keySet()){
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> uniqueNames = new ArrayList<>();
        for (String name: reg.values()){
            if (!uniqueNames.contains(name)){
                uniqueNames.add(name);
                System.out.println(name);
            }
        }
    }
}
