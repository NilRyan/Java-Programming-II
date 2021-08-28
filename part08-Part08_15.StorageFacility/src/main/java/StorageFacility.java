
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    public void add(String unit, String item ) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (this.storage.get(storageUnit) == null) {
            return new ArrayList<>();
        }
        return this.storage.get(storageUnit);
    }
    
    public void remove(String storageUnit,String item) {
        if (this.storage.get(storageUnit) != null) {
            int index = this.storage.get(storageUnit).indexOf(item);
            this.storage.get(storageUnit).remove(index);
            
            if (this.storage.get(storageUnit).size() == 0) {
                this.storage.remove(storageUnit);
            }
         }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> listOfKeys = new ArrayList<String>(this.storage.keySet());

        return listOfKeys;
    }
    
}
