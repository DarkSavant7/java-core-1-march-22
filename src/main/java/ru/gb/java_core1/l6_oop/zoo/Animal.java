package ru.gb.java_core1.l6_oop.zoo;

public abstract class Animal extends Object {
    public static final String STATIC_FIELD = "STATIC";
    protected String name;
    protected String color;

    public Animal() {
        super();
        System.out.println("Animal born");
    }

    public Animal(String name, String color) {
        this();
        this.name = name;
        this.color = color;
    }

    public static void doStatic() {
        System.out.println("STATIC");
    }

    public void walk() {
        System.out.printf("%s walks on paws\n", name);
    }

    public abstract void voice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
