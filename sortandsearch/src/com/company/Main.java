package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Instant start;
        Instant end;



        BubbleSort b1 = new BubbleSort();
        AddElement ae = new AddElement();
        ArrayList<Integer> array = ae.addElement();
        b1.bubbleSort(array);

        start = Instant.now();

        BinarySearch ob = new BinarySearch();
        int arr[] = array.stream().mapToInt(i -> i).toArray();
        int n = arr.length;
        int x = 999999;
        int result = ob.binarySearch(arr, 0, n - 1, x);


        end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Binaryı Searcy Element bulma süresi : milisaniye : " + timeElapsed.toMillis() + " milisaniye");


        if (result == -1)
            System.out.println("Element bulunamadı");
        else
            System.out.println("Element şu indeks'te bulundu : " + result);


    }
}
