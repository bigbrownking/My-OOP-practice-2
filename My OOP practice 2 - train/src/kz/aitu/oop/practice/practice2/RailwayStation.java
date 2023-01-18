package kz.aitu.oop.practice.practice2;

import kz.aitu.oop.practice.practice2.passengers.*;
import kz.aitu.oop.practice.practice2.wagons.Wagon;

import java.util.ArrayList;

public class RailwayStation {
    private ArrayList<Train> trains;
    private ArrayList<Ticket> tickets;
    private ArrayList<Passenger> passengers;

    public RailwayStation() {
        this.passengers = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.trains = new ArrayList<>();
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setWagons(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public String getPassengers(int i) {
        return "ID: " + passengers.get(i).getId() + " " +
                "Name: " + passengers.get(i).getName() + " " +
                "Age: " + passengers.get(i).getAge() + " " +
                "Way: " + passengers.get(i).getWay() + " ";
    }

    public String getTickets(int i) {
        return "ID: " + tickets.get(i).getId() + " " +
                "Way: " + tickets.get(i).getWay() + " " +
                "Price: " + tickets.get(i).getPrice() + " " +
                "Date: " + tickets.get(i).getDate();
    }

    public String getTrains(int i) {
        return "ID: " + trains.get(i).getId() + " " +
                "Way: " + trains.get(i).getWay() + " " +
                "Velocity: " + trains.get(i).getVelocity() + " " +
                "Capacity: " + trains.get(i).getCapacity() + " ";
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void addTrain(Train train) {
        this.trains.add(train);
    }

    public void removeTicket(Ticket ticket) {
        this.tickets.remove(ticket);
    }

    public void buyTicket( Ticket ticket, Passenger passenger) {
        double change;
        if (passenger.getRetired() == true && passenger.getAge() < 7) {
            addTicket(ticket);
            passenger.setTicket(ticket);
        } else if (passenger.getRetired() == true && passenger.getAge() > 62) {
            addTicket(ticket);
            passenger.setTicket(ticket);
        } else if (passenger.getBalance() >= ticket.getPrice()) {
            if (passenger.getAge() < 7) {
                change = passenger.getBalance() - ticket.getPrice() * 0.5;
                addTicket(ticket);
                passenger.setBalance(change);
                passenger.setTicket(ticket);
            } else if (passenger.getAge() > 21) {
                change = passenger.getBalance() - ticket.getPrice();
                addTicket(ticket);
                passenger.setBalance(change);
                passenger.setTicket(ticket);
            } else if (passenger.getAge() > 62) {
                change = passenger.getBalance() - ticket.getPrice() * 0.7;
                addTicket(ticket);
                passenger.setBalance(change);
                passenger.setTicket(ticket);
            } else if (passenger.getRetired() == true) {
                change = passenger.getBalance() - ticket.getPrice() * 0.6;
                addTicket(ticket);
                passenger.setBalance(change);
                passenger.setTicket(ticket);
            }
        } else {
            System.out.print("You don't have enough money");
        }
    }

    public void sellTicket(Ticket ticket, Passenger passenger) {
        if(passenger.getTicket() == ticket) {
            passenger.setBalance(passenger.getBalance() + ticket.getPrice());
            System.out.println("Okay");
            removeTicket(ticket);
            passenger.removeTicket();
            passengers.remove(passenger);
        }
        else{
            System.out.print("It is not your ticket.");
        }
    }
}
