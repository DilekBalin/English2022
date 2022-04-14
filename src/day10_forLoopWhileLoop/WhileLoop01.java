package day10_forLoopWhileLoop;

import java.util.Scanner;

public class WhileLoop01 {   public static void main(String[] args) {
    //1.Example: Type code to print "Hello!" 5 times on the console
    for (int i = 1; i < 6; i++) {
        System.out.println("Hello");
    }

    System.out.println();
    //2.Way :
    int i = 1; //We have to put the starting value before while
    while (i < 6) {  //The condition will beinside the parantez
        System.out.println(" Hello!");
        i++;   //increment or decrement will be at teh end of the while body

    }
    System.out.println();


    //2.Exam: type code to print odd integers from 12 to 67 in the same line with a space between them

    int j = 12;   //starting value
    while (j < 68) {    //condition
        if (j % 2 == 0) {

            System.out.print(j + " ");
        }
        j++;   //increment
    }
    System.out.println();
    //3.Example:  Type code to find the sum of integers from 12 to 67

    int k = 12;
    int sum = 0;
    while (k < 68) {
        sum = sum + k;
        k++;
    }
    System.out.println("sum of digits=" + sum);
    System.out.println();

    //4.Example:  type Java code by using while loop
    //Write a programe that prompts the user to iput an integer
    //It should then find the sum of the digits of that number
    //123 ==> 1+2+3=6

    Scanner scan = new Scanner(System.in);
    System.out.print("enter an integer=");
    int num = scan.nextInt();
    int sumOfDigits = 0;
    while (num > 0) {
        sumOfDigits = sumOfDigits + num % 10;
        num = num / 10;

    }
    System.out.println(sumOfDigits);
    System.out.println();


    /* type Java code by using while loop,
    Write a prograam that ptomps the user to input a number
    It should then print the multiplication table of that number

       3x1=3   3x2=6     3x3=9     3x4=12      3x5=15     3x6=18      3x7=21     3x8=24  3x9=30  3x10=10

       */

    int n=3;  //outer
    int m=1;  //inter

    while(m<11){
        System.out.println(n+"x"+m+"="+n*m);
        m++;
    }

}
}

