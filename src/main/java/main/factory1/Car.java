/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factory1;

/**
 *
 * @author qa
 */
public class Car {
   private final String vehicleType = "Car";
   private String model;
   private int buildYear;
   private int maxSpeed;
   private String color;
   private int maxFuel;
   private int currentFuel;
   private int consumption;
   private double milage;
   private int fuelUp;
 
   
   public Car(){
       this.model = "";
       this.buildYear = 0;
       this.color = "";
       this.maxFuel =0;
       this.currentFuel = 0;
       this.consumption = 0;
       this.milage = 0;
       
   }
   public Car(String customModel, int customBuild, String customColor, int customMaxFuel){
       this.model = customModel;
       this.buildYear = customBuild;
       this.color = customColor;
       this.maxFuel = customMaxFuel;
   } 
    public Car(String customModel, int customBuild, String customColor, int customMaxFuel, int customCurrentFuel, int customConsumption, double customMilage){
       this.model = customModel;
       this.buildYear = customBuild;
       this.color = customColor;
       this.maxFuel = customMaxFuel;
       this.currentFuel =customCurrentFuel;
       this.consumption = customConsumption;
       this.milage = customMilage;
   }
   public Car(String customModel, int customBuild, String customColor, int customMaxFuel, int customCurrentFuel, int customConsumption, double customMilage, int customFuelUp){
       this.model = customModel;
       this.buildYear = customBuild;
       this.color = customColor;
       this.maxFuel = customMaxFuel;
       this.currentFuel =customCurrentFuel;
       this.consumption = customConsumption;
       this.milage = customMilage;
       this.fuelUp = customFuelUp;
   }
   public String getModel (){
    return this.model;
}
   public void setModel (String customModel) {
       this.model = customModel;
   }
    public int getbuildYear(){
        return this.buildYear;
    }
   public void setBuildYear(int customBuildYear){
         this.buildYear = customBuildYear;
   }
   public String getColor (){
    return this.color;
}
   public void setColor (String customColor) {
       this.color = customColor;
   }
   public int getMaxFuel(){
        return this.maxFuel;
    }
   public void setMaxFuel(int customMaxFuel){
         this.maxFuel = customMaxFuel;
   }
   public int getCurrentFuel(){
        return this.currentFuel;
    }
   public void setCurrentFuel(int customCurrentFuel){
         this.currentFuel = customCurrentFuel;
   }
     public int getConsumption(){
        return this.consumption;
    }
   public void setConsumption(int customConsumption){
         this.consumption = customConsumption;
   }
   public String getVehicleType  (){
        return this.vehicleType ;
}
//   public void setVehicleType (final String customVehicleType) {
//        this.vehicleType = customVehicleType;
//  }
    
   public double getMilage (){
    return this.milage;
}
   public void setMilage (double customMilage) {
       this.milage = customMilage;
   }
   
   public int getFuelUp (){
    return this.fuelUp;
}
   public void setFuelUp (int customFuelUp) {
       this.fuelUp = customFuelUp;
   }
   
   public void getIn (){
   // 1 osoba je usla u vozilo 
}
   public void getIn (int numberOgPeople) {
   // numberOfPeople osoba je uslo u vozilo  
   }
   
   public void getOut (){
   // 1 osoba je izasla iz vozila 
}
   public void getUp (int numberOfPeople) {
   // numberOfPeople osoba je izaslo iz vozila   
   }
   public void showData() {
    System.out.println("Model: " + this.getModel());
    System.out.println("Godina proizvodnje: " + this.getbuildYear ());
    System.out.println("Boja: " + this.getColor ());
    System.out.println("potrosnja: " + this.getConsumption ());
    System.out.println("Stanje rezervoara: " + this.getCurrentFuel ());
    System.out.println("Kapacitet rezervoara: " + this.getMaxFuel ());
    System.out.println("Predjena kilometraza: " + this.getMilage ());
    System.out.println(": " + this.getFuelUp ());
   }
   
   public void travel(int distance){
       if (this.getCurrentFuel () > (distance * this.getConsumption()) / 100){
           this.milage = this.getMilage() + distance; 
           this.currentFuel = this.getCurrentFuel() - (distance * this.getConsumption()) / 100;
           System.out.println("Uspesno ste putovali"  + distance + "kilometara");
       } else {
           System.out.println(" Nema dovoljno goriva za put od : " + distance);
       }
   }
   public void fuelUp (int refill) {
       int emptySpace = this.getMaxFuel() - this.getCurrentFuel();
       
       if (refill <= emptySpace) {
         this.currentFuel = this.getCurrentFuel() + refill;
         System.out.println("Uspesno ste sipali " + refill + ". Novo stanje je:" + this.getCurrentFuel());
       } else {
           this.currentFuel = this.getMaxFuel();
           System.out.println("Rezervoar je pun. Sipali ste" + refill);
       } 
          
        
        }
   
}


