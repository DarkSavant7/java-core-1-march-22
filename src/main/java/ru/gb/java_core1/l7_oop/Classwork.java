package ru.gb.java_core1.l7_oop;

import ru.gb.java_core1.l6_oop.zoo.Animal;

import java.util.Scanner;

public class Classwork {

    public static void main(String[] args) {
//        stringsComparing();
//        stringBuilderExample();
//        catsAndBowls();
//        fightExample();
//        enumsExample();
//        innerClasses();


    }

    private static void innerClasses() {
        class SomeLocalClass {
            private String name;
            private int some;

            public SomeLocalClass(String name, int some) {
                this.name = name;
                this.some = some;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            class LocalLocal {
                static class NestedLocal {
                     class LLLsdfvf {
                        static class NBHH {

                        }
                    }
                }
            }
        }

        SomeLocalClass slc = new SomeLocalClass("dffd", 213);

        Car car = new Car("Lada", 77);
        Car.Engine engine = car.getEngine();
//        Car.Engine engine1 = new Car.Engine(10);
        Car.Engine engine2 = car.new Engine(50);

        Car.Engine engine3 = new Car("sdf", 11).new Engine(21);


        Car.NestedClassExample nc = new Car.NestedClassExample();


        Animal animal = new Animal("GGGG", "ZGDFG") {
            @Override
            public void voice() {
                System.out.println("kjncfbbojnbfsgdnjofdbgnjol");
            }
        };

        animal.walk();
        animal.voice();

        System.out.println(animal.getClass().getName());
    }

    private static void enumsExample() {
        WeekDay day = WeekDay.FRIDAY;
        System.out.println(day);
        System.out.println(day.getRussianTitle());
        System.out.println(day.ordinal());

        WeekDay day2 = WeekDay.FRIDAY;
        System.out.println(day == day2);
        WeekDay day3 = WeekDay.valueOf("MONDAY");

        Operator op = Operator.SUM;
        System.out.println(op.operation(20, 14));
        op = Operator.MUL;
        System.out.println(op.operation(3, 5));
    }

    private static void fightExample() {
        var fighter1 = new Fighter("SubZero", 200, 35);
        var fighter2 = new Fighter("Scorpion", 300, 25);

        System.out.println("ROUND 1 FIGHT");

        while (true) {
            fighter1.hit(fighter2);
            if (!fighter2.isAlive()) {
                System.out.println("Fighter 2 dead");
                break;
            }
            fighter2.hit(fighter1);
            if (!fighter1.isAlive()) {
                System.out.println("Fighter 1 dead");
                break;
            }
        }
    }

    private static void catsAndBowls() {
        Cat cat = new Cat("Barsik", 100);
        Bowl bowl = new Bowl();
        bowl.putFood(150);
        cat.eat(bowl);
        System.out.println(bowl.getFoodAmount());
    }

    private static void stringBuilderExample() {
        System.out.println("start");

        String s1 = "Hello";
        long start = System.currentTimeMillis();

        for (int i = 0; i < 300_000; i++) {
            s1 += i;
        }
        long delta = System.currentTimeMillis() - start;

        System.out.println("String time " + delta);

        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sBuf = new StringBuffer();
        start = System.currentTimeMillis();

        for (int i = 0; i < 300_000; i++) {
            sb.append(i);
        }
        delta = System.currentTimeMillis() - start;

        System.out.println("SB time " + delta);
        System.out.printf("String length = %d, Strings are equals: %b\n", s1.length(), s1.equals(sb.toString()));
    }


    private static void stringsComparing() {
        Scanner scanner = new Scanner(System.in);
        String s1 = "Hi";
        String s2 = "Hi";
        String s3 = new String("Hi");
        String s4 = new String(s1);
        String s5 = "H";
        String s6 = "i";
        String s7 = s5 + s6;
        char[] chars = {'H', 'i'};
        String s8 = new String(chars).intern();
        String s9 = new String(new byte[]{72, 105}).intern();
        String s10 = scanner.next().intern();

//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s4);
//        System.out.println(s1 == s7);
//        System.out.println(s1 == s8);
//        System.out.println(s1 == s9);
//        System.out.println(s1 == s10);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s7));
        System.out.println(s1.equals(s8));
        System.out.println(s1.equals(s9));
        System.out.println(s1.equals(s10));

//        System.out.println((int)chars[0]);
//        System.out.println((int)chars[1]);
    }
}
