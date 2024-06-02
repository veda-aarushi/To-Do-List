package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a ToDoList object to manage tasks
        ToDoList toDoList = new ToDoList();

        // Main loop for user interaction
        while (true) {
            // Display menu options
            System.out.println("\n1. Add Task\n2. Mark Task as Completed\n3. Display Tasks\n4. Exit");
            System.out.print("Enter your choice: ");
            
            // Read user input
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            // Switch statement to handle user choices
            switch (choice) {
                case 1:
                    // Prompt user to enter task description
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    
                    // Add task to the to-do list
                    toDoList.addTask(new Task(description));
                    break;
                case 2:
                    // Prompt user to enter task number to mark as completed
                    System.out.print("Enter task number to mark as completed: ");
                    int taskNumber = scanner.nextInt();
                    
                    // Mark task as completed
                    toDoList.markTaskAsCompleted(taskNumber - 1); // Adjust index
                    break;
                case 3:
                    // Display all tasks in the to-do list
                    System.out.println("Tasks:");
                    toDoList.displayTasks();
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    // Display error message for invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
