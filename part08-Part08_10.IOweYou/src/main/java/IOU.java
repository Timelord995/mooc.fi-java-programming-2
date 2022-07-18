
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
public class IOU {
    private HashMap<String, Double> iou;
    
    public IOU(){
        this.iou = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
       double currentAmount = howMuchDoIOweTo(toWhom);
       currentAmount += amount;
       iou.put(toWhom, currentAmount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.iou.getOrDefault(toWhom, 0.0);
    }
    
}
