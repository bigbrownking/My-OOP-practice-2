package kz.aitu.oop.practice.practice2;

import kz.aitu.oop.practice.practice2.wagons.Wagon;

import java.util.ArrayList;

public class Train {
    private ArrayList<Wagon> wagons;
    private int id;
    private String way;
    private double velocity;
    private int capacity;
    public Train(){}
    public Train(int id, String way, double velocity, int capacity){
        this.id = id;
        this.way = way;
        this.velocity = velocity;
        this.capacity = capacity;
        this.wagons = new ArrayList<>();
    }
    public void setCapacity(int capacity) {
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
    public void setWay(String way) {
        this.way = way;
    }
    public void setWagons(ArrayList<Wagon> wagons) {
        this.wagons = wagons;
    }
    public double getVelocity() {
        return velocity;
    }
    public int getCapacity() {
        return capacity;
    }
    public String getWay() {
        return way;
    }
    public int getId() {
        return id;
    }
    public String getWagons(int i) {
        return "ID: "+wagons.get(i).getId() +" "+
                "Seat number: "+wagons.get(i).getSeats() + " "+
                "Way: "+wagons.get(i).getWay();
    }

    public void addWagon(Wagon wagon){
        this.wagons.add(wagon);
    }
    public void removeWagon(Wagon wagon){
        this.wagons.remove(wagon);
    }
    public int numberOfWagon(){
        return wagons.size();
    }

}

