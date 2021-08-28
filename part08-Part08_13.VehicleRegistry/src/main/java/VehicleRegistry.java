
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicles;

    public VehicleRegistry() {
        this.vehicles = new HashMap<LicensePlate, String>();
    }
    
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vehicles.get(licensePlate) == null) {
            this.vehicles.put(licensePlate, owner);
            return true;
        }
        
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return vehicles.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (vehicles.get(licensePlate) == null) {
            return false;
        }
        vehicles.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate: this.vehicles.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner: this.vehicles.values()) {
            if (!owners.contains(owner)) {
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }
}
