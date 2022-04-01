package ru.gb.java_core1.l5_oop;

import java.time.Year;

//private - class only
//        + package
//protected + inherited
//public + all
public class Cat {
    public static String type = "CAT";
    private String name;
    private String color;
    private int birthYear;

    private Cat() {
        System.out.println("Cat born!");
    }

    public Cat(String color, int age) {
        this();
        this.color = color;
        this.birthYear = Year.now().getValue() - age;
    }

    public Cat(String name, String color, int age) {
        this(color, age);
        this.name = name;
    }

    public static void doStatic() {
        System.out.println("STATIC");
//        run();
    }

    public static void makeSomeCatRun(Cat cat) {
        cat.run();
    }

    public void nonStatic() {
        System.out.println(type);
        doStatic();
    }

    public void run() {
        System.out.printf("%s runs\n", name);
    }

    public void run(int length) {
        System.out.printf("%s runs for %d meters\n", name, length);
    }

    public void voice() {
        System.out.printf("%s: meaw\n", name);
    }

    @Override
    public String toString() {
        return String.format("Cat: name=%s, color=%s, age=%d", name, color, getAge());
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }
}
