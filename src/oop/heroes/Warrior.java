package oop.heroes;

public class Warrior extends Hero {

    public Warrior(String name, Integer energy, Integer life) {

        super(name,energy, life);
    }

    @Override
    public void doTakeDamage() {
        life -= 3;
    }

    @Override
    public void doAttack() {
        energy--;
    }
}
