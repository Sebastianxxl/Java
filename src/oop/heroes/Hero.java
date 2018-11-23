package oop.heroes;

abstract public class Hero {
    protected String name;
    protected Integer energy;
    protected Integer life;



    public Hero(String name, Integer energy, Integer life) {
        this.name = name;
        this.energy = energy;
        this.life = life;
    }

    abstract public void takeDamage();

    abstract public void attack();


    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", life=" + life +
                '}';
    }
}

