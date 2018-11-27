package primeleLecti;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int state = 0;

        if (state == 0) {
            System.out.println("Descarcata");
         if (state == 1) {
             System.out.println("Incarcat Partial");
             if (state == 2) {
                 System.out.println("Incarcat");
             } else {
                 System.out.println("Eroare");
             }
         }
    }
        switch (state)

    {
        case 0:
            System.out.println("Descarcata");
            break;
        case 1:
            System.out.println("Incarcat Partial");
            break;
        case 2:
            System.out.println("Incarcat");
            break;
        default:
            System.out.println("Eroare");
    }



                int ora;
                System.out.println("Introdu ora: ");
                Scanner reader = new Scanner(System.in);
                ora = reader.nextInt();

                String mesaj;
                if (ora < 12) {
                    mesaj = "Neata";
                } else {
                    mesaj = "Salut";
                }
                mesaj = (ora < 12) ? "Neata!" : "Salut";
                System.out.println(mesaj);





    }
}
