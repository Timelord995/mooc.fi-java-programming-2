
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            }
            
            this.processCommand(command);
        }
        
    }
    
    private void processCommand(String command){
        if (command.equals("add")){
            System.out.print("To add: ");
            String task = scanner.nextLine();
            this.todoList.add(task);
        }
        
        if (command.equals("list")){
            this.todoList.print();
        }
        
        if (command.equals("remove")){
            System.out.print("Which one is removed? ");
            int number = Integer.valueOf(scanner.nextLine());
            this.todoList.remove(number);
        }
    }
}
