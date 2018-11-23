package oop.heroes;

public class BattleTest {
    public static void main(String[] args) {

        Warrior batman = new Warrior ("Batman",10,10);
        Mage joker = new Mage ("Joker", 8,0);
        Blaze spiderman = new Blaze ("Spiderman", 15, 14);
        Diablo wolverine = new Diablo ("Wolverine",20,17);
        Hanzo thor = new Hanzo ("Thor",23,19);

        System.out.println(batman);
        System.out.println(joker);
        System.out.println(spiderman);
        System.out.println(wolverine);
        System.out.println(thor);

        System.out.println("-------");

        battle(batman, joker);
        battle(wolverine, thor);
        battle(spiderman, joker);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void battle(Hero aHero, Hero anotherHero) {
        aHero.attack();
        anotherHero.takeDamage();
        System.out.println(aHero);
        System.out.println(anotherHero);


        anotherHero.attack();
        aHero.takeDamage();
        aHero.attack();
        anotherHero.takeDamage();
    }
}
