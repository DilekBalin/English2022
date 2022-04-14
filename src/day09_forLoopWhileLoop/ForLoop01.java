package day09_forLoopWhileLoop;

public class ForLoop01 {
    public static void main(String[] args) {
        //1.Example:  Type code to print 5 times "Hello" on the console


        //  1.Way: not recommended  a)Repetition  b)For Larger number
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println();


        //2.Way:For repeted actions Java created a structure which is loops
        //There 4 different loop structure in Java:
        //a)for Loop    b)While-loop c) do-while-loop  d)for-each-loop

        //for loop:
        //starting value
        //condition
        //ending value

        System.out.println("=======");

        for (int i = 1; i < 6; i++) { //firs part,we started account  //second part:we will have to tell to Java stop somewhere
            //3rd part is increase it by one
            System.out.println("Hello!");

            //java started 1 and then if condition is true Java will print once time "Hello"
            //and then Java gos back to 3rd part and java inreases the account
            //again started 2 and then java will work like before until condition doesen't work.
            //if condition is false java won't enter for body and for loop is broken

            //2.Example:
            //Type all integers from 11 to 44 in thr same line with a space between consecutive(ardısık) integers

        }

        for (int i = 11; i < 45; i++) {
            System.out.print(i + " ");

        }

        System.out.println("=====================");


        //3.Example: Type even integers from 11 to 44 in the same line with a space between consecutive(ardısık) integers


        for (int i = 11; i < 45; i += 1) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println("=====================");


        //4.Example: Type odd integers from 68 to 13 in the same line with a space between consecutive(ardısık) integers

        for (int i =68;i >12;i--){
            if(i%2!=0)
                System.out.print(i+" ");
        }

        System.out.println("===================");
        //5.Example:Type all which are divisible by 4 and divisible by 6
        // from 120 to 11 in the same line with a space between consecutive(ardısık) integers

        for (int i=120;i>10;i--){
            if(i%4==0&&i%6==0){
                System.out.print(i+" ");
            }
        }

    }
}
