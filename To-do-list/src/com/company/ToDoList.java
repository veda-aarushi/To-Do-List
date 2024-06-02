package com.company;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	//Instance variable to store the list of tasks
	private List<Task> tasks;
	// Constructor to initialize the ToDoList object
    public ToDoList() {
        // Create a new ArrayList to store tasks
        this.tasks = new ArrayList<>();
    }

 // Method to add a task to the to-do list
    public void addTask(Task task) {
        tasks.add(task); // Add the task to the list
    }

    // Method to mark a task at a specific index as completed
    public void markTaskAsCompleted(int index) {
        tasks.get(index).markAsCompleted(); // Mark the task at the specified index as completed
    }

    // Method to display all tasks in the to-do list
    public void displayTasks() {
        // Iterate over each task in the list
        for (int i = 0; i < tasks.size(); i++) {
            // Print the index (starting from 1), task description, and completion status
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}