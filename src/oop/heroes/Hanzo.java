package oop.heroes;

public class Hanzo extends Hero {
    public Hanzo(String name, Integer energy, Integer life) {
        super(name, energy, life);
    }

    @Override
    public void takeDamage() {
        energy++;
        life--;
    }

    @Override
    public void attack() {
        energy -= 5;
    }
}
