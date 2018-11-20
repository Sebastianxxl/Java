package oop.car;

public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.fuel = 60;
        bmw.fuelComsumption = 8;
        bmw.started = false;

        Car dacia = new Car();

        System.out.println(bmw.range ());

        bmw.start();
        bmw.drive(180);
        System.out.println(bmw.range ());
        bmw.drive(600);

        System.out.println(bmw.fuel);
        System.out.println(bmw.range ());

        bmw.wheels = 3;
        System.out.println(bmw.wheels);
        System.out.println(dacia.wheels);
    }
}
