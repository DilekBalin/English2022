package day12contructorsmmethodoverloadingvariabletypes;

public class MethodOverloading {
    public static void main(String[] args) {  //main method static ise disardan alcaklarim da ststic ise adini yazmam yeterli
//if you use a method inside the main method use"static"keyword between the access modifier and rghe return tyepe
        add(3, 5);

    }

//create an add method which adds 2 integers
    public static int add (int a,int b){
        return a+b;   //kullanici 3 ve 5 sayisini gondermis olsun
       // return dedigimizde bize 8 sonucunu dondurur


    }

}
