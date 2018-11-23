package oop.heroes;

public class Hanzo extends Hero {
    public Hanzo(String name, Integer energy, Integer life) {
        super(name, energy, life);
    }

    @Override
    public void doTakeDamage() {
        energy++;
        life--;
    }

    @Override
    public void doAttack() {
        energy -= 5;
    }
}
