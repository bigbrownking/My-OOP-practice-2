package kz.aitu.oop.practice.practice2.wagons;

import kz.aitu.oop.practice.practice2.passengers.Passenger;

import java.util.ArrayList;

public class Wagon {
    private int id;
    private String way;
    private int seats;
    private ArrayList<Passenger> passengers;
    public Wagon(){}
    public Wagon(int id, String way, int seats){
        this.id = id;
        this.way = way;
        this.seats =seats;

        this.passengers = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setWay(String way) {
        this.way = way;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public String getWay() {
        return way;
    }

    public int getId() {
        return id;
    }
    public String getPassengers(int i) {
        return "Name: "+passengers.get(i).getName() + " "+
                "Age: "+passengers.get(i).getAge() + " "+
                "Way: "+passengers.get(i).getWay()+ " ";
    }
public String toString(){
        return "ID: "+getId() +" "+
                "Seat number: "+getSeats() + " "+
                "Way: "+getWay();
}

}
