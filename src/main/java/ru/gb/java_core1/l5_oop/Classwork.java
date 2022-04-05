package ru.gb.java_core1.l5_oop;

public class Classwork {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.name = "Murzik";
//        cat.age = 2;
//        cat.color = "red";
//
//        Cat cat2 = new Cat();
//        cat2.name = "Barsik";
//        cat2.age = 3;
//        cat2.color = "black";
//        System.out.println(cat);
//
//        cat.age = 999;
//        cat.color = "white";
//        System.out.println(cat);
//        System.out.println(cat2);
//
//        cat.run();
//        cat.run(1000);
//        cat.voice();
//
//        cat2.run();
//        cat2.run(1000);
//        cat2.voice();

        Cat cat3 = new Cat("Vaska", "grey", 1);
        System.out.println(cat3);
        cat3.run();
        cat3.run(3000);
        cat3.voice();

        cat3.setName("Murka");
        System.out.println(cat3);

        Cat.doStatic();
        System.out.println(Cat.type);

        cat3.nonStatic();

        cat3.doStatic();
        System.out.println(cat3.type);
        Cat cat4 = new Cat("Tom", "grey", 1);

        System.out.println(cat4.type);

        cat4.type = "KLJBKHBKJB";

        System.out.println(cat4.type);
        System.out.println(cat3.type);
        
        Cat[] cats = new Cat[10];
        cats[0] = cat4;
        cats[1] = new Cat("xfd", "", 12);
    }

}
