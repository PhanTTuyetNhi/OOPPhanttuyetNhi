
package oop;
public class Car {
    private String model;
    private int year;
    
    public Car(String model,int year){
        this.model=model;
        this.year=year;
    }
    public void display(){
        System.out.println("Car Model:"+model+"\nYear:"+year);
    }
}
