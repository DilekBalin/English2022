package day8_stringManipulationForLoop;

public class SM02 {
    public static void main(String[] args) {


        //How to remove spaces from the beginning and from the end in a String?


        //this is importanat because sometimes user use their information with spaces
        //and we need to an information without spaces

        String fullName = "    Ali Can     ";
        System.out.println(fullName);

        String trimmedName = fullName.trim();
        System.out.println(trimmedName); //There is no begininig space or ending spaces

        //How to understand if a String is empty or not?
        //1.Way:   //It's not good way
        int numOfChar = fullName.length();
        if (numOfChar == 0) {
            System.out.println("Enter your name");
        } else {
            System.out.println("you entered your name is successfully");
        }

        //2.Way:
        //isEmpty() returns true if there is no any caharacter
        boolean isEmpty = fullName.isEmpty();
        if (isEmpty) {     //if it is empty
            System.out.println("Enter your name");
        } else {
            System.out.println("you entered your name is successfully");


            //isBlank()returns true if there is just space character or space characters or nothing
            String str="    ";
            boolean isBlank=str.isBlank();
            System.out.println(isBlank); //true

        }
    }
}

