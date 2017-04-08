package com.epam.task2.main;

import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

import com.epam.task2.sort.Sorter;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------Sort test----------------");
        System.out.println("Selection sort:");
        int[] arr1 = new int[25];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ThreadLocalRandom.current().nextInt(0, 50);
        }
        Sorter.selectionSort(arr1, true);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        Sorter.selectionSort(arr1, false);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Insert sort:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ThreadLocalRandom.current().nextInt(0, 50);
        }
        Sorter.insertionSort(arr1, true);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        Sorter.insertionSort(arr1, false);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Bubble sort:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ThreadLocalRandom.current().nextInt(0, 50);
        }
        Sorter.bubbleSort(arr1, true);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        Sorter.bubbleSort(arr1, false);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Quick sort:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ThreadLocalRandom.current().nextInt(0, 50);
        }
        Sorter.quickSort(arr1, true);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        Sorter.quickSort(arr1, false);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------Performance test----------------");
        System.out.println("Selection sort:");
        arr1 = new int[10000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ThreadLocalRandom.current().nextInt();
        }
        long time = System.nanoTime();
        Sorter.selectionSort(arr1, true);
        time = System.nanoTime() - time;
        System.out.println("Sort time nanos = " + time);
        System.out.println("Insert sort:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ThreadLocalRandom.current().nextInt();
        }
        time = System.nanoTime();
        Sorter.insertionSort(arr1, true);
        time = System.nanoTime() - time;
        System.out.println("Sort time nanos = " + time);
        System.out.println("Bubble sort:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ThreadLocalRandom.current().nextInt();
        }
        time = System.nanoTime();
        Sorter.bubbleSort(arr1, true);
        time = System.nanoTime() - time;
        System.out.println("Sort time nanos = " + time);
        System.out.println("Quick sort:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ThreadLocalRandom.current().nextInt();
        }
        time = System.nanoTime();
        Sorter.quickSort(arr1, true);
        time = System.nanoTime() - time;
        System.out.println("Sort time nanos = " + time);
        System.out.println("-----------------Generic sorts-----------------:");
        System.out.println("COMPARABLE");
        String[] strArray = {"ewqwa", "wqwe", "waadasdf", "dglk", "waa"};
        System.out.println("Selection sort:");
        Sorter.selectionSort(strArray, true);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        Sorter.selectionSort(strArray, false);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("Insertion sort:");
        Sorter.insertionSort(strArray, true);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        Sorter.insertionSort(strArray, false);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("Bubble sort:");
        Sorter.bubbleSort(strArray, true);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        Sorter.bubbleSort(strArray, false);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("Quick sort:");
        Sorter.quickSort(strArray, true);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        Sorter.quickSort(strArray, false);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        Sorter.quickSortFromTo(strArray, 2, 4, true);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("COMPARATOR");
        Comparator<String> strComp = new Comparator<String>() {
            @Override
            public int compare(String arg0, String arg1) {
                int result;
                if (arg0.length() > arg1.length()) {
                    result = 1;
                } else  if (arg0.length() < arg1.length()) {
                    result = -1;
                } else {
                    result = 0;
                }
                return result;
            }          
        };
        System.out.println("Selection sort:");
        Sorter.selectionSort(strArray, strComp, true);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        Sorter.selectionSort(strArray, strComp, false);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("Insertion sort:");
        Sorter.insertionSort(strArray, strComp, true);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        Sorter.insertionSort(strArray, strComp, false);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("Bubble sort:");
        Sorter.bubbleSort(strArray, strComp, true);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        Sorter.bubbleSort(strArray, strComp, false);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("Quick sort:");
        Sorter.quickSort(strArray, strComp, true);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        Sorter.quickSort(strArray, strComp, false);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        Sorter.quickSortFromTo(strArray, strComp, 2, 4, true);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
