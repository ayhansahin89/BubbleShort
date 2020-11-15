package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import  java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> sayilar = new LinkedList<Integer>();

        Integer i;
        for (i = 1; i <=100; i++) {
            Random r=new Random(); //random sınıfı
            int a=r.nextInt(1000000);
            sayilar.add(a);
        }
        //sayilar.add(300,5656);

        Instant start = Instant.now();
        long startTime = (long) Instant.now().getNano();

        BubbleSort ob = new BubbleSort();
        ob.bubbleSort(sayilar);
        Instant end = Instant.now();
        long estimated = (long)Instant.now().getNano() - startTime;
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Dizi Oluşturulma Süresi : milisaniye : " + timeElapsed.toMillis() + " milisaniye");
        System.out.println("Dizi Oluşturulma Süresi : nanosaniye : " + estimated + " nanosaniye");


        for (Integer num : sayilar)
        {
            System.out.println("Sayı " + num);
        }
        /*
        BinarySearch ob = new BinarySearch();

        Integer n = sayilar.size();
        int x = 5656;
        int result = ob.binarySearch(sayilar, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);


        System.out.println("Sayı ");*/



    }
}
