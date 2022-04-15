package day14_staticArraysForEachLoop;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        //Create a String array and print the elements in alphabetical order on the console in different lines
        //1.Step: Create a String array

        String myStringArray[] = new String[4]; // [ null, null, null, null ]
        System.out.println(Arrays.toString(myStringArray));

        //2.Step: Add elements into the array

        myStringArray[0] = "Veli";
        myStringArray[1] = "Can";
        myStringArray[2] = "Beyhan";
        myStringArray[3] = "Ali";
        System.out.println(Arrays.toString(myStringArray)); //[Veli, Can, Beyhan, Ali]


        //How to put the lements in alphabetical order
        Arrays.sort(myStringArray);
        System.out.println(Arrays.toString(myStringArray)); //[Ali, Beyhan, Can, Veli]
        System.out.println("******************");


        //How to print the elements in different lines
        for (String w : myStringArray) {
            System.out.println(w);
        }
        System.out.println("*******************");
        //Print the list elements if the number of characters is less than 4.
        for (String w : myStringArray) {
            if (w.length() < 4) {
                System.out.println(w);//Ali   //Because just those length is less than 4
                //Can
            }
        }
        System.out.println("*******************");
        //Print the list element if you print "Can" stop printing
        for (String w : myStringArray) {  //[Ali, Beyhan, Can, Veli]

            System.out.println(w);
            if (w.equals("Can")) {    //[Ali, Bethan, Can]
                break; //it will stop after "Can"
            }

        }
        System.out.println("**************");
        //Print the list elements before "Can"
        for (String w : myStringArray) {  //[Ali, Beyhan, Can, Veli]


            if (w.equals("Can")) {
                break; //
            }
             System.out.println(w);// [Ali,Beyhan]

        }
        System.out.println("*********************");
        //Print the list elements except "Can" if there is

        for(String w: myStringArray){
            if(!w.equals("Can")){
                System.out.println(w);//[Ali,Beyhan,Veli]
            }
        }
        System.out.println("***************");

        //2.Way:
        for(String w: myStringArray){   //[Ali, Beyhan, Can, Veli]
            if(w.equals("Can")){
                continue;   //If you can see continue keyword you should jump to "Can"
            }
            System.out.println(w);
        }




    }
}