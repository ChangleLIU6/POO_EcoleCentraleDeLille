/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop;
import java.util.*;

/**
 *
 * @author LIU Changle
 */
public class Machine {
    private int availabilityTime;
    private double totalPenalty;
    private List<Task> taskList;
    
    public Machine() {
        this.availabilityTime = 0;
        this.totalPenalty = 0;
        this.taskList = new LinkedList();
    }

    public Machine(int availabilityTime, double totalPenalty) {
        this();
        this.availabilityTime = availabilityTime;
        this.totalPenalty = totalPenalty;
    }
    
    public boolean addTask(Task t){
        if(t == null) return false;
        if(t.getInitialTime() != -1) return false;
        this.taskList.add(t);
        t.setInitialTime(availabilityTime);
        this.availabilityTime += t.getExecutionTime();
        this.totalPenalty += t.getPenalty() * Math.max(0, (this.availabilityTime - t.getDeliverTime()));
        return true;
    }

    public int getAvailabilityTime() {
        return availabilityTime;
    }

    public double getTotalPenalty() {
        return totalPenalty;
    }

    @Override
    public String toString() {
        return "Machine{" + "availabilityTime=" + availabilityTime + ", totalPenalty=" + totalPenalty + ", taskList=" + taskList + '}';
    }


    
}
