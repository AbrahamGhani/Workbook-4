package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // Test Room
        Room rm = new Room(2, 124.0, false, true, false);
        rm.setAvailable();  // Based on occupied and dirty status
        System.out.println("Room available? " + rm.isAvailable());

        rm.cleanRoom();
        rm.setAvailable();
        System.out.println("Room cleaned. Available? " + rm.isAvailable());

        rm.checkIn();
        System.out.println("Room checked in. Occupied? " + rm.isOccupied());

        rm.checkOut();
        System.out.println("Room checked out. Occupied? " + rm.isOccupied());

        // Test Reservation
        Reservation reserve = new Reservation("King", 3, true);
        System.out.println(String.format("Reservation total: $%.2f",reserve.getReservationTotal()));

        // Test Employee
        Employee employee = new Employee(1235412, "Gabe", "Software Development", 120, 45);
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());
        System.out.println("Total pay: $" + employee.getTotalPay());

        // Test Hotel
        Hotel hotel = new Hotel("Sunset Inn", 5, 20);
        System.out.println("Available suites: " + hotel.getAvailableSuites());
        System.out.println("Available basic rooms: " + hotel.getAvailableRooms());

        boolean suiteBooked = hotel.bookRoom(2, true);
        System.out.println("Suite booked? " + suiteBooked);
        System.out.println("Available suites after booking: " + hotel.getAvailableSuites());

        boolean roomBooked = hotel.bookRoom(3, false);
        System.out.println("Basic rooms booked? " + roomBooked);
        System.out.println("Available basic rooms after booking: " + hotel.getAvailableRooms());

        // Test hotel full capacity denial
        boolean overbookAttempt = hotel.bookRoom(100, false);
        System.out.println("Overbook attempt success? " + overbookAttempt);

    }
}