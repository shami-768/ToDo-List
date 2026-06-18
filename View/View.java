package view;
import java.util.*;
import model.Task;

public class View {
    public void display(){
        System.out.println("========= TO-DO APPLICATION =========");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. View Pending Tasks");
            System.out.println("4. Mark Task as Completed");
            System.out.println("5. View Completed Task");
            System.out.println("6. Delete Task");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
    }
    public void invalid(){
        System.out.println("Invalid input. Try again.\n");
    }
    public void exit(){
        System.out.println("Exiting To-Do App. Goodbye!");
    }
    public void invcho(){
        System.out.println("Invalid choice. Try again.\n");
    }
   
  
    public void viewAllTasks(List<Task>tasks) {
       
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.\n");
            return;
        }
        System.out.println("---- All Tasks ----");
        for(Task task:tasks){
            System.out.println(task);
        }
          
    }
      // View pending tasks
    public void viewPendingTasks(List<Task>tasks) {
        boolean found = false;
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                if (!found) System.out.println("---- Pending Tasks ----");
                System.out.println(task);
                found = true;
            }
        }
        if (!found) System.out.println("No pending tasks 🎉\n");
    }
     //View Completed Tasks
    public  void viewCompletedTasks(List<Task>tasks){
        boolean found=true;
        for(Task task:tasks){
            if(task.isCompleted()){
                if(found){
                    System.out.println("----Completed Tasks----");}
                    System.out.println(task);
                    found=false;
                
            }
        }
        if(found){
            System.out.println("Haven't yet completed any tasks!");
            }
    }
    public void show(String s){
        System.out.println(s);
    }
}
