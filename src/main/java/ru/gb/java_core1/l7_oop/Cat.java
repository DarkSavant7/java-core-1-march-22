package ru.gb.java_core1.l7_oop;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Bowl bowl) {
        if (bowl.decreaseFood(appetite)) {
            satiety = true;
            System.out.printf("Cat %s has eaten %d food\n", name, appetite);
        } else {
            System.out.printf("Cat %s tried to eat %d food, but the bowl was full not enough\n", name, appetite);
        }

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
