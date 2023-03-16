/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop;
import java.util.*;
import scheduling.Scheduling;
/**
 *
 * @author LIU Changle
 */
public class Workshop {
    private int totalCompletionTime;
    private double totalPenaltyCost;
    private List<Machine> machineList;
    
    public Workshop(){
        this.totalCompletionTime = 0;
        this.totalPenaltyCost = 0;
        this.machineList = new ArrayList();
        machineList.add(new Machine());
    }
    public Workshop(int nbMachines){
        this();
        for(int i = 0; i < nbMachines - 1; i++){
            this.machineList.add(new Machine());
        }
    }

    public int getTotalCompletionTime() {
        return totalCompletionTime;
    }

    public double getTotalPenaltyCost() {
        return totalPenaltyCost;
    }

    public void setMachineList(List<Machine> machineList) {
        if(machineList != null) this.machineList = machineList;
    }

    @Override
    public String toString() {
        return "Workshop{" + "totalCompletionTime=" + totalCompletionTime + ", totalPenaltyCost=" + totalPenaltyCost + ", machineList=" + machineList + '}';
    }
    
    public void updateCriteria(){
        for(int i = 0; i < machineList.size(); i++){
            this.totalCompletionTime = Math.max(totalCompletionTime, machineList.get(i).getAvailabilityTime());
            this.totalPenaltyCost += machineList.get(i).getTotalPenalty();
        }
    }
    
    private Machine getMachine(int posMachine){
        if((posMachine > machineList.size()) || (posMachine < 0)) return null;
        return machineList.get(posMachine);
    }
    
    private boolean addTask(Task t, int posMachine){
        if(t == null) return false;
        if(posMachine > machineList.size()) return false;
        machineList.get(posMachine).addTask(t);
        return true;
    }
    
    private int getFirstAvailableMachine(){
        int firstAvailable = -1;
        int timeAvailable = Integer.MAX_VALUE;
        for(int i = 0; i < machineList.size(); i++){
            if(this.getMachine(i).getAvailabilityTime() < timeAvailable){
                timeAvailable = this.getMachine(i).getAvailabilityTime();
                firstAvailable = i;
            }
        }
        return firstAvailable;
    }
    
    public void scheduleTasks(List<Task> tasks){
        for(Task i : tasks){
            addTask(i, getFirstAvailableMachine());
        }
        this.updateCriteria();
    }
    
    public void display(boolean verbose){
        System.out.println("CompletionTime : " + this.getTotalCompletionTime());
        System.out.println("PenaltyCost" + this.getTotalPenaltyCost());
        if(verbose) System.out.println(this.toString());
    }
}
