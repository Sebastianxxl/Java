package oop.person;

public class PersonTest {
    public static void main(String[] args) {
        Person vito = new Person("Don Vito", 100);
        Person sony = new Person("Supersonic", 200);
        Child alex = new Child("ALex", 50);

        System.out.println("Alex " + alex);
        System.out.println(vito);
        System.out.println(sony);

        alex.run();
        alex.sleep();
        alex.showEnergy();

        vito.run();
        vito.run();
        vito.run();
        vito.showEnergy();
        vito.sleep();
        vito.showEnergy();

        for (int i=0; i<5; i++){
            sony.run();
        }
        sony.showEnergy();
    }
}
