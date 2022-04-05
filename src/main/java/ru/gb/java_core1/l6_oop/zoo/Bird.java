package ru.gb.java_core1.l6_oop.zoo;

public class Bird extends Animal {

    public Bird(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.printf("%s chik chirik\n", name);
    }

    public final void fly() {
        System.out.printf("%s fly\n", name);
    }

}
