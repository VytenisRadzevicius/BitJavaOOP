package com.vytenisr.app;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {
        // Namų darbai: Masyvai
        System.out.println("Iveskite masyvo dydi:");
        Scanner myObj = new Scanner(System.in);
        int size = myObj.nextInt();

        int []arr = new int[size];
        int []arrb = new int[size];

        System.out.println("Iveskite duomenis (" + (size) + "):");
        for(int i = 0; i < size; i++ ) {

            arr[i] = arrb[i] = myObj.nextInt();
        }
        System.out.print("Masyvas: ");
        System.out.println(Arrays.toString(arr));

        int sum = 0;

        for (int element : arr)
        {
            sum += element;
        }
        System.out.print("Suma: ");
        System.out.println(sum);

        double avg = (double) sum / size;
        System.out.print("Vidurkis: ");
        System.out.println(avg + "\n");

        System.out.print("Bubblesort: ");
        int counterIterations = 0;
        int counterSwaps = 0;
        for (int i = 0; i < size - 1; i++)
        {
            for (int j = 0; j < size - i - 1; j++)
            {
                counterIterations++;
                if (arr[j] > arr[j + 1]) {
                    counterSwaps++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Bubblesort iteracijos: " + counterIterations);
        System.out.println("Bubblesort keitimai: " + counterSwaps + "\n");

        System.out.print("Selectionsort: ");
        counterIterations = 0;
        counterSwaps = 0;
        for (int i = 0; i < size - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < size; j++)
            {
                counterIterations++;
                if (arrb[j] < arrb[min])
                {
                    min = j;
                }
            }
            counterSwaps++;
            int temp = arrb[min];
            arrb[min] = arrb[i];
            arrb[i] = temp;
        }
        System.out.println(Arrays.toString(arrb));
        System.out.println("Selectionsort iteracijos: " + counterIterations);
        System.out.println("Selectionsort keitimai: " + counterSwaps);
    }
}