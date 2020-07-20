package com.RaboAndCap.tutorials;

public class Airplane {

    public int maxPassengers = 150;
    public int passengersOnPlane;

    public int getPassengersOnPlane() {
        return passengersOnPlane;
    }

    public void setPassengersOnPlane(int passengersOnPlane) {
        this.passengersOnPlane = passengersOnPlane;
    }



    public Airplane() {
    }

    public void loadPassengers(int passengers) {
        if (passengers > maxPassengers) {
            int tooMuch = passengers - maxPassengers;
            passengersOnPlane = passengers - tooMuch;
            System.out.println("Sorry, but we couldn't board " + tooMuch + " passengers on the plane. They'll have to wait");
            System.out.println("The other " + passengersOnPlane + " will depart shortly");
        } else {
            passengers = passengersOnPlane;
            System.out.println("The plane will depart with " + passengers + "shortly");
        }
    }

    public void takeOff() {
        System.out.println("The plane is now taking off");
        isFlying();
    }

    public boolean isFlying() {
        return true;
    }

    public void hitHome() {
        System.out.println("The plane is now landing");
        hasLanded();
    }

    public boolean hasLanded() {
        return true;
    }

    public void unLoadPassengers() {
        if (hasLanded()) {
            passengersOnPlane = 0;
            System.out.println("The plane has landed and unboarding has started, remaining passengers is now " + passengersOnPlane);
        } else {
            System.out.println("can't unboard, will have to wait until landing");
        }
    }


}
