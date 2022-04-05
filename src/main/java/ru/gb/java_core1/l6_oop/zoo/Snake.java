package ru.gb.java_core1.l6_oop.zoo;

public class Snake extends Animal {

    public Snake(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.printf("%s sssssshh\n", name);
    }

    @Override
    public void walk() {
        System.out.printf("%s crawls on tummy\n", name);
    }

    public void walkAsParent() {
        super.walk();
    }
}
