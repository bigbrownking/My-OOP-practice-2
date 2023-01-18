package kz.aitu.oop.practice.practice2.passengers;

import kz.aitu.oop.practice.practice2.Ticket;

public class Passenger {
    private Ticket ticket;
    private int id;
    private String name;
    private int age;
    private String way;
    private double balance;
private boolean isStudent;
private boolean isRetired;
    public Passenger(int id,String name, int age, String way, double balance){
        this.name = name;
        this.age = age;
        this.way = way;
        this.balance = balance;
        this.id = id;
    }
    public Passenger(){}


    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void setWay(String way) {
        this.way = way;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public Ticket getTicket(){
        return ticket;
    }

    public int getAge() {
        return age;
    }

    public String getWay() {
        return way;
    }

    public double getBalance() {
        return balance;
    }
    public boolean getStudent(){
        return isStudent;
    }
    public boolean getRetired(){
        return isRetired;
    }
    public String ToString() {
        return "ID: "+ticket.getId() + " " +
                "Way: "+ticket.getWay()+" "+
                "Price: "+ ticket.getPrice() + " "+
                "Date: "+ ticket.getDate();
    }
    public void removeTicket(){
        this.ticket = null;
    }
}
