package day10_forLoopWhileLoop;

import java.util.Scanner;

public class ForLoop01 {




        public static void main(String[] args) {

            //   1.Exaample:  Type code to find the sum of the integers from 12 to 231
            //the find the summeans final it will be sum

            int sum = 0;  //it is my container
            for (int i = 12; i < 232; i++) {
                sum += i;  //== sum=sum+i
            }
            System.out.print("result of total sum="+sum);  //result of my container
            //the final value put the outside for loop body
            //if you put it inside the loop,you will see sum value for every loop step by step

            System.out.println();
            //2.Example: Type code to find the multiplication of the integers from 3 to 5
            int multi = 1;
            for (int i = 3; i < 6; i++) {
                multi *= i; //multi=multi*i
            }

            System.out.print("result of multiplication="+multi);
            System.out.println();



            //3.Example:  Type code to check if a given String is Polindrome
            //String :anna Reversed String : anna
            //Integer: 12321   Reversed Integer:12321

            String s="anna";
            String reversedS=""; //We need a container again
            for (int i=s.length()-1; i>=0;i--) {
                reversedS = reversedS + s.charAt(i);
            }
            System.out.println(reversedS);

            if (s.equals(reversedS)){
                System.out.println("palindrome");
            }else {
                System.out.println("not palindrome");
            }

            System.out.println();


            //4.Example:  Type code to check if a given integer is Polindrome
            //Integer: 12321   Reversed Integer:12321

            int num=1211;
            String rI="";   //we need a container about reserved and it will be output
            String fI=String.valueOf(num);

            for (int i=fI.length()-1; i>=0; i--){
                rI=rI+fI.charAt(i);//tersten yazılana ikisinin concateini atadık
            }
            if (fI.equals(rI)){
                System.out.println("palindrome integer");
            }else {
                System.out.println("not palindrome integer");

                System.out.println();

                //5.Example:  Type code to find the sum of the digits of an integer  //

                int num1 =75378;
                int sumOfDigits=0;

                for (int i=num1; i>0;i=i/10){
                    sumOfDigits=sumOfDigits+i%10;   //son sayıyı verir
                }
                System.out.println(sumOfDigits);
                System.out.println();

                //6.Example: Type code to find the sum of the unique digits of an integer
                Scanner scanner = new Scanner(System.in);
                System.out.print("enter an integer:");
                int p=scanner.nextInt();
                String ps=String.valueOf(p);  //We had to change because we will use string in our code
                int sumOfUnique=0;

                for (int i=0; i<ps.length();i++){
                    String c=ps.substring(i,i+1);

                    if(ps.indexOf(c)==ps.lastIndexOf(c)){
                        sumOfUnique=sumOfUnique+Integer.valueOf(c+"");
                    }

                }

                System.out.println(sumOfUnique);
            }
        }

    }






