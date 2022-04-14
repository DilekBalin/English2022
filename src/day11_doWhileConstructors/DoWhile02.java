package day11_doWhileConstructors;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        /*Ask user to enter an integer
        If the integer isless than 100,tell user "Won!"
        Otherwise ,tell user "Lost!"
         */

        //When you create a game do while is best action
        Scanner scan = new Scanner(System.in);

        int n=0;  //it is a container
        //eger bunu loop body`sinin icinde yaparsak her sferinde yeni bir container olusturur bu da stack memory hafizasini dolduuru
        //ve zamanla error verir.

        do {
            System.out.println("Enter an integer: ");  //if you want to repeat something they must  be inside loop body
            n=scan.nextInt();
            if (n<100);
            System.out.println("Won!");

        }while (n<100);
        System.out.println("Lost!");
    }
}

