package ru.gb.java_core1.l3_practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

//PascalCase (UpperCamelCase)
public class OurSomeLongNamedClassworkLesson {

    //SNAKE_CASE
    public static final String SOME_CONSTANT_VALUE = "some";

    // camelCase
    int someVariable = 10;

    public static void main(String[] args) {
//        randomExample();
//        scannerExample();
//        guessGame();
//        scannerReadFileExample();

        arrays2dExample();

    }

    private static void arrays2dExample() {
        int[][] arr = new int[3][3];
        arr[1][1] = 5;
        arr[2][2] = 8;
        print2dArray(arr);
//        System.out.println(Arrays.deepToString(arr));

        int[][] arr2 = new int[3][];
//        arr2[0] = new int[10];
//        arr2[1] = new int[5];
//        arr2[2] = new int[14];

        System.out.println(Arrays.toString(arr2));
//        System.out.println(arr2);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }

        int[][] arr3 = {
                {1, 2, 3, 4},
                {1, 2},
                {1, 2, 3, 4, 324, 243, 564},
                {1, 2, 3, 4}
        };
//        print2dArray(arr3);

//        System.out.println(Arrays.toString(arr2));

        int[][][][][][][][][][] superArr = new int[10][10][][][][][][][][];

    }

    public static void print2dArray(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x] + "\t");
            }
            System.out.println();
        }
    }

    private static void scannerReadFileExample() {
        try (Scanner sc = new Scanner(new FileInputStream("files/some.txt"))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void guessGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите диапазон значений через пробел >>> ");
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        int[] arr = createArrayWithRandomValues(15, low, high + 1);

        System.out.print("Угадайте число в этом массиве >>> ");
        int guess = scanner.nextInt();
        int result = search(arr, guess);
        if (result < 0) {
            System.out.println("Не угадал");
        } else {
            System.out.println("Угадал");
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void scannerExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word");
        scanner.useDelimiter("__");
        String word = scanner.next();
//        String word = scanner.nextLine();
        System.out.printf("Your word is: %s\n", word);
        int a = scanner.nextInt();
        System.out.println(a);

        scanner.useLocale(Locale.CANADA);
        double d = scanner.nextDouble();
        System.out.println(d);
    }

    private static void randomExample() {
        int[] arr = createArrayWithRandomValues(15);
        System.out.println(Arrays.toString(arr));
        Random random = new Random();
        System.out.println(random.nextInt(100));

        int[] array = createArrayWithRandomValues(15, -100, 100);
        System.out.println(Arrays.toString(array));

        double randomDouble = random.nextDouble() * 100;
        System.out.println(randomDouble);

        System.out.println(Math.random());
    }

    public static int[] createArrayWithRandomValues() {
        Random random = new Random();
        int[] arr = new int[random.nextInt(Integer.MAX_VALUE)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        return arr;
    }

    public static int[] createArrayWithRandomValues(int length) {
        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        return arr;
    }

    public static int[] createArrayWithRandomValues(int length, int lowBound, int highBound) {
        int range = highBound - lowBound;
        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(range) + lowBound;
        }

        return arr;
    }

    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }


}
