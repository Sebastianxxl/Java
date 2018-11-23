package oop.heroes;

public class Warrior extends Hero {

    public Warrior(String name, Integer energy, Integer life) {

        super(name,energy, life);
    }

    @Override
    public void takeDamage() {
        life -= 3;
    }

    @Override
    public void attack() {
        energy--;
    }
}
