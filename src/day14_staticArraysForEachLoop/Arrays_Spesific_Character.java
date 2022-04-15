package day14_staticArraysForEachLoop;

import java.util.Arrays;

public class Arrays_Spesific_Character {
    public static void main(String[] args) {

        //1:
        String s="Java,I like Java?";
        String arr[]=s.split("");
        int counter=0;

        for (int i=0;i<arr.length;i++){
            if(arr[i].equals("a")){
                counter++;
            }
        }
        System.out.println("There is "+ counter+ " a in the array");//There is 4 a in the array
        System.out.println("**************");

        //2:
        String s2="Java, I like Java?";
        String arr2[]=s2.split("a");
        System.out.println("The number of the character: "+(arr2.length-1));//The number of the character: 4

        //String arr2[]=s2.split("a");
        System.out.println(Arrays.toString(arr2)); //[J, v, , I like J, v, ?]>>>  5 elements
        //because space is one less than number of elements.

        System.out.println("************");


        //3:
        int arr3[]={1,23,12,2,3};
        //Which code is correct to check if 12 is the element of the array or not?

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3)); //[1, 2, 3, 12, 23]
        System.out.println(Arrays.binarySearch(arr3,12));   //3  >>> 12 is 3th index in the arr3
        System.out.println(Arrays.binarySearch(arr3,5));  //-4 >>> because if 5 exist here,it must be 4th element
       // System.out.println(arr3[6]); //Index 6 out of bounds for length 5

        //4:
        char arrCh[]={'a','C','c','A','b'};
        Arrays.sort(arrCh);
        System.out.println(Arrays.toString(arrCh));  //[A, C, a, b, c]   Upper cases come before lower cases if you sort them

    }

}
