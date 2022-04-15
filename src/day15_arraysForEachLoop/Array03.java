package day15_arraysForEachLoop;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {


        //How to check an element if it exists in array or not
        int arr[]={1,2,3,4,5};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,3)); //2>>>>   //it will give us it's index
        System.out.println(Arrays.binarySearch(arr,9));  //it will give us it's index //-6

        /*
        binarySearch() method returns  the index of existing element
        binarySearc(0 method returns the order number with negative sign for non-existing elements
        To use binrySearch() method you have to use sort() method otherwise the output will nut be meaningful
        don't use binarySearch for repeted eleemnts,it doesn't give correct answer everytime

         */
            }
        }



