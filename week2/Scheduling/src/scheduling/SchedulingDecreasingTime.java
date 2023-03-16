/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scheduling;

import java.util.Collections;
import java.util.List;
import workshop.*;

/**
 *
 * @author LIU Changle
 */
public class SchedulingDecreasingTime implements Scheduling{
    @Override
    public Workshop schedule(int numberMachines, List<Task> tasks){
        if(numberMachines <= 0) return null;
        if(tasks == null) return null;
        Collections.sort(tasks);
        Collections.reverse(tasks);
        Workshop workshop = new Workshop(numberMachines);
        workshop.scheduleTasks(tasks);
        return workshop;
        }
}
