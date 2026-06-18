package controller;
import view.*;
import model.*;
public class ToDoListApp {
    
    View v;
    UserInput u;
    ToDo t;
   public  ToDoListApp(View v,UserInput u,ToDo t){
        this.v=v;
        this.u=u;
        this.t=t;
    }
    public  void start() {
         int choice =0;
         do {
            v.display();

            try {
                
                choice = u.inchoice();
            } catch (NumberFormatException e) {
                v.invalid();
                continue;
            }

            switch (choice) {
                case 1 :{ 
                  String s= t. addTask(u.getname(), u.getdes(),u.getpri(),u.getdate());
                   v.show(s);
                   break;}
                case 2 :{ v.viewAllTasks(ToDo.tasks);break;}
                case 3 :{ v.viewPendingTasks(ToDo.tasks);break;}
                case 4 :{ 
                    String s=t.markTaskCompleted(u.getid());
                    v.show(s);
                    break;}
                case 5 :{ v.viewCompletedTasks(ToDo.tasks);break;}
                case 6 :{
                    String s=t.deleteTask(u.getid());
                    v.show(s);
                    break;}
                case 7 :{v.exit();break;}
                default :{ v.invcho();break;}
            }

        } while (choice !=7);
    }
}
