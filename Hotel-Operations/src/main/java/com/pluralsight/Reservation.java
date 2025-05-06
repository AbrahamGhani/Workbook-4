package com.pluralsight;

public class Reservation {

    String roomType;
    double price;
    int numNights;
    boolean isWeekend;

    public Reservation(String roomType, int numNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numNights = numNights;
        this.isWeekend = isWeekend;
    }

    public Reservation() {
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("king")){
            this.price = 139.00;
        }else if (roomType.equalsIgnoreCase("double")){
            this.price = 124.00;
        }
        if (isWeekend){
            this.price *= 1.1;
        }
        return price;
    }


    public int getNumNights() {
        return numNights;
    }

    public void setNumNights(int numNights) {
        this.numNights = numNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal(){
        return getPrice() * this.numNights;
    }


}
