
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class BoxWithMaxWeight extends Box {
    private final int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
      if (item.getWeight() + totalWeight(items) <= maxWeight) {
          this.items.add(item);
      }
    }
    
    public int totalWeight(ArrayList<Item> items) {
        int totalWeight = 0;
        
        for (Item item: items) {
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
