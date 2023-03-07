/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LIU Changle
 */
public class Technician extends Person{
    private String speciality;
    
       public Technician(){
        super();
        this.speciality = "DEFAULT_SPECIALITY";
    }
    public Technician(String firstName, String lastName, String address, Car car, String speciality){
        super(firstName, lastName, address, car);
        this.speciality = speciality;
    }
    public Technician(Person person, String speciality){
        super(person);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Technician{" + "identificationNumber=" + super.getIdentificationNumber() + ", firstName=" + super.getFirstName() + ", lastName=" + super.getLastName() + ", address=" + super.getAddress() + ", speciality=" + speciality + '}';
    }
    
    @Override
    public boolean isCompatible(Car v){
        return (v instanceof Truck);

    }
    
    @Override
    public boolean assign(Car c){
        if(!(c instanceof Truck)) return false;
        return super.assign(c);
    }
}
