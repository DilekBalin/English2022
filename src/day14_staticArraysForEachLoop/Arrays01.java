package day14_staticArraysForEachLoop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        /*
        Java create arrays structure to be able to store multiple data in same data int,String...
        You can store(saklamak) multiple data in an array,  but they should be in the same
        to create an array ,you must inform Java about the number of data you want to store in the array
           */

        //You can not store non-primitive data types in an array
        //Arrays are for storing primitive data types and references
       // String arrSt[]="Ali","Can"}  >> Java put Ali and Can's referanses in to Array


        int myArray[] = new int[5];  // 5 is array's length.

        //How to print an array on the console?
        System.out.println(Arrays.toString(myArray));  //[0, 0, 0, 0, 0]  >> default value, comma and space

        //how to assing a value to a spesific array element
        myArray[1] = 11;
        System.out.println(Arrays.toString(myArray));  // [0, 11, 0, 0, 0]

        myArray[3] = 21;
        System.out.println(Arrays.toString(myArray));  // [0, 11, 0, 21, 0]

        myArray[4] = 1;
        System.out.println(Arrays.toString(myArray));  // [0, 11, 0, 21, 1]

        myArray[0] = 41;
        myArray[2] = 31;
        System.out.println(Arrays.toString(myArray));  // [41, 11, 31, 21, 0]


        //How to print a spesific eleemnt on the onsole
        System.out.println(myArray[2]); //31

        //How to get the number of elements in an array
        System.out.println(myArray.length);//5
        //we don't use panathesises after length


        //Print the sum of the first and the last element in an array on the console
        int firstElement = myArray[0];
        int lastElement = myArray.length - 1;
        int sum = firstElement + lastElement;
        System.out.println("Sum= " + sum);


        //find teh sum off all elements in an array

        //1.Way:Use for loop
        int sum2 = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum2 += myArray[i];
        }
        System.out.println("Sum all elements " + sum2);  //105
        System.out.println("***************");


        //2.Way: Use for -each-loop
        int sum3=0;
        for(int w : myArray){
            sum3+=w;


        }
        System.out.println("With for-each= "+sum3);
    }

}