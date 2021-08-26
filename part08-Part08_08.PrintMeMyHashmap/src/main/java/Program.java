
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printKeys(HashMap<String, String> hashmap) {
        // prints all the keys of a hashmap
        for (String keys: hashmap.keySet()) {
            System.out.println(keys);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        // prints the keys in the hashmap given as a parameter, which contains the string givens as a parameter
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
}
