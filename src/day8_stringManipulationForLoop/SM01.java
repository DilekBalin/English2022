package day8_stringManipulationForLoop;

public class SM01 {
    public static void main(String[] args) {


        String str = "Ali is 13 years old,I think he is 15";

        //1.Exmaple:Remove all space characters from the String
        String noSpace = str.replaceAll("\\s", "");
        System.out.println(noSpace);//Aliis13yearsold,Ithinkheis15

        //ıf you type code which runs just for spesific data is called "Hard Coding"
        //and "Hard coding" is not acceptable is coding

        String noSpace1 = str.replace(" ", "");  //This isa hard coding and it's not good and professional
        System.out.println(noSpace1);


        //2.Change digit to *
        String noDigit = str.replaceAll("\\d", "*").replace("\\d", "*");
        System.out.println(noDigit); //Ali is ** years old,I think he is **


        //1)
        //What is regex:Regex is Regular Expressions.Regular expressions have a pesific syntex
        //If you mean "[0-9]" its mean is all digits between 0-9
        //If you mean lower case "[a-z]" all letters are lower
        //If ypu mean upper case "[A-Z]" all letters are upper
        //"[A-Za-z]"   lower cases and upper cases
        //"[0-9A-Za-z]" digits and lower case amd upper case

        //2)
        //Different from all digits "[^0-9]"       //rakam dısındakiler
        //Different from all lower cases "[^a-z]"    //kucuk harf dısındakiler
        //Different from all upper cases "[^A-Z]"     //Buyuk harf dısındakiler
        //Different from all lower cases and upper cases "[^A-Za-z]" //Tum harfelrin dısındakiler
        //Different from all digits and lower cases and upper cases "[^0-9A-Za-z]"


        String noDigitDynamic = str.replaceAll("[0-9]", "*");
        System.out.println(noDigitDynamic);  //Ali is ** years old,I think he is **

        //3.Example: Change all letters to !
        String noLetters = str.replaceAll("[A-Za-z]", "!");
        System.out.println(noLetters);  //!!! !! 13 !!!!! !!!,! !!!!! !! !! 15
        //like a credit card number we can do it with regular expresion

        //4.Example:Change all characters different from letters to ?
        String differentFromLetters = str.replaceAll("[^A-Za-z]", "?");  //harf dısındakileri degistir
        System.out.println(differentFromLetters); //Ali?is????years?old?I?think?he?is???

        //5.Example:Change all characters different from digits to ?
        String differentFromDigits = str.replaceAll("[^0-9]", "?");   //rakam dısındakileri cevir
        System.out.println(differentFromDigits);//???????13?????????????????????????15

        //6.Example: //5.Example:Change all characters different from space to *
        //1.Way:
        String differentFromSpace = str.replaceAll("[^  ]", "*");  // "[^  ]" araya bosluk bırakınca space dısındakiler demek
        System.out.println(differentFromSpace);  //*** ** ** ***** ***** ***** ** ** **


        /*
        1)\\s means space character
        2).\\S means characters different from space character


        3)\\d means digits
        4)\\D means  different from digits

        4)\\w means  [A-Z and a-z and 0-9]
        5)\\W means  different from [A-Z and a-z and 0-9]

        6)\\p{Punct} all punction marks




        */
        //2.Way:
        String differentFromSpace2 = str.replaceAll("\\S", "*");
        System.out.println(differentFromSpace2);  //*** ** ** ***** ***** ***** ** ** **

        //7.Example: How many characters are used in the String different from space?
        int numOfcharDifferentSpace = str.replaceAll("\\s", "").length();//we removed all of space
        //and we put in length and then we have to assign integer.
        System.out.println(numOfcharDifferentSpace);//28

        //8.Example: How many digits are used in the String?
        int numOfDigit = str.replaceAll("\\D", "").length(); //we removedall o character without digits
        //and then we put in length and we had to assing integer
        System.out.println(numOfDigit); //4

        //9.Example: How many letters used in the String?
        int numOfLetters = str.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfLetters); //23

        //10.Example: How mnay punctuation marks are used in String?
        //"Ali is 13 years old,I think he is 15"
        int totalNumOfCharacters = str.length();//36
        int numOfCharsDifferentFromPunctionMarks = str.replaceAll("\\p{Punct}", "").length();//35
        int numOfPunctMarks = totalNumOfCharacters - numOfCharsDifferentFromPunctionMarks;
        System.out.println(numOfPunctMarks); //1


    }
}