/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LIU Changle
 */
public abstract class Car {
//attributes
    private String brand;
    private static int lastRegistration = 0;
    private int registrationNumber;
    private Engine engine = new Engine();
    /**
     * One car is drived by one person
     * Person is null if the car have no driver
     */
    private Person person;
    
    public Car(){
        this.brand = "DEFAULT_BRAND";
        lastRegistration ++;
        this.registrationNumber = lastRegistration;
        this.engine = new Engine();
    }
    public Car(String brand){
        this();
        if(brand != null){
            this.brand = brand;
        }
    }
    public Car(String brand, int power, char fuel){
        this(brand);
        this.engine = new Engine(power, fuel);
    }
    public Car(String brand, Engine engine, Person person){
        this(brand);
        if(engine != null){
            this.engine = engine;
        }
        if (person != null){
            this.person = person;
        }
    }
    public Car(String brand, Engine engine){
        this(brand);
        if(engine != null){
            this.engine = engine;
        }
    }
    public Car(Car car){
        this();
        lastRegistration --;
        if(car != null){
            this.brand = car.brand;
            this.engine = car.engine;
            this.person = car.person;
            this.registrationNumber = car.registrationNumber;
        }
    }
    public String getBrand() {
        return brand;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public Engine getCopyEngine() {
        return new Engine(engine);
    }

    public Person getCopyPerson() {
        return new Person(person);
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setEngine(Engine engine) {
        if(engine != null){
            this.engine = engine;
        }
    }
    
    public void setPowerEngine(int power){
        this.engine.setPower(power);
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", registrationNumber=" + registrationNumber + ", engine=" + engine + ", person=" + person + '}';
    }

    public boolean isAvailble(){
        return (this.person == null);
    }
    

    
}
