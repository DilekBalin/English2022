import java.util.Arrays;
import java.util.Comparator;

public class day15_arraysForEachLoop {
    public static void main(String[] args) {

        //sort the array elements according to their lengths

        String str[]={"Veli","Micheal","Ali","Maria"};//[Veli, Micheal, Ali, Maria]
        System.out.println(Arrays.toString(str));
        Arrays.sort(str, Comparator.comparingInt(String::length));  //Comparator is a class like String,scanner,Array class
        //it put many methods you can use comperative them
        System.out.println(Arrays.toString(str));  //[Ali, Maria, Micheal, Veli]



        //sort the array elements in descending order according to their lengths >> "Micheal"-"Maria"-"Veli"-"Ali"
        String ttr[]={"Veli","Micheal","Ali","Maria"};
        System.out.println(Arrays.toString(str));
        Arrays.sort(ttr);
        Arrays.sort(ttr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(ttr)); //[Micheal, Maria, Veli, Ali]


        //sort the array elements in descending order according to their lengths
        //If some elements are in the same length put them in alphabetical order   //"Micheal"-"Maria"-"Ayse"-Veli"-"Ali"-"Can"-"Tan"
        String urr[]={"Veli","Micheal","Ali","Maria","Can","Tan","Ayse"};
        Arrays.sort(urr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        //naturelOrder() means alphetical order in Strings,ascending order in numbers
        System.out.println(Arrays.toString(urr)); //[Micheal, Maria, Ayse, Veli, Can, Tan, Ali]


    }
}
