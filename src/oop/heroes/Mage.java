package oop.heroes;

public class Mage extends Hero {
    public Mage( String name, Integer energy, Integer life) {
        super(name, energy, life);
    }

    @Override
    public void doTakeDamage() {
        life--;
        energy++;

    }

    @Override
    public void doAttack() {
        energy -= 3;
    }
}
