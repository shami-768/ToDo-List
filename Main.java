import model.*;
import controller.ToDoListApp;
import view.*;

public class Main {
     public static void main(String[] args) {
       ToDo t=new ToDo();
        View v=new View();
        UserInput u=new UserInput();
        ToDoListApp app = new ToDoListApp(v,u,t);
        app.start();
    }
}
