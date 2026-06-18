package view;
import java.time.LocalDate;
import java.util.*;
public class UserInput {
    View v=new View();
    Scanner sc=new Scanner(System.in);
    public int inchoice(){
     return Integer.parseInt(sc.nextLine());
     
    }
    public String getname(){
       v.show("Enter Title:");
        String title = sc.nextLine();
        return title;
    }
    public String getdes(){
        v.show("Enter Description:");
        String description = sc.nextLine();
        return description;
    }
    public String getpri(){
         v.show("Enter Priority(High/Medium/Low):");
        String priority = sc.nextLine();
        return priority;
    }
    public LocalDate getdate(){
        v.show("Enter due date (YYYY-MM-DD): ");
        LocalDate dueDate = LocalDate.parse(sc.nextLine());
        return dueDate;

    }
    public int getid(){
         v.show("Enter Task Id:");
        int id = Integer.parseInt(sc.nextLine());
return id;
    }
}
