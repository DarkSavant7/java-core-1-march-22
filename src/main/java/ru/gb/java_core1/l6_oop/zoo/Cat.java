package ru.gb.java_core1.l6_oop.zoo;

public class Cat extends Animal {
    public static final String STATIC_FIELD = "CAT";

    public Cat(String name, String color) {
        super(name, color);
    }

    public static void doStatic() {
        System.out.println("STATIC CAT");
    }

    @Override
    public void voice() {
        System.out.printf("%s meaw\n", name);
    }
}
