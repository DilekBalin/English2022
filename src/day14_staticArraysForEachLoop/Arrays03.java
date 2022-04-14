package day14_staticArraysForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {

        //Create an Array by getting array elements from user

        Scanner scan=new Scanner (System.in);
        System.out.println("How many elements will you store inside the array?");  //user saw my message
        int len=scan.nextInt(); //for example 3

        String sArray[]=new String[len];
        System.out.println(Arrays.toString(sArray));  //[null, null, null]> if elemets are 3

        for(int i=0;i<len;i++){
            System.out.println("Enter a String"); //user gave "Ali"
            String el=scan.next();   //sArray[i]=scan.next();
            sArray[i]=el;  //Ali assigned into zero index of array  >>Ali is first element

             }


        System.out.println(Arrays.toString(sArray)); //[ali, can, veli]

    }
}
