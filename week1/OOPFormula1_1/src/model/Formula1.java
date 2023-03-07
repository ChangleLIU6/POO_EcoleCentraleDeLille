/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LIU Changle
 */
public class Formula1 extends Car{
    private String sponsor;
    
    public Formula1(){
        super();
        this.sponsor = "DEFAULT_SPONSOR";
    }
    public Formula1(String sponsor){
        super();
        this.sponsor = sponsor;
    }
    public Formula1(String brand, String sponsor){
        super(brand);
        this.sponsor = sponsor;
    }
    public Formula1(String brand, Engine engine, String sponsor){
        super(brand, engine);
        this.sponsor = sponsor;
    }
    

    
    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
    
    @Override
    public String toString() {
        return "Formula1{" + "brand=" + super.getBrand() + ", registrationNumber=" + super.getRegistrationNumber() + ", engine=" + super.getCopyEngine() + ", sponsor=" + sponsor + '}';
    }
    

}
