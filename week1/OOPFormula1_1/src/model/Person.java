/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LIU Changle
 */
public abstract class Person {
    private static int lastNumber = 0;
    private int identificationNumber;
    private String firstName;
    private String lastName;
    private String address;
    /**
     * One person drives one car
     * Car is null if one person drives no car
     */
    private Car car;
    
    public Person(){
        lastNumber ++;
        this.identificationNumber = lastNumber;
        this.firstName = "DEFAULT_FIRST_NAME";
        this.lastName = "DEFAULT_LAST_NAME";
        this.address = "DEFAULT_ADDRESS";
        this.car = null;
    }
    public Person(String firstName, String lastName, String address, Car car){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        if(car != null){
            this.car = car;
        }
    }
    public Person(Person person){
        this();
        lastNumber --;
        if(person != null){
            this.address = person.address;
            this.car = person.car;
            this.firstName = person.firstName;
            this.identificationNumber = person.identificationNumber;
            this.lastName = person.lastName;
        }
    }
    
    public boolean isPedestrian(){
        return (this.car == null);
    }
    
    public boolean assign(Car c){
        if(c == null) return false;
        if(!c.isAvailble()) return false;
        if(!this.isPedestrian()) return false;
        this.car = c;
        c.setPerson(this);
        return true;
    }
    
    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setCar(Car car) {
        if(car != null) this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" + "identificationNumber=" + identificationNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", car=" + car + '}';
    }



    public boolean isCompatible(Car v){
        return false;
    }
}
