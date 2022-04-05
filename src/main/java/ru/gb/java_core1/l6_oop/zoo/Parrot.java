package ru.gb.java_core1.l6_oop.zoo;

public final class Parrot extends Bird {

    public Parrot(String name, String color) {
        super(name, color);
    }

    public void speak() {
        System.out.printf("%s hello\n", name);
    }

//    @Override
//    public void fly() {
//        super.fly();
//    }
}
