package com.RaboAndCap.tutorials;

public class CargoPlane extends Airplane {
    private final int maxPassengers = 0;
    private final int maxCapacityInTons = 20;
    private int cargoInTons = 1;
    private int cargoOnPlane;

    public CargoPlane(String name) {
        super(name);
    }

    @Override
    public void loadPassengers(int passengers) {
        System.out.println("Only cargo is allowed on this flight");
    }

    public void loadCargo(int toLoadCargo) {
        if (maxCapacityInTons > 20) {
            int leftOverCargo = toLoadCargo - maxCapacityInTons ;
            System.out.println("Sorry, to much cargo. We'll only be taking " + leftOverCargo);
        } else {
            System.out.println("The plane has loaded " + toLoadCargo);
            cargoOnPlane = toLoadCargo;
        }

    }
}
