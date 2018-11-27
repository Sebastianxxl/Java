package oop.streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;


public class Read {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/oop/streams/numbers.txt"));
            String numar;
            while ((numar = reader.readLine()) != null) {
                System.out.println(numar);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
