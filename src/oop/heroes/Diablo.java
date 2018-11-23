package oop.heroes;

public class Diablo extends Hero {
    public Diablo(String name, Integer energy, Integer life) {
        super(name, energy, life);
    }

    @Override
    public void doTakeDamage() {
        energy++;
        life--;
    }

    @Override
    public void doAttack() {
        energy -= 2;
    }
}
