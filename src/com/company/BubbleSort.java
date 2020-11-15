package com.company;

import java.util.LinkedList;

public class BubbleSort {
    void bubbleSort(LinkedList<Integer> arr )
    {
        Integer n = arr.size();
        for (Integer i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if ( arr.get(j)  > arr.get(j+1))
                {
                    // swap arr[j+1] and arr[j]
                    Integer temp = arr.get(j);
                    arr.add(j,arr.get(j+1));
                    arr.add(j+1,temp);
                }
    }
}
