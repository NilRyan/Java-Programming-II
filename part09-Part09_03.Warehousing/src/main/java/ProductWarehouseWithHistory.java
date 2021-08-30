/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history = new ChangeHistory();
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName,capacity);
        super.addToWarehouse(initialBalance);
        history.add(initialBalance);
    }
    
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        
        history.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        history.add(super.getBalance() - amount);
        return super.takeFromWarehouse(amount);
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName() +
                "\nHistory: " + history() + 
                "\nLargest amount of product: " + history.maxValue() +
                "\nSmallest amount of product: " + history.minValue() +
                "\nAverage: " + history.average());
    }
    
    public String history() {
        return this.history.toString();
    }
    
}
