
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
public class TodoList {
    private ArrayList<String> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }
    
    public void add(String todo) {
        this.todos.add(todo);
    } 
   
    public void remove(int indexTodo) {
        this.todos.remove(indexTodo - 1);
    }
    
    public void print() {
        for (int el = 0; el < this.todos.size(); el++) {
            System.out.println((el+1) + ": " + this.todos.get(el));
        }
    }
    
    
    
    
}
