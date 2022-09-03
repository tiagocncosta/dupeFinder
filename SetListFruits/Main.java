package SetListFruits;


import SetListFruits.Apple;
import SetListFruits.Orange;
import SetListFruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(1);

        List<Fruit> fruits = Arrays.asList(
                apple,
                new Apple(1),
                new Orange(3),
                new Orange(2), // DUPE
                new Orange(2),
                new Apple(2),
                apple, // DUPE
                new Orange(3), // DUPE
                new Orange(3), // DUPE
                new Orange(4)
        );

        DupeFinder<Fruit> dupeFinder = new DupeFinder<>(fruits);
        System.out.println(dupeFinder.checkDupes());

        printSeparator("-",20);

        for (Fruit fruit : dupeFinder.getDupes()) {
            System.out.println(fruit);
        }

        printSeparator("-",20);

        for (Fruit fruit : dupeFinder.sortedDupes()) {
            System.out.println(fruit);
        }
    }

    private static void printSeparator(String separator, int times){
        IntStream.rangeClosed(0,times).forEach(a -> System.out.print(separator));
        System.out.println("");
    }


}
