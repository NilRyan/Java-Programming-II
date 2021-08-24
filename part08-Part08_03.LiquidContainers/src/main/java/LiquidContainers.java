
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxAmount = 100;
        Container a = new Container(maxAmount, 0);
        Container b = new Container(maxAmount, 0);
        
        System.out.println("First: " + a);
        System.out.println("Second: " + b);
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] array = input.split(" ");
            String command = array[0];
            int amount = Integer.valueOf(array[1]);

            if (command.equals("add")) {
                a.add(amount);

            }

            if (command.equals("move")) {
                if (a.getAmount() - amount < 0) {
                    b.add(a.getAmount());
                    a.remove(amount);
                } else {
                    a.remove(amount);
                    b.add(amount);
                }

            }

            if (command.equals("remove")) {
                b.remove(amount);
            }

            System.out.println("First: " + a);
            System.out.println("Second: " + b);
        }
    }
}
