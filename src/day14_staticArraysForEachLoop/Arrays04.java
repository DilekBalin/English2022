package day14_staticArraysForEachLoop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //interwiev question:

        // [0, 2, 3, 0, 12, 0]   put the zeros to the end

        int arr1[]={0,2,3,0,12,0};
        int arr2[]=new int[6];

        int a=0;

        for (int i=0;i<arr1.length;i++){
            if(arr1[i]!=0){
                arr2[a]=arr1[i];
                a++;
            }

        }
        System.out.println(Arrays.toString(arr2)); //[2, 3, 12, 0, 0, 0]


    }

}
