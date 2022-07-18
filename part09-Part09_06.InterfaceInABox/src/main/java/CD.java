/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class CD implements Packable{
    
    private String artist;
    private String nameCD;
    private int publicationYear;
    
    public CD(String artist, String nameCD, int publicationYear){
        this.artist = artist;
        this.nameCD = nameCD;
        this.publicationYear = publicationYear;
    }
    
    @Override
    public String toString(){
        return artist +": " + nameCD + " (" + publicationYear +")";
    }

    @Override
    public double weight() {
        return 0.1;
    }
    
}
