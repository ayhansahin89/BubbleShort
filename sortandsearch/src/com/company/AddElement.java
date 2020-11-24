package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddElement {

    public ArrayList<Integer> addElement(){
        Instant start = Instant.now();
        List<Integer> array = new ArrayList<>();

        for (int i = 0 ; i<1000000 ; i++) {
            array.add(new Random().nextInt(1000000));
        }
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Random Dizi Oluşturulma Süresi : milisaniye : " + timeElapsed.toMillis() + " milisaniye");

        return (ArrayList<Integer>) array;
    }
}
