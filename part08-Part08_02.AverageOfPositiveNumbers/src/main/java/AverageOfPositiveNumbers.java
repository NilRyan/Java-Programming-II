
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int total = 0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            
            
            if (input > 0) {
                numbers.add(input);
            }
        }
        
        if (numbers.size() == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            
            for (Integer number: numbers) {
                total += number;
            }
            
            System.out.println((double) total / numbers.size());
        }
    }
}   
