/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private final ChangeHistory priceHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.priceHistory = new ChangeHistory();
        this.priceHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);
        
    }
    
    public String history(){
        return priceHistory.toString();
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.priceHistory.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
        double temp = super.takeFromWarehouse(amount);
        this.priceHistory.add(super.getBalance());
        return temp;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.priceHistory);
        System.out.println("Largest amount of product: " + this.priceHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.priceHistory.minValue());
        System.out.println("Average: " + this.priceHistory.average());
    }
}
