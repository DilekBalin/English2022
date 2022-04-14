package day11_doWhileConstructors;

import java.util.Scanner;

public class DoWhile03 {
    public static void main(String[] args) {
        /*User name is "admin" , Pasword is "pwd123"
        Ask user to enter username and password
       user should see "Enter your user name and password"mesage 3 times
       if he enters correct credentials he shoul get "You are in account!"
        After 3 times he should get "Your account is blocked"
         */

        Scanner scan = new Scanner(System.in);
        String username = "";    //container
        String password = "";   //container

        int counter = 0;

        do {     //We have to put in do body ask because we have to ask him 3 times

            if (counter == 3) {
                System.out.println("Your account is blocked");
                break;
            }

            System.out.print("Enter your username:");
            username = scan.nextLine();
            System.out.print("Enter your password:");
            password = scan.next();

            if (username.equals("admin") && password.equals("pwd123")) {
                System.out.println("You are in your account");
                break;
            }
            counter++;
        } while (counter < 3);


    }
}



