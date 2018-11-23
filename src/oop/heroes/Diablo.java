package oop.heroes;

public class Diablo extends Hero {
    public Diablo(String name, Integer energy, Integer life) {
        super(name, energy, life);
    }

    @Override
    public void takeDamage() {
        energy++;
        life--;
    }

    @Override
    public void attack() {
        energy -= 2;
    }
}
