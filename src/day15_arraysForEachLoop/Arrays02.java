package day15_arraysForEachLoop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Check if the array elements are in the naturel order
        //"Ali", "Beyhan", "Ceyhan" >>>>true,
        //"Ali", "Ceyhan", "Beyhan" >>>>> false

        String srr[] = {"Ali", "Ceyhan", "Beyhan"};
        //create a new aray and put the elements into the new array

        String trr[] = new String[3];//[null, null ,null]
         for (int i=0;i<srr.length;i++) {
            trr[i]=srr[i];
        }
        System.out.println("before sort= "+Arrays.toString(trr));//[Ali, Ceyhan, Beyhan]

        Arrays.sort(trr);
        System.out.println("after sort= "+Arrays.toString(trr));//[Ali, Beyhan, Ceyhan]
        if(Arrays.equals(srr,trr)){
            System.out.println("Array elements in naturel order");
        }else System.out.println("Array elemnts aren't naturel order");

    }
}