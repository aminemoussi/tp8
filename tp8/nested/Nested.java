/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mini_progect.nested;

import java.util.ArrayList;
import java.util.Arrays;


    

public class Nested {

/**
 *
 * @author amine
 */
     

 
    interface Vehicle {
        public String matricule="";

 
        public void goBackward();
        public void goForward();
        public void start();
        public void stop ();
    }

class Car implements Vehicle {
    private double weight;
    private String name;
    private String type;
    Wheel [] wheel;

    public Car(double weight, String name, String type, Wheel[] wheel, String matricule) {
        this.weight = weight;
        this.name = name;
        this.type = type;
        this.wheel = wheel;
    }
    
    public void printCarInfos(){
        System.out.println("car infos");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Wheel[] getWheel() {
        return wheel;
    }

    public void setWheel(Wheel[] wheel) {
        this.wheel = wheel;
    }

    @Override
    public void goBackward() {
        String className = this.getClass().toString();
         System.out.println(className + " is going back");
    }

    @Override
    public void goForward() {
         String className = this.getClass().toString();
         System.out.println(className + " is going forward");
    }

    @Override
    public void start() {
         String className = this.getClass().toString();
         System.out.println(className + " is starting ...");
    }

    @Override
    public void stop() {
         String className = this.getClass().toString();
         System.out.println(className + " is Stop");
    }
 
    
    
    
}



class Wheel {
    private double wheekSize;

    public Wheel(double wheekSize) {
        this.wheekSize = wheekSize;
    }

    public double getWheekSize() {
        return wheekSize;
    }

    public void setWheekSize(double wheekSize) {
        this.wheekSize = wheekSize;
    }
    
    public void printWheelInfos(){
            System.out.println("wheel infos");
    }
    
    public void printWheelState(){
        System.out.println("wheel state");
    }
}




 
class Truck implements Vehicle {
    private double loadCapacity;
    private int numberReserveWheels;
    private double weight;
    ArrayList<Wheel> wheels;

    public Truck(double loadCapacity, int numberReserveWheels, double weight, ArrayList<Wheel> wheels, String matricule) {
         
        this.loadCapacity = loadCapacity;
        this.numberReserveWheels = numberReserveWheels;
        this.weight = weight;
        this.wheels = wheels;
    }
    
    public void printTruckInfos(){
        System.out.println("truck infos");
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumberReserveWheels() {
        return numberReserveWheels;
    }

    public void setNumberReserveWheels(int numberReserveWheels) {
        this.numberReserveWheels = numberReserveWheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    public String getMatricule() {
        return matricule;
    }

 
    @Override
    public void goBackward() {
        String className = this.getClass().toString();
         System.out.println(className + " is going back");
    }

    @Override
    public void goForward() {
         String className = this.getClass().toString();
         System.out.println(className + " is going forward");
    }

    @Override
    public void start() {
         String className = this.getClass().toString();
         System.out.println(className + " is starting ...");
    }

    @Override
    public void stop() {
         String className = this.getClass().toString();
         System.out.println(className + " is Stop");
    }
    
}

 

class Bike implements Vehicle {
    private String name;
    private String model;
 Wheel [] wheel;

    public Bike(String name, String model,Wheel []  wheel, String matricule) {
      
        this.name = name;
        this.model = model;
        this.wheel = wheel;
    }

    public void printPikeInfos(){
        System.out.println("bike infos");
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel[] getWheel() {
        return wheel;
    }

    public void setWheel(Wheel[] wheel) {
        this.wheel = wheel;
    }
 

    public String getMatricule() {
        return matricule;
    }

    @Override
    public void goBackward() {
        String className = this.getClass().toString();
         System.out.println(className + " is going back");
    }

    @Override
    public void goForward() {
         String className = this.getClass().toString();
         System.out.println(className + " is going forward");
    }

    @Override
    public void start() {
         String className = this.getClass().toString();
         System.out.println(className + " is starting ...");
    }

    @Override
    public void stop() {
         String className = this.getClass().toString();
         System.out.println(className + " is Stop");
    }
 
}


class Vehicle_1 {
    protected String matricule;

    public Vehicle_1(String matricule) {
        this.matricule = matricule;
    }
    
    public void goBackward(){
    
    }
    public void goForward(){
    
    }
    public void start(){
    
    }
    
    public void stop (){
    
    }
}

      




    
    public void main(String[] args) {
        
        
        // creation of car wheels
        Wheel [] carWheel = { new Wheel(19), new Wheel(19), new Wheel(19), new Wheel(19) };
        // creation of the cars 
        Car car = new Car(10, "C7", "Type one", carWheel, "22");
        // creation of the truck wheels
        ArrayList<Wheel> truckWheel = new ArrayList<Wheel>() {
            {
                add(new Wheel(19));
                add(new Wheel(19));
                add(new Wheel(19));
                add(new Wheel(19));
                add(new Wheel(19));
                add(new Wheel(19));
                add(new Wheel(19));
            }};
        // creation of the truck
        Truck chackman = new Truck(1000.0, 2, 1000, truckWheel,"16");
      // creation of two bike wheels
        Wheel [] bikeWheel = { new Wheel(10), new Wheel(10) };
        // creation of bile 
        Bike bike = new Bike("between", "simple", bikeWheel, "");
        
        // print the infos
        car.printCarInfos();
        chackman.printTruckInfos();
        bike.printPikeInfos();
        
        bike.start();
        
    
    }
}
