package SetListFruits;

import java.lang.reflect.Array;
import java.util.*;

public class Main2 {


    public static void main(String[] args) {

        Map<String, String> database = new HashMap<>();

        database.put("dog", "blue");
        database.put("bird", "yellow");
        database.put("cat", "blue");
        database.put("cow", "brown");

        for (Map.Entry entrada : database.entrySet()){
            System.out.println(entrada.getValue());
            System.out.println("____________");
            System.out.println(entrada.getKey());
        }




    }
}
      /* System.out.println(database.getOrDefault("dog", 2));
        System.out.println(database.get("dog"));
        database.entrySet().forEach(stringStringEntry -> {
            System.out.println("Key -> " + stringStringEntry.getKey());
            System.out.println("Value -> " + stringStringEntry.getValue());
        });

        database.keySet().forEach(System.out::println);
        database.keySet().forEach(key -> System.out.println("Key:" + key));

        for (String k : database.keySet()){
            System.out.println(k);
        }
*/