package model;

import java.time.LocalDate;

public class Task {
    private int id;
    private String title;
    private String description;
    private String priority; // High, Medium, Low
    private LocalDate dueDate;
    private boolean isCompleted;

    public Task(int id, String title, String description, String priority, LocalDate dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getPriority() { return priority; }
    public LocalDate getDueDate() { return dueDate; }
    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }
    public int getPrioritynum(String s){
        if(s.equalsIgnoreCase("high")){
            return 3;

        }
        else if(s.equalsIgnoreCase("Medium")){
            return 2;
        }
        else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return "ID: " + id +
               "\nTitle: " + title +
               "\nDescription: " + description +
               "\nPriority: " + priority +
               "\nDue Date: " + dueDate +
               "\nStatus: " + (isCompleted ? "Completed" : "Pending") +
               "\n--------------------------";
    }
}


