package main.factory1;

import static java.awt.Color.black;

/**
 *
 * @author mojme
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // System.out.println();
        Car fiat = new Car("Fiat Punto", 2010, "black", 45);
        fiat.showData();
//       
        Car ford = new Car("Ford", 2015, "red", 40, 10, 5, 300);
        ford.showData();
        
        Car lada = new Car("Lada Niva", 1980, "green", 50, 40, 10, 500);
        lada.showData();
        lada.travel(20);
        lada.showData();
        lada.travel(200);
        lada.showData();
        lada.fuelUp(20);
        lada.travel(400);
        
        lada.setPassengers (2);
        lada.showData();
        
        lada.getIn();
        lada.getIn();
        lada.getOut();
        lada.getIn(3);
        lada.getIn(8);
//        lada.getOut(10);
//        lada.getOut(2);
//        lada.getOut(1);
//        lada.getIn(1);
        
        
//        fiat.setModel("Fiat Punto");
//        fiat.setBuildYear(2010);
//        fiat.setColor("Black");
//        fiat.setConsumption(6);
//        fiat.setMaxSpeed(180);
//        fiat.setCurrentFuel(20);
//        fiat.setMaxFuel(10);
//        fiat.showData();
//        
        System.out.println();
        
//        Car ford = new Car();
//        //  ford.model = "Focus";
//        ford.setModel("Ford Fiesta");
//        ford.setBuildYear(2015);
//        ford.setColor("white");
//        ford.setConsumption(10);
//        ford.setMaxSpeed(220);
//        ford.setCurrentFuel(30);
//        ford.setMaxFuel(60);
//        ford.showData();
//        System.out.println();
    }  
}