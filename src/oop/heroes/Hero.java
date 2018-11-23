package oop.heroes;

import java.security.InvalidParameterException;
import java.security.spec.InvalidParameterSpecException;

abstract public class Hero {
    protected String name;
    protected Integer energy;
    protected Integer life;
    protected Boolean isAlive;


    public Hero(String name, Integer energy, Integer life)
            throws InvalidParameterException {
        this.name = name;
        this.energy = energy;
        if (life <= 0){
            throw new InvalidParameterException();
        }
        this.life = life;
        this.isAlive = true;
    }

    public void takeDamage(){
        if (!isAlive) return;
        doTakeDamage();
    }
    abstract protected void doTakeDamage();

    public void attack(){
        if (!isAlive) return;
        doAttack();
    }
    abstract protected void doAttack();

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", life=" + life +
                '}';
    }
}

