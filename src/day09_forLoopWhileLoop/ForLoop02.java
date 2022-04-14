package day09_forLoopWhileLoop;

public class ForLoop02 {
    public static void main(String[] args) {
        //1.Example:
        //Put * between 2 consecutive characters and to the end in a String
        //For example: Java J*a*v*a*

        String str="Java";
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ "*");  //J*a*v*a*
        }
        System.out.println("===============");


        //2.Example: Type code to print unique(eşsiz) characters in a String .  Hello>>>> Heo
        String t="Hello";
        for (int i=0;i<t.length();i+=1){
            if (t.indexOf(t.charAt(i)) == t.lastIndexOf(t.charAt(i))){
                System.out.print(t.charAt(i));
            }
        }

        System.out.println("===============");

        //3.Example: Type code to print a String in reverse (geri ) after remowing spaces
        //"Ali Can">>>>naCilA
        String u="Ali Can";
        String noSpace= u.replaceAll("\\s","");

        for (int i=noSpace.length()-1;i>=0;i--){
            System.out.print(noSpace.charAt(i));

        }
    }
}
