package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Instant start;
        Instant end;

        //Random array created and filled
        AddElement ae = new AddElement();
        ArrayList<Integer> array = ae.addElement();

        //Bubble sort created and run
        BubbleSort b1 = new BubbleSort();
        b1.bubbleSort(array);

        //Binary search timer started
        start = Instant.now();
        //Binary search created and run
        BinarySearch bs = new BinarySearch();

        //Lambda function java8
        //Stream opened to convert arraylist to the default array
        int arr[] = array.stream().mapToInt(i -> i).toArray();
        int n = arr.length;

        //Intended value to be found
        //Change x value to find intended value
        int x = 999999;

        //Binary search is started below
        int result = bs.binarySearch(arr, 0, n - 1, x);

        end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Binaryı Searcy Element bulma süresi : milisaniye : " + timeElapsed.toMillis() + " milisaniye");


        if (result == -1)
            System.out.println("Element bulunamadı");
        else
            System.out.println("Element şu indeks'te bulundu : " + result);


    }
}
