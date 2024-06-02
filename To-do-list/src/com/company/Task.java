
package com.company;

import java.util.Scanner;
//This class represents an individual task in our to-do list
public class Task {
	private String description;//description is an instance variable stores the task description
	private boolean completed;//to indicate whether the task is completed or not
    
	public Task(String description) {
		//This is a constructor that is used to create a new task with the given description
		this.description = description;//This is an instance variable
		this.completed = false; // By default, the class is not completed
	}
	public String getDescription() {
		return description;	
	}
	// Getter method to check if the task is completed
    public boolean isCompleted() {
        return completed;
    }
 // Method to mark the task as completed
    public void markAsCompleted() {
        this.completed = true; // Set the completed flag to true
    }

    // Override the toString() method to provide a string representation of the task
    @Override
    public String toString() {
        return description + " - Completed: " + completed;
    }
}


