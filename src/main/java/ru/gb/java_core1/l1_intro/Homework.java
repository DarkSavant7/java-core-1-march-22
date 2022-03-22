package ru.gb.java_core1.l1_intro;

public class Homework {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        System.out.println(checkSumSign(148, 512));
        printColor();
        System.out.println(printColor(56));
//        printColor("kosnojnfsv");
        compareNumbers();
        compareNumbers(10, 10);
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
//        System.out.println("Orange");
//        System.out.println("Banana");
//        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int first = 148;
        int second = 512;
        if (first + second >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("The sum is negative");
        }
    }

    public static boolean checkSumSign(int first, int second) {
        return first + second >= 0;
    }

    public static void printColor() {
        int value = -1024;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else if (value == 666) {
            return;
        } else {
            System.out.println("Green");
        }
//        int q = value == 10 ? 100500 : 0;
//        System.out.println(value <= 0 ? "Red" : value <= 100 ? "Yellow" : "Green");
    }

    public static String printColor(int value) {
        if (value <= 0) {
            return "Red";
        } else if (value <= 100) {
            return "Yellow";
        }

        return "Green";
        //... Дальше код не выполнится никогда
//        System.out.println("kjdfnvbjdfnbjfd");
    }

    public static void compareNumbers() {
        int first = 200;
        int second = 500;
        //условие        что будет       что будет в
        //если true       противном случае
        System.out.println(first >= second ? "a >= b" : "a < b");
//        if (first >= second) {
//            System.out.println("a >= b");
//        }
//        else {
//            System.out.println("a < b");
//        }
    }

    public static String compareNumbers(int first, int second) {
//        System.out.println(first >= second ? "a >= b" : "a < b");
        return first >= second ? "a >= b" : "a < b";
    }
}
