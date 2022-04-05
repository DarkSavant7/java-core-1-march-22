package ru.gb.java_core1.l6_oop.zoo;

public class Dog extends Animal {
    public String name; //shadowing

    public Dog(String name, String color) {
        super(name, color);
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.printf("%s bark\n", name);
    }
}
