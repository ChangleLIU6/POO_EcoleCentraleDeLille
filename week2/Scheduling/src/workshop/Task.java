/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop;

/**
 *
 * @author LIU Changle
 */
public class Task implements Comparable<Task>{
    private int executionTime;
    private int initialTime;
    private int deliverTime;
    private double penalty; 
    private final static int MIN_PROC_TIME = 50;
    private static int lastNumber = 0;
    private int identifier;
    
    /**
     * initialTime = -1 if the task wasnt assigned to a machine
     */
    public Task() {
        this.initialTime = -1;
        this.executionTime = MIN_PROC_TIME;
        this.deliverTime = Integer.MAX_VALUE;
        this.penalty = 0.0;
        lastNumber ++;
        this.identifier = lastNumber;
    }

    public Task(int executionTime) {
        this();
        if(executionTime > MIN_PROC_TIME) this.executionTime = executionTime;
    }

    public Task(int executionTime, int deliverTime, double penalty) {
        this();
        if(executionTime > MIN_PROC_TIME) this.executionTime = executionTime;
        if(deliverTime >= 2*this.executionTime) this.deliverTime = deliverTime;
        this.penalty = penalty;
    }

    public Task(int initialTime, int executionTime, int deliverTime, double penalty) {
        this();
        if(executionTime > MIN_PROC_TIME) this.executionTime = executionTime;
        if(deliverTime >= 2*this.executionTime) this.deliverTime = deliverTime;
        this.initialTime = initialTime;
        this.penalty = penalty;
    }
    

    public int getExecutionTime() {
        return executionTime;
    }

    public int getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(int deliverTime) {
        this.deliverTime = deliverTime;
    }

    public double getPenalty() {
        return penalty;
    }

    public int getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(int initialTime) {
        this.initialTime = initialTime;
    }
    public Task getCopyTask(Task t){
        Task t1 = new Task(t.initialTime, t.executionTime, t.deliverTime, t.penalty);
        return t1;
    }
    @Override
    public String toString() {
        return "Task{" + "executionTime=" + executionTime + ", initialTime=" + initialTime + ", deliverTime=" + deliverTime + ", penalty=" + penalty + ", identifier=" + identifier + '}';
    }

    @Override
    public int compareTo(Task t){
        if(this.equals(t)) return 0;
        if(t.executionTime - this.executionTime != 0){
            return t.executionTime - this.executionTime;
        }else return 1;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.executionTime;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Task other = (Task) obj;
        return this.executionTime == other.executionTime;
    }
            
    
}
