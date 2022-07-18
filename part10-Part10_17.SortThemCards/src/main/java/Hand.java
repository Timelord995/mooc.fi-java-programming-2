
import java.util.ArrayList;
import java.util.Collections;
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
public class Hand implements Comparable<Hand>{
    private List<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        this.cards.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort(){
        Collections.sort(this.cards);
    }
    
    private int getHandValue(){
        int value = 0;
        
        for (Card card : cards){
            value += card.getValue();
        }
        return value;
    }
    
    public int compareTo(Hand hand){
        return this.getHandValue() - hand.getHandValue();
    }
    
    public void sortBySuit(){
        BySuitInValueOrder sort = new BySuitInValueOrder();
        Collections.sort(cards, sort);
    }
}
