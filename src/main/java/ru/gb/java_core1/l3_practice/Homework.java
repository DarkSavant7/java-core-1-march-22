package ru.gb.java_core1.l3_practice;

import java.util.Arrays;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        int[] invertedArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(invertedArr));
        invertArray(invertedArr);
        System.out.println(Arrays.toString(invertedArr));
        int[] eightArr = fillArrayWithStep(10, 5);
        System.out.println("Number 2:");
        System.out.println(Arrays.toString(eightArr));

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] sixArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Number 3:");
        System.out.println(Arrays.toString(sixArr));
        workWithSix(sixArr);
        System.out.println(Arrays.toString(sixArr));
        int[][] diagonalArr = diagonalArr(9, 9);
        System.out.println("Number 4:");
        printArr(diagonalArr);

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] minMaxArr = {1, 5, 3, 2, 11, 4, 50, 5, 2, -10, 4, 8, 9, 1};
        int min = findMin(minMaxArr);
        int max = findMax(minMaxArr);
        System.out.println(findMax(1, 2, 4, 23, 15, 68, 256));
        System.out.printf("Min = %d \r\nMax = %d\r\n", min, max);
        int[] someArr = {2, 3, 4, 1, 8, 14, 5, 10, 13, 4};
        System.out.println(checkBalance(someArr));
        System.out.println(Arrays.toString(someArr));
        shiftLong(someArr, 2);
        System.out.println(Arrays.toString(someArr));

        int[] arr = {1, 2, 3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(Arrays.toString(arr));
        shiftOptimal(arr, 10);
        System.out.println(Arrays.toString(arr));
        testShifts(50);
    }

    private static void testShifts(int t) {
        Random r = new Random();
        for (int i = 0; i < t; i++) {
            int[] arr = new int[r.nextInt(100000)];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = r.nextInt();
            }
            int[] arr2 = Arrays.copyOf(arr, arr.length);
            int n = r.nextInt(100000);
            shiftLong(arr, n);
            shiftOptimal(arr2, n);
            boolean result = Arrays.equals(arr, arr2);
            System.out.println(result);
            if (!result) {
                break;
            }
        }
    }

    //Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
    //int длиной len, каждая ячейка которого равна initialValue;
    private static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
//        Arrays.fill(arr, initialValue);
        return arr;
    }

    private static int findMin(int... arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    private static int findMax(int... arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }


    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    private static int[][] diagonalArr(int size, int value) {
        int[][] diagonalArr = new int[size][size];
        for (int i = 0; i < size; i++) {
            diagonalArr[i][i] = value;
            diagonalArr[i][diagonalArr.length - i - 1] = value;
        }
        return diagonalArr;
    }

    private static void workWithSix(int[] sixArr) {
        for (int i = 0; i < sixArr.length; i++) {
            if (sixArr[i] < 6) {
                sixArr[i] *= 2;
            }
//            sixArr[i] = sixArr[i] < 6 ? sixArr[i] * 2 : sixArr[i];
        }
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    private static int[] fillArrayWithStep(int size, int step) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * step;
        }
        return arr;
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
//                arr[i] = 0;
//            } else {
//                arr[i] = 1;
//            }
//            arr[i] = (arr[i] + 1) % 2;
//            arr[i] ^= 1;
//            arr[i] = arr[i] == 0 ? 1 : 0;
            arr[i] = (arr[i] - 1) * -1;
        }
    }


    //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.

    static void shiftLong(int[] arr, int n) {
        int shift = (arr.length + n % arr.length) % arr.length;
        for (int i = 0; i < shift; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }

    public static void shiftOptimal(int[] arr, int n) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int shift = (arr.length + n % arr.length) % arr.length;
        int count = 0;
        for (int i = 0; count < arr.length; i++) {
            int currentIndex = i;
            int prevElement = arr[i];
            do {
                int nextElement = (currentIndex + shift) % arr.length;
                int temp = arr[nextElement];
                arr[nextElement] = prevElement;
                prevElement = temp;
                currentIndex = nextElement;
                count++;
            } while (i != currentIndex);
        }
    }
    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.

    static boolean checkBalance(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }

        int half = sum / 2;
        int left = 0;

        for (int i : arr) {
            left += i;
            if (left == half) {
                return true;
            }
        }
        return false;
    }

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
