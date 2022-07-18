
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
public class Abbreviations {
    private HashMap<String, String> abbrevations;
    
    public Abbreviations(){
        this.abbrevations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.abbrevations.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return (this.abbrevations.containsKey(abbreviation));
    }
    
    public String findExplanationFor(String abbreviation){
        return this.abbrevations.get(abbreviation);
    }
}
