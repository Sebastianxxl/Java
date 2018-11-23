package oop.heroes;

public class Mage extends Hero {
    public Mage( String name, Integer energy, Integer life) {
        super(name, energy, life);
    }

    @Override
    public void takeDamage() {
        life--;
        energy++;

    }

    @Override
    public void attack() {
        energy -= 3;
    }
}
