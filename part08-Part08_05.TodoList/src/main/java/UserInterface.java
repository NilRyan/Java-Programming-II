
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nilryan
 */
public class UserInterface {

    private Scanner scanner;
    private TodoList todos;

    public UserInterface(TodoList todos, Scanner scanner) {
        this.scanner = scanner;
        this.todos = todos;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add:");
                String todo = scanner.nextLine();
                todos.add(todo);
                continue;
            }
            if (command.equals("list")) {
                todos.print();
                continue;
            }
            if (command.equals("remove")) {
                int indexTodo = Integer.valueOf(scanner.nextLine());
                todos.remove(indexTodo);
                continue;
            }

        }

    }

}
