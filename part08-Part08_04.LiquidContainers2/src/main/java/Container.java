/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class Container {
    private final int maxAmount;
    private int amount;

    public Container() {
        this.maxAmount = 100;
        this.amount = 0;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.amount += amount;
            if (this.amount > maxAmount) {
                this.amount = maxAmount;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.amount -= amount;
            
            if (this.amount < 0) {
                this.amount = 0;
            }
        }
    }

    public int contains() {
        return amount;
    }
    
    @Override
    public String toString() {
        return amount + "/" + maxAmount;
    }
    
    
}
