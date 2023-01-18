package kz.aitu.oop.practice.practice2;

import kz.aitu.oop.practice.practice2.passengers.Passenger;

public class Ticket {
    private int id;
    private String way;
    private double price;
    private String date;
    public Ticket(int id , double price, String date){
        this.id = id;
        this.price = price;
        this.date = date;
    }
    public Ticket(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public String getWay() {
        return way;
    }
    public String toString(){
        return "ID: "+getId() + " " +
                "Way: "+getWay()+" "+
                "Price: "+ getPrice() + " "+
                "Date: "+ getDate();
    }
}
