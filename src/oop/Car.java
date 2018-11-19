package oop;

public class Car {
    float fuel;
    float fuelComsumption;
    boolean started;
    static Integer wheels = 4;



    public void start () {
        started = true;
    }

    public void drive (int distance) {
        if (distance > range ()) {
            System.out.println(distance - range() + " left");
        }
        fuel -= fuelComsumption * distance / 100;
        if (fuel < 0){
            fuel = 0f;
        }
    }

    public Float range () {return null; }

}
