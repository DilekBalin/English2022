package day14_staticArraysForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays05 {
    public static void main(String[] args) {


        //How to create an array and put elements in it one line
        int a[] = {12, 7, 0, 32};
        System.out.println(Arrays.toString(a)); //[12, 7, 0, 32]

        int b[] = {12, 7, 0, 32};
        System.out.println(Arrays.toString(b));  //[12, 7, 0, 32]

        //How to check if twoArrays are same or not
        //Note: If two arrays have same elements at the same indexes then array are same.

        Arrays.equals(a, b);
        boolean areArraysSame = Arrays.equals(a, b);
        System.out.println(areArraysSame);  //true

        //Type cod to check if 2 arrays have same elements
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            System.out.println("same arrays");
        } else System.out.println("different arrays");


        //Type code to check if a spesific element exists in an array or not

        int c[] = {-12, 21, 0, -2, 34};
        int num = 21;
        int counter = 0; //Flag is used to test if a part of code worked or not
        for (int w : c) {
            if (w == num) {
                System.out.println(num + " exists inside the array");
                break;

            }
        }
        if (counter ==0) {
            System.out.println(num + " does not exist");

        } else {
            System.out.println(num + " exists");

        }


    //Soru:
        char arr[]=new char[4];
        arr[0]='A';
        arr[2]='E';
        arr[3]='M';
        System.out.println(Arrays.toString(arr));//[A,  , E, M]>>>default of char is space



    }
}