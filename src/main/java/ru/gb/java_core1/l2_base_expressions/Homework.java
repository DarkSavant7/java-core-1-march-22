package ru.gb.java_core1.l2_base_expressions;

public class Homework {

    public static void main(String[] args) {
        System.out.println("Does the sum of two given numbers fit the range? " + checkTwoNumbers(7, 15));
        int x = 20;
        int y = -5;
        boolean checkResult = checkTwoNumbers(x, y);
        System.out.println(!checkResult);
        System.out.println("Your number is " + (isPositive(0) ? "positive" : "negative"));
        System.out.println("Your number is " + (isPositive(10) ? "positive" : "negative"));
        isPositive(24L);
        isPositive(14L);
        System.out.println(isNegative(-2));

        String s = "Vasya Pupkin";
        int counter = 3;
//        printIt("Vasya Pupkin", 3);
        printIt(s, counter);

        System.out.println("Is the given year leap? " + isLeapYear(2020));
    }

    /*
     * Написать метод, принимающий на вход два целых числа, и
     * проверяющий что их сумма лежит в пределах от 10 до 20
     * (включительно), если да – вернуть true, в противном
     * случае – false
     */
    private static boolean checkTwoNumbers(int first, int second) {
        int sum = first + second;
//        boolean result = sum <= 20 && sum >= 10;
//        return result;
        return sum <= 20 && sum >= 10;
    }

    /*
     * Написать метод, которому в качестве параметра передается
     * целое число, метод должен проверить положительное ли число
     * передали, или отрицательное. Замечание: ноль считаем
     * положительным числом. Результат работы метода вывести в консоль
     */
    private static void isPositive(long variable) {
        System.out.println(variable >= 0 ? "Positive" : "Negative");
    }

    private static boolean isPositive(int variable) {
        return variable >= 0;
    }

    /*
     * Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    private static boolean isNegative(int number) {
        return number < 0;
    }

    /*
     * Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    private static void printIt(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }

    /*
     * Написать метод, который определяет является ли год високосным.
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный. Для проверки работы
     * вывести результаты работы метода в консоль
     */
    private static boolean isLeapYear(int year) {
//        boolean result = false;
//
//        if (year % 4 == 0 && year % 100 != 0) {
//            result = true;
//        } else if (year % 400 == 0) {
//            result = true;
//        }
//        return result;
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

}
