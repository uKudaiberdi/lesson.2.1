package com.company;

public class Main {

    public static void main(String[] args) {
        Printable[] printables ={createObject("Lexus"),createObject("Mercedes"),createObject("Toyota")};
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }


    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className)  {
            case "Lexus":
                printable = new Lexus("Lexus", 500, "Black", 5);
                break;
            case "Mercedes":
                printable = new Mercedes("Mercedes", 4);
                break;
            case "Toyota":
                printable = new Toyota("Toyota", "Black", 3);

        }
        return printable;
    }
}
