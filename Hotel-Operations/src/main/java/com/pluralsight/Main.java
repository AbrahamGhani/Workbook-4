package com.pluralsight;

public class Main {
    public static void main(String[] args) {

    Room rm = new Room(2,124,true,true,false);

    rm.setOccupied(false);
    rm.setDirty(false);
    rm.setAvailable(true);


    Reservation reserve = new Reservation("King",3,true);

        System.out.println(reserve.getReservationTotal());

Employee employee = new Employee(1235412,"Gabe","Software Development Team", 120,45);


        System.out.println(employee.getRegularHours());
        System.out.println(employee.getOvertimeHours());
        System.out.println(employee.getTotalPay());

    }
}