package day12contructorsmmethodoverloadingvariabletypes;

public class Car {
    /*
    1) Constructors are used to create object from a class
    2) Java puts default constructors inside every class
    3)Default constructors don't have  any parameters inside the constructor paranthesis
    4)constructor names must match with the class names
    5) In a class we can have multiple constructors

    How to cretae a constructor?
    1)Type access modifier>>>>.public,private...
    2)Type the class name as constructor name
    3)Open - close parenthesis
     4)open curly brace press enter
         */


    String make;
    String model;
    double price;
    int year;


    //That constructor is same with the default constructor 'it is very simple
    public Car() {      //1.constructor

    }

    public Car(String make, String model) {    //2.constructor

    }

    public Car(String make, String model, double price, int year) {    //3.constructor
        //kullanici buraya bilgileri girerse o bilgiler havada kalir
        this.make = make;    //buraya gelirsek o bilgiler artik kullanilir
        this.model = model;   //mor olanlar depo classtakiler siyah olanlar ise kullanicidan gelenler
        this.price = price;
        this.year = year;


    }

    public static void main(String[] args) {
        Car c1 = new Car();    //create c1 object
        c1.make = "Honda";
        c1.model = "Civic";
        c1.price = 10000;
        c1.year = 2015;


        Car c2 = new Car();  //create c2 object
        c2.make = "Audi";
        c2.model = "S5";
        c2.price = 20000;
        c2.year = 2019;

        Car c3 = new Car("BMW", "M4", 70000, 2019); // create c3 object
        //bu objeyi enbastaki kaliba gore yaptik
        //bu kod calisirken java once 4 argument bulunan constructore gider
        //eslestirme yaparak degerleri yazar
        //this kismina gelince de onlari atamis olur

        Car c4 = new Car("Mercedes", "GLE", 80000, 2021);//create c4 object
        Car c5 = new Car("Tofas", "Sahin ELXIV");    //bu objeyi de icinde sadece 2 tane
        // string element olan constructora gore yaptik


    }

}
