package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSort {


    public ArrayList<Integer> bubbleSort(ArrayList<Integer> arr )
    {
        Instant start = Instant.now();

        Integer n = arr.size();
        int temp = 0;
        boolean is_sorted;
        for (int i = 0; i < n; i++){
            is_sorted = true;
            for (int j = 1; j < (n-i); j++){
                if ( arr.get(j-1)  > arr.get(j))
                {
                    temp = arr.get(j-1);
                    arr.set(j-1,j);
                    arr.set(j,temp);
                    is_sorted = false;
                }
            }
            if (is_sorted) break;
        }

        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Bubblesort Süresi : milisaniye : " + timeElapsed.toMillis() + " milisaniye");

        return arr;
    }
}
