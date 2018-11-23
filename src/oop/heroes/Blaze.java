package oop.heroes;

public class Blaze extends Hero {

    public Blaze(String name,Integer energy, Integer life) {
        super(name, energy, life);
    }


    @Override
    public void takeDamage() {
        life--;
        energy++;

    }

    @Override
    public void attack() {
        energy -= 4;
    }
}
