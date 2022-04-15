package day17_multidimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {


        //How to create multidimensional array
        int mda1[][]=new int[3][2];

        //How to print multidimensional array on the console
        System.out.println(Arrays.deepToString(mda1));  //[[0, 0], [0, 0], [0, 0]]

        //How to assign values
        mda1[0][1]=9;
        System.out.println(Arrays.deepToString(mda1));   //[[0, 9], [0, 0], [0, 0]]

        mda1[2][1]=5;
        System.out.println(Arrays.deepToString(mda1));  //[[0, 9], [0, 0], [0, 5]]

        mda1[0][0]=11;
        mda1[1][0]=5;
        mda1[1][1]=4;
        mda1[2][1]=21;
        System.out.println(Arrays.deepToString(mda1));//[[11, 9], [5, 4], [0, 21]]

        //How to crete multidimensional array in short way
        int mda2[][]={{2,3},{12},{21,34,56},{4}};
        System.out.println(Arrays.deepToString(mda2));//[[2, 3], [12], [21, 34, 56], [4]]

        //How to print a spesific inner array on the console?
        System.out.println(Arrays.toString(mda2[2])); //[21, 34, 56]// we used tostring because we want to normal array not diemensional aray

        //How to find the number of elements in a multidiemensional array
        //Example:  [[2, 3], [12], [21, 34, 56], [4]] >>>> > 7
        int sum=0;
        for(int []w: mda2){
            sum+=w.length;//first element length=2, 2ndlength=1, 3th length=3,4th length=1

        }
        System.out.println(sum);//7


    }
}
