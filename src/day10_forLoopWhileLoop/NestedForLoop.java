package day10_forLoopWhileLoop;

public class NestedForLoop {
    public static void main(String[] args) {


        //1.Example: Type 3 times Hello1 for 1, 3 times Hello2 for 2,3 times Hello3 for3, 3 times Hello4 for 4 on the console

        for (int i = 0; i < 5; i++) {

            for (int k = 0; k < 4; k++) {
                System.out.println("Hello" + i);
                System.out.println();
            }
        }


        System.out.println();
   /*2.Example: Type code to get the output like

   Week:1
   Day 1:
   Day2:
   Day3:
   ....

    Week:2
   Day 1:
   Day2:
   Day3:
   ....

    Week:3
   Day 1:
   Day2:
   Day3:
   ....
    */

        for (int i = 1; i < 4; i++) {
            System.out.println("Week" + i);

            for (int k = 1; k < 4; k++) {
                System.out.println("Day" + k);

            }

        }

        /*
         Write a Jaa Program to print Rectangle Star Pattern using For Loop

         ****
         ****
         ****


         */

        for (int i = 0; i < 4; i++) {
            for (int k = 1; k < 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        6.Example: Type code too get the output like

        1
        12
        123
        1234
        12345

       */

        int rows=5;

        for (int i=1;i<6;i++){
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }


    }
}


