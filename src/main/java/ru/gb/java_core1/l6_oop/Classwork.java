package ru.gb.java_core1.l6_oop;

import ru.gb.java_core1.l6_oop.zoo.Animal;
import ru.gb.java_core1.l6_oop.zoo.Bird;
import ru.gb.java_core1.l6_oop.zoo.Cat;
import ru.gb.java_core1.l6_oop.zoo.Dog;
import ru.gb.java_core1.l6_oop.zoo.Parrot;
import ru.gb.java_core1.l6_oop.zoo.Snake;

//leetcode.com
public class Classwork {

    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Barsik", "white"),
                new Bird("Chizhik", "yellow"),
                new Dog("Bobik", "black"),
                new Snake("Kaa", "green"),
                new Parrot("Kesha", "blue"),
//                new Animal("JJJJ", "xkfdmv")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].walk();
            animals[i].voice();

            if (animals[i] instanceof Bird) {
                ((Bird) animals[i]).fly();
            }

            if (animals[i] instanceof Parrot) {
                ((Parrot) animals[i]).speak();
            }

//            if (i == 0) {
//                Bird b = (Bird) animals[i];
//                b.fly();
//            }
        }

        Snake snake = new Snake("xfbb", "xfdfgvgfd");
        snake.voice();
        snake.walk();
        snake.walkAsParent();

        System.out.println(Animal.STATIC_FIELD);
        System.out.println(Cat.STATIC_FIELD);
        Animal.doStatic();
        Cat.doStatic();

        Dog.doStatic();
    }
}
