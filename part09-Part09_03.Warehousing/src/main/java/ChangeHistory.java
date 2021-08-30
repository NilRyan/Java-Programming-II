
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }
    
    public double maxValue() {
        if (history.size() == 0) {
            return 0;
        }
        
        Double max = Collections.max(history);
        return max;
    }
    
    public double minValue() {
        if (history.size() == 0) {
            return 0;
        }
        
        Double min = Collections.min(history);
        return min;
    }
    
    public double average() {
        Double total = 0.0;
        for (Double balance: history) {
            total += balance;
        }
        
        return total / history.size();
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
    
    
}
