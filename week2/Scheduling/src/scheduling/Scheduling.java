/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package scheduling;
import java.util.*;
import workshop.*;

/**
 *
 * @author LIU Changle
 */
public interface Scheduling {
    public Workshop schedule(int numberMachines, List<Task> tasks);
    
    public static List<Task> copyTasks(List<Task> tasks){
        List<Task> copytasks = new ArrayList<>();
        for(Task i : tasks){
            copytasks.add(i.getCopyTask(i));
        }
        return copytasks;
    }
    
    
}

        

