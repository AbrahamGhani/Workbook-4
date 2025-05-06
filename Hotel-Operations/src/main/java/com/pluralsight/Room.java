package com.pluralsight;

public class Room {
    int numBeds;
    double price;
    boolean isOccupied;
    boolean isDirty;
    boolean isAvailable;

    public Room(int numBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.numBeds = numBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public Room() {
    }

    public int getNumBeds() {
        return numBeds;
    }

    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable() {
        if (!isOccupied && !isDirty){
            isAvailable = true;
        }else {
            isAvailable = false;
        }
    }

    public void checkIn(){
        if(isAvailable){
            isOccupied = true;
            isAvailable = false;
            isDirty = true;
        }
    }


    public void checkOut(){
        isOccupied = false;
    }

    public void cleanRoom(){
        isDirty = false;
        if (!isOccupied) {
            isAvailable = true;
        }
    }

}
