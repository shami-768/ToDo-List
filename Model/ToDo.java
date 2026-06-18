package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ToDo {
     
    public static  List<Task>tasks =new ArrayList<>();
     private int nextId;

    public ToDo() {
        // tasks = new ArrayList<>();
        nextId = 1;
    }
    //add task
     public String addTask( String title ,String description, String priority ,LocalDate dueDate ) {

        Task task = new Task(nextId++, title, description, priority, dueDate);
        tasks.add(task);
       
         Collections.sort(tasks,(a,b)->{
                if(!a.getDueDate().equals(b.getDueDate())){
                    return a.getDueDate().compareTo(b.getDueDate());
                }
                return b.getPrioritynum(b.getPriority())-a.getPrioritynum(a.getPriority());
        });
        return "Task Added Successfully!";

    }
    public String  markTaskCompleted(int id) {
       
        
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
              
                return "Task marked as completed!\n";
            }
        }
     
        return "Task ID not found.\n";
    }
     public String  deleteTask(int id) {
     
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
           
                return "Task Deleted Successfully!";
            }
        }
        return "Task ID not found.\n";
    }


   
}
