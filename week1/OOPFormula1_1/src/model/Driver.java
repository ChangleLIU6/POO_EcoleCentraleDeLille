/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LIU Changle
 */
public class Driver extends Person{
    private int wins;
    private int withdraws;
    
    public Driver(){
        super();
        this.wins = 0;
        this.withdraws = 0;
    }
    public Driver(String firstName, String lastName, String address, Car car, int wins, int withdraws){
        super(firstName, lastName, address, car);
        if(wins >= 0) this.wins = wins;
        if(withdraws >= 0) this.withdraws = withdraws;
    }
    public Driver(Person person, int wins, int withdraws){
        super(person);
        if(wins >= 0) this.wins = wins;
        if(withdraws >= 0) this.withdraws = withdraws;        
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        if(wins >= 0) this.wins = wins;
    }

    public int getWithdraws() {
        return withdraws;
    }

    public void setWithdraws(int withdraws) {
        if(withdraws >= 0) this.withdraws = withdraws;        
    }
    
    public void winAPrize(){
        this.wins++;
    }
    public void withdrawARace(){
        this.withdraws++;
    }

    @Override
    public String toString() {
        return "Driver{" + "identificationNumber=" + super.getIdentificationNumber() + ", firstName=" + super.getFirstName() + ", lastName=" + super.getLastName() + ", address=" + super.getAddress() + ", wins=" + wins + ", withdraws=" + withdraws + '}';
    }
    
    @Override
    public boolean isCompatible(Car v){
        return (v instanceof Formula1);
    }
    
    @Override
    public boolean assign(Car v){
        if(!this.isCompatible(v)) return false;
        return super.assign(v);
    }
    
    public static void main(String[] args) {    //"psvm" ctrl + space
        Formula1 c1 = new Formula1("Farrari", "Deca");
        Truck t1 = new Truck("Benz", 6);
        System.out.println("c1 : " + c1.toString());
        Driver d1 = new Driver();
        Technician th1 = new Technician();
        System.out.println("d1 : " + d1.toString());
        System.out.println("th1 : " + th1.toString());
        System.out.println("d1 ass t1 : " + d1.assign(t1));
        System.out.println("d1 : " + d1.toString());
        System.out.println("d1 ass c1 : " + d1.assign(c1));
        System.out.println("d1 : " + d1.toString());
        System.out.println("c1 : " + c1.toString());




    }
}
