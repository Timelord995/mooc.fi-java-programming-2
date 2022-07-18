/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class Book {
    private String name;
    private int recommAge;
    
    public Book(String name, int recommAge){
        this.name = name;
        this.recommAge = recommAge;
    }
    
    public int getAgeRecommended(){
        return recommAge;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return name + " (recommmended for " + recommAge + " years-old or older)";
    }
    
}
