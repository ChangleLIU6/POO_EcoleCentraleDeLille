/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LIU Changle
 */
public class Truck extends Car{
    private int tonnage;
    
    public Truck(){
        super();
        this.tonnage = 0;
    }
    public Truck(int tonnage){
        super();
        this.tonnage = 0;
        if(tonnage >=0 ) this.tonnage = tonnage;
    }
    public Truck(String brand, int tonnage){
        super(brand);
        this.tonnage = 0;
        if(tonnage >=0 ) this.tonnage = tonnage;
    }
    public Truck(String brand, Engine engine, int tonnage){
        super(brand, engine);
        this.tonnage = 0;
        if(tonnage >=0 ) this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        if(tonnage >=0 ) this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" + "brand=" + super.getBrand() + ", registrationNumber=" + super.getRegistrationNumber() + ", engine=" + super.getCopyEngine() +  ", tonnage=" + tonnage + '}';
    }
    

}
