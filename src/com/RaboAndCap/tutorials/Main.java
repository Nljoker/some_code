package com.RaboAndCap.tutorials;

public class Main {

    public static void main(String[] args) {
        Airplane airplane = new Airplane();

        airplane.loadPassengers(151);
        airplane.takeOff();
        System.out.println(airplane.isFlying());
        airplane.hitHome();
        System.out.println(airplane.hasLanded());
        airplane.unLoadPassengers();







        /*
        Rectangle rectangle1 = new Rectangle(3,10);
        Rectangle rectangle2 = new Rectangle(5,6);

        System.out.println(rectangle1.calculateSurface());
        System.out.println(rectangle2.calculateSurface());

        System.out.println(rectangle1.calculateCircumference());
        System.out.println(rectangle2.calculateCircumference());

        Rectangle rectangle = new Rectangle(3,10,"blue");

        System.out.println(rectangle.toString());

         */





        /*
        Account account1 = new Account(2000, "Rabobank", "NL33Rabo0135467758", "John");
        Account account2 = new Account(5000, "ABN AMRO", "NL33Rabo0135467758", "Jane");
        Account account3 = new Account(10000, "ING", "NL33INGB0135467758", "Peter");

        account1.addMoney(1000);
        System.out.println();
        account2.deductMoney(3000);
        System.out.println();
        account3.deductMoney(15000);

        System.out.println();

        account1.addMoney(1500);
        System.out.println();
        account1.deductMoney(100);
        System.out.println();
        account3.addMoney(5500);
        System.out.println();
        account2.deductMoney(142);

        System.out.println();

        account1.transferTo(500, account2);

         */






    }
}
