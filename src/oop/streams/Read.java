package oop.streams;

import java.io.FileInputStream;

public class Read {
    public static void main(String[] args) {
        try {
            FileInputStream stream = new FileInputStream("number.txt");

            int numar;
            while((numar = stream.read())!= -1) {
                System.out.println(numar);
            }

            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
