package ru.gb.java_core1.l6_oop.homework;

public class Marathon {
    public static void main(String[] args) {
        //Создать классы Собака и Кот с наследованием от класса Животное.
        //Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        // Результатом выполнения действия будет печать в консоль.
        // (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        //У каждого животного есть ограничения на действия
        // (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        //Добавить подсчет созданных котов, собак и животных.
        Animal[] animals = {
                new Cat("Barsik"),
                new Cat("Murzik"),
                new Dog("Bobik", 500, 20),
                new Dog("Tuzik", 1000, 15),
        };

        for (Animal a : animals) {
            a.run(200);
            a.swim(10);
            a.run(500);
            a.swim(15);
            a.run(1000);
            a.swim(30);
        }

        Animal[] loopAnimals = new Animal[10];
        for (int i = 0; i < loopAnimals.length; i++) {
            loopAnimals[i] = new Cat("cjnbjgf");
        }
    }
}
