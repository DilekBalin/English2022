package day11_doWhileConstructors;

public class DoWhile01 {
    public static void main(String[] args) {
        //What is the difference between while loop and do-while loop?
        //In while loop, the codes inside the loop body are not executed sometimes
        //It means ,zero execution is possible in while loop
        int i = 1;
        while (i < 1) {    //Think first than execute(uygulamak)
            System.out.println("Hello!"); //We can't see anything in the console
            i++;
        }

        ///do -while
        //in do-while loop,the codes inside to the body are executed at least once
        //It means zero executaion is impossible in do-while loop
        Integer k=1;    //starting value
        do{
            System.out.println("Hello!");    // do first then check the condition
            k++; //increment or decrement
        } while (k<1); // condition
    }

}

