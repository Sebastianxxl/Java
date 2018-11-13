public class Data {
    public static void main(String[] args) {
        int myAge;
        myAge = 32;
        int anAge = myAge;
        float weight = 60.5f;
        double height = 356.6;
        long distance = 10023215225522l;
        char gender = 'm';
        char test = 9;
        boolean isStudent = false;
        boolean hasJob = true;
        int test2 = (int) weight;
        System.out.print(test);
        System.out.print(test2);
        String mesaj1 = "Hello";
        String mesaj2 = "Goodbye";
        String mesaj = mesaj1 + mesaj2;
        System.out.println(mesaj);

        double a = 5;
        int b = 2;
        double c = a / b;
        System.out.println(c);

        int x = 10;
        int y = ++x;
        System.out.println(y);

        boolean noMoreCoffe = false;
        if (noMoreCoffe) {
            System.out.println("Refill");
            System.out.println("Make coffee");
        }

        boolean happy = false;

        if (happy)
            System.out.println("Clap your hands");
        else {
            System.out.println("Don't worry");
        }

        boolean snowing = true;
        boolean raining = true;
        if (snowing) {
            System.out.println("Play with sow");
        } else if (raining) {
            System.out.println("Take your umbrella");
        } else {
            System.out.println("Stay home");
        }

        boolean i = false;
        boolean j = true;
        if (i =j) {
            System.out.println("Sunt egale");
        } else {
            System.out.println("Nu sunt egale");
        }

        int p = 0;
        while (p < 3) {
            System.out.println(p);
            p++;
        }


    }

}

