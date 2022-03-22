package ru.gb.java_core1.l2_base_expressions;

public class Classwork {
    private static volatile boolean flag = true;

    public static void main(String[] args) {
//        formattedPrint();
//        vendingIf(3);
//        vendingSwitch(2);
//        vendingSwitchModern(2);
//        whileExample();
//        incrementExample();
//        forExample();
//        example();
//        char c = '\u0000';
//        arraysExample();
//        doubleLoop();
//        arraysLoops();

        int a = 0;
        while (true) {

            if (a++ % 2 == 0) {
                continue;
            }

            System.out.print(a + " ");

            if (a == 22) {
                break;
            }
        }


    }

    private static void doubleLoop() {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j <= 100; j += 10) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    private static void arraysLoops() {
        int[] arr = createArray(20, 99);
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i : arr) {
            System.out.println(i);
        }

        int[] arr1 = {1, 2, 3, 4, 5, 56, 67, 7, 7};

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
    }

    private static void arraysExample() {
        int[] intArray;
        intArray = new int[4];
        intArray[0] = 20;
        intArray[1] = 40;
        intArray[2] = -123;
        intArray[3] = 2134214;

        System.out.println(intArray[2]);
        intArray[2] = intArray[0] + intArray[1];
        System.out.println(intArray[2]);

//        System.out.println(intArray[4]);

        int[] arr = {10, 23, 342, 1}; //new int[4]; arr[0] = 10; arr[1] = 23....

        String[] strings = new String[3];
        strings[0] = "jkjdfvnjdf";

        String[] strings1 = {"First", "Second", "Third"};

//        Object[] objArr = new Object[10];
//        objArr[0] = "mfmnjfdnv";
//        objArr[1] = 'a'; //Character
//        objArr[2] = 20; //Integer
//        objArr[3] = 12.0001; //Double
    }

    private static int[] createArray(int length, int value) {
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = value;
        }
        return arr;
    }

    private static void example() {
        new Thread(() -> {
            try {
                Thread.sleep(2500);
                flag = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        int i = 10;


        while (flag) {
            System.out.print(i++ + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }

    private static void forExample() {
        //     init                       condition                    iteration
        for (int i = 0, a = 10, b = 20; i < 10 && a > 0 && b < 100; i++, a--, b += 10) {
            System.out.printf("a = %d, b = %d, i = %d\n", a, b, i);
        }
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }

        int i = 0;
        for (; ; ) {
            System.out.println(i++);

            if (i == 20) {
                break;
            }
        }
    }

    private static void incrementExample() {
        int a = 0;
        a++;
        ++a;
        System.out.println(++a);
        System.out.println(a);
    }

    private static void whileExample() {
        int a = 0;

        while (a < 0) {
//            if (a++ % 2 == 0) {
//                continue;
//            }

            System.out.print(a + " ");

            if (a > 20) {
                break;
            }
        }

        do {
            System.out.println(a++);
        } while (a < 0);

        while (true) {
            a++;

            if (a % 2 == 0) {
                continue;
            }

            if (a == 21) {
                break;
            }

            System.out.println(a);
        }
    }

    //Java 14+
    private static void vendingSwitchModern(int choice) {
        switch (choice) {
            case 1 -> System.out.println("Ice-cream");
            case 2 -> {
                System.out.println("Chupa-chups");
                System.out.println("Chupa-chups");
                System.out.println("Chupa-chups");
                System.out.println("Chupa-chups");
            }
            case 3 -> System.out.println("Pepsi");
            case 4 -> System.out.println("Snickers");
            default -> System.out.println("ERROR");
        }
    }

    private static void vendingSwitch(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Ice-cream");
                //....
                System.out.println("Something");
                //....
                break;
            case 2:
                System.out.println("Chupa-chups");
                break;
            case 3:
                System.out.println("Pepsi");
                break;
            case 4:
                System.out.println("Snickers");
                break;
            default:
                System.out.println("ERROR");
        }
    }

    private static void vendingIf(int choice) {
        if (choice == 1) {
            System.out.println("Ice-cream");
        } else if (choice == 2) {
            System.out.println("Chupa-chups");
        } else if (choice == 3) {
            System.out.println("Pepsi");
        } else if (choice == 4) {
            System.out.println("Snickers");
        } else {
            System.out.println("ERROR");
        }
    }

    private static void formattedPrint() {
        String s = "Number a = " + 10 + " num b = " + 14;
        System.out.println(s);

        int a = 10;
        int b = 14;
        String word1 = "Number";
        String word2 = "num";

        System.out.printf("%s a = %s, %s b = %s\n", word1, a, word2, b);

        String formatted = String.format("%s a = %d, %s b = %d\n", word1, a, word2, b);
        /*
         * %s - строка (можно подсунуть любой объект)
         * %d - целое число
         * %f - число с плавающей запятой
         * %b - boolean
         * %c - character
         */

        System.out.println(formatted);

        System.out.printf("Floating %.5f", 10.10f);
    }
}
