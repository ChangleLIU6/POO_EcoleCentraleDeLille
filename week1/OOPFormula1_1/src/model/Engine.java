/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author LIU Changle
 */
public class Engine {
    
//attributes
    private int power;
    private char fuel;
    
    private static final int POWER_MIN = 600;
    private static final char PETROL = 'P';
    private static final char DIESEL = 'D';
    
    public Engine(){
        this.fuel = PETROL;
        this.power = POWER_MIN;
    }
    public Engine(int power, char fuel){
        this();
        if(power > POWER_MIN){
            this.power = power;
        }
        if(fuel == DIESEL){
            this.fuel = fuel;
        }
    }
    public Engine(Engine e){
        this();
        if(e != null){
            this.power = e.power;
            this.fuel = e.fuel;
        }
    }
    
//methods
    public int getPower() {
        return power;
    }
    public char getFuel() {
        return fuel;
    }
    
    /**
     * Modify the power of a car
     * The power must be greater than the min power
     * @param power 
     */
    public void setPower(int power) {
        if(power >= POWER_MIN){
            this.power = power;
        }
    }

    @Override
    public String toString() {
        return "Engine{" + "power=" + this.power + ", fuel=" + this.fuel + '}';
    }
    
    

    
    
}
