/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LIU Changle
 */
public class Team {
    private String name;
    private Person[] team;
    private Car[] cars;
    private static final int MAX_CREW = 5;
    private static final int MAX_FLEET = 5;
    
    private int nbPeople;
    private int nbCars;
    
    public Team(){
        this.name = "DEFAULT_NAME";
        this.team = new Person[MAX_CREW];
        this.cars = new Car[MAX_FLEET];
        int nbCars = 0;
        int nbPeople = 0;
    }
    public Team(String name){
        this();
        if(name != null) this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person[] getTeam() {
        return team;
    }

    public void setTeam(Person[] team) {
        this.team = team;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Team{" + "name=" + name + ", team=" + team + ", cars=" + cars + ", nbPeople=" + nbPeople + ", nbCars=" + nbCars + '}';
    }



    
    public boolean isPresent(Person p){
        for(int i=0; i<nbPeople; i++){
            if(this.team[i].getIdentificationNumber() == p.getIdentificationNumber()) return true;
        }
        return false;
    }
    
    public boolean isPresent(Car v){
        for(int i=0; i<nbCars; i++){
            if(this.cars[i].getRegistrationNumber() == v.getRegistrationNumber()) return true;
        }
        return false;
    }
    
    public boolean hire(Person p){
        if(this.isPresent(p)) return false;
        if(this.nbPeople == MAX_CREW) return false;
        this.team[nbPeople] = p;
        return true;
    }
    
    public boolean buy(Car v){
       if(this.isPresent(v)) return false;
        if(this.nbCars == MAX_FLEET) return false;
        this.cars[nbCars] = v;
        return true;
    }
    
    private Person findPerson(Person p){
        for(int i=0; i<nbPeople; i++){
            if(this.team[i].getIdentificationNumber() == p.getIdentificationNumber()) return p;
        }
        return null;
    }
    
    private Car finCar(Car v){
        for(int i=0; i<nbCars; i++){
            if(this.cars[i].getRegistrationNumber() == v.getRegistrationNumber()) return v;
        }
        return null;
    }
}
