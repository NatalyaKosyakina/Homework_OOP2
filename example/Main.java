package org.example;

import java.lang.reflect.Array;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5);
        Plate plate1 = new Plate(50);
        plate1.info();

        Cat cat2 = new Cat("Murzik", 15);
        Cat cat3 = new Cat("Snejinka", 13);
        Cat cat4 = new Cat("Frederica", 7);
        Cat cat5 = new Cat("Pushok", 17);

        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};
        for (Cat somecat: cats) {
            somecat.eat(plate1);
        }
        plate1.info();
    }
}