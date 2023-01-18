package kz.aitu.oop.practice.practice2;

import kz.aitu.oop.practice.practice2.passengers.*;
import kz.aitu.oop.practice.practice2.wagons.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner sc = new Scanner(System.in);
        ArrayList<Passenger> passengers = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        ArrayList<Wagon> train = new ArrayList<>();
        RailwayStation Vokzal = new RailwayStation();
        System.out.println(
                "--------------------------------------------\n"+
                "Pick one action below:" + "\n " +
                "1) To add a new passenger;\n" +//yes
                "2) To redactor a passenger;\n" +//yes
                "3) To show all available wagons;\n" +//yes
                "4) To add wagon;\n" +//yes
                "5) To get wagon;\n" +//yes
                "6) To get passenger;\n" + //yes
                "7) To buy a ticket;\n" +//yes
                "8) To cancel a purchase of the ticket.\n"+
                "--------------------------------------------");//yes

        int selection = sc.nextInt();
        while (selection != 0) {
            switch (selection) {//add passenger
                case 1:
                    Passenger passenger = new Passenger();
                    System.out.print("Enter passenger's ID: ");
                    int id = sc.nextInt();
                    passenger.setId(id);
                    System.out.print("Enter passenger name: ");
                    String PassengerName = sc.next();
                    passenger.setName(PassengerName);
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    passenger.setAge(age);
                    System.out.print("Enter the way: ");
                    String way = sc.next();
                    passenger.setWay(way);
                    System.out.print("Enter the balance: ");
                    double balance = sc.nextDouble();
                    passenger.setBalance(balance);
                    System.out.print("Is he/she student? ");
                    String ans = sc.next();
                    ans.toLowerCase();
                    if (ans.equals("yes")) {
                        passenger.setStudent(true);
                    } else {
                        passenger.setStudent(false);
                    }
                    System.out.print("Is he/she retired? ");
                    String ans2 = sc.next();
                    ans2.toLowerCase();
                    if (ans2.equals("yes")) {
                        passenger.setRetired(true);
                    } else {
                        passenger.setRetired(false);
                    }
                    Vokzal.addPassenger(passenger);
                    passengers.add(passenger);
                    System.out.print("Person was added");
                    break;

                case 2:
                    System.out.print("Choose ID: ");
                    int pas = sc.nextInt();
                    System.out.println();
                    for (int i = 0; i < passengers.size(); i++) {
                        if (pas == passengers.get(i).getId()) {
                            System.out.print("Name: ");
                            String name = sc.nextLine();
                            System.out.println();
                            passengers.get(pas).setName(name);
                            System.out.print("Age: ");
                            int ages = sc.nextInt();
                            System.out.println();
                            passengers.get(pas).setAge(ages);
                            System.out.print("Way: ");
                            String ways = sc.nextLine();
                            System.out.println();
                            passengers.get(pas).setWay(ways);
                            System.out.print("Balance: ");
                            double balances = sc.nextDouble();
                            System.out.println();
                            passengers.get(pas).setBalance(balances);
                            System.out.print("Student? ");
                            boolean isStud = sc.nextBoolean();
                            System.out.println();
                            passengers.get(pas).setStudent(isStud);
                            System.out.print("Retired? ");
                            boolean isRet = sc.nextBoolean();
                            System.out.println();
                            passengers.get(pas).setRetired(isRet);
                        }
                    }
                    break;
//available wagons
                case 3:
                    for (int i = 0; i < train.size(); i++)
                        System.out.println(train.get(i).toString() + " ");
                    break;
//add wagon
                case 4:
                    Wagon wagon = null;
                    System.out.print("Choose wagon ID: ");
                    int waID = sc.nextInt();
                    System.out.println();
                    System.out.print("Choose wagon way: ");
                    String wayss = sc.nextLine();
                    System.out.println();
                    System.out.print("Choose max count of seats: ");
                    int seats = sc.nextInt();
                    System.out.println();
                    System.out.print("Choose the type of wagon: kupe, lux, public, restaurant, retired");
                    String otvet = sc.nextLine();
                    otvet.toLowerCase();
                    if (otvet.equals("kupe"))
                        wagon = new Kupe(waID, wayss, seats);
                    if (otvet.equals("lux"))
                        wagon = new Lux(waID, wayss, seats);
                    if (otvet.equals("public"))
                        wagon = new Public(waID, wayss, seats);
                    if (otvet.equals("restaurant"))
                        wagon = new Restaurant(waID, wayss, seats);
                    if (otvet.equals("retired"))
                        wagon = new RetiredWagon(waID, wayss, seats);
                    break;
//get wagon
                case 5:
                    System.out.print("Select wagon ID: ");
                    int IDay = sc.nextInt();
                    for (int i = 0; i < train.size(); i++) {
                        System.out.println(train.get(i).getId());
                    }
                    for (int i = 0; i < train.size(); i++) {
                        if (IDay == train.get(i).getId()) {
                            System.out.print(train.get(i).toString());
                        }
                    }
                    break;
// get passenger
                case 6:
                    System.out.print("Select passenger's ID: ");
                    for (int i = 0; i < passengers.size(); i++) {
                        System.out.print(passengers.get(i).getId() + " ");
                    }
                    System.out.println();
                    int uid = sc.nextInt();
                    for (int i = 0; i < passengers.size(); i++) {
                        if (uid == passengers.get(i).getId()) {
                            System.out.print(Vokzal.getPassengers(uid));
                        }
                    }
                    break;
//buy ticket
                case 7:
                    System.out.println("Select passenger (ID)");
                    for (int i = 0; i < passengers.size(); i++) {
                        System.out.print(passengers.get(i).getId() + " ");
                    }
                    int ID = sc.nextInt();
                    for (int i = 0; i < passengers.size(); i++) {
                        if (ID == passengers.get(i).getId()) {
                            System.out.print("Choose wanted wagon");
                            for (int j = 0; j < train.size(); j++) {
                                System.out.println(train.get(j).getId() + " ");
                            }
                            int waid = sc.nextInt();
                            for (int j = 0; j < train.size(); j++) {
                                if (waid == train.get(j).getId()) {
                                    Wagon selectedWagon = train.get(waid);
                                    System.out.print("Choose wanted seat: ");
                                    for (int l = 0; l < selectedWagon.getSeats(); l++) {
                                        System.out.print(l + " ");
                                    }
                                    int seat = sc.nextInt();
                                    for (int l = 0; l < selectedWagon.getSeats(); l++) {
                                        if (seat == l) {
                                            System.out.println("Ticket price: ");
                                            double price = sc.nextDouble();
                                            System.out.println();
                                            System.out.print("Ticket date: ");
                                            String date = sc.nextLine();
                                            System.out.println();
                                            System.out.print("Ticket ID: ");
                                            int tiid = sc.nextInt();
                                            System.out.println();
                                            Ticket ticket = new Ticket(tiid, price, date);
                                            Vokzal.buyTicket(ticket, passengers.get(ID));
                                            passengers.get(ID).setTicket(ticket);
                                            tickets.add(ticket);
                                            Vokzal.setTickets(tickets);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
// sell ticket
                case 8:
                    System.out.println("Select passenger (ID)");
                    for (int i = 0; i < passengers.size(); i++) {
                        System.out.print(passengers.get(i).getId() + " ");
                    }
                    int Id = sc.nextInt();
                    System.out.print("Are you sure?");
                    System.out.println();
                    String anss = sc.nextLine();
                    anss.toLowerCase();
                    if (anss.equals("yes")) {
                        for (Passenger value : passengers) {
                            if (Id == value.getId()) {
                                Ticket ticket = null;
                                ticket = passengers.get(Id).getTicket();
                                value.removeTicket();
                                Vokzal.sellTicket(ticket, value);
                                tickets.remove(Id);
                                Vokzal.removeTicket(tickets.get(Id));
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Nothing has chosen");
            }
            System.out.println(
                            "--------------------------------------------\n"+
                            "Pick one action below:" + "\n " +
                            "1) To add a new passenger;\n" +//yes
                            "2) To redactor a passenger;\n" +//yes
                            "3) To show all available wagons;\n" +//yes
                            "4) To add wagon;\n" +//yes
                            "5) To get wagon;\n" +//yes
                            "6) To get passenger;\n" + //yes
                            "7) To buy a ticket;\n" +//yes
                            "8) To cancel a purchase of the ticket.\n"+
                            "--------------------------------------------");//yes
                    selection = sc.nextInt();
                    break;
            }
        }
    }
