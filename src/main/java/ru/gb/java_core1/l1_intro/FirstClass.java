package ru.gb.java_core1.l1_intro;

public class FirstClass {

    public static void main(String[] args) {
//        primitivesExample();
//        arithmeticExpressions();

        int count = 6;
        boolean branching = count * 2 > 14;

        if (branching) {
//        if (count < 0) {
            System.out.println("AAAAA");
        } else {
            System.out.println("BBBBB");
        }

//        if (count < -5) {
//            System.out.println("BBBBBB");
//        }

    }

    private static void arithmeticExpressions() {
        int a = 10;
        int b = 14;
        int c = 2;
        int result = (a + b) / 2 * c;
        System.out.println(result);

        calculateExpression(123, 32, 8);
        calculateExpression(213, 11, 555);
        calculateExpression(2131242134, 2333, 1);

        int w = calculateExpressionWithReturn(2131242134, 2333, 1)
                - calculateExpressionWithReturn(123, 32, 8);
        System.out.println(w);
//        a = 3243;
//        b = 234324;
//        c = 324;
//        result = (a + b) / 2;
//        System.out.println(result);

        boolean bool = (10 == 4 && 22 > 3) && (14 * 2 > 10 * 3 || 2 * 2 == 4);
        System.out.println(!bool);
    }

    public static int calculateExpressionWithReturn(int a, int b, int c) {
//        int result = (a + b) / 2 * c;
//        return result;
        return (a + b) / 2 * c;
    }

    public static void calculateExpression(int a, int b, int c) {
//        int result = (a + b) / 2 * c;
//        System.out.println(result);
        System.out.println((a + b) / 2 * c);
    }

    private static void primitivesExample() {
        byte byteVar; //8 bit -128..127
        byteVar = 12;
        byteVar = 24;
        short shortVar = 99; //16 bit -32768..32767
        int intVar = 32; //32 bit -2.1 bil.. 2.1 bil
        long longVar = 100500; //64 bit

        intVar = 2_100_999_999;

        longVar = -7_999_999_299_200_999_999L;

        char charVar = 79; //16 bit 0..65535
        charVar = 'Q';
        charVar = '\u5468';

        System.out.println(charVar);

        boolean boolVar = true;

        double doubleVar = 0.21321384584353543543543; //64 bit
        float floatVar = 0.213213345435345435435345435f; //32 bit

        System.out.println(doubleVar);
        System.out.println(floatVar);

        String str = "Some string";

        System.out.println(2 * 2 + 2);

        int a = 10;
        int b = 14;
        int c = a * b - 24;

        System.out.println(c);

        int q = 10 % 24;

        System.out.println(q);

        a++; // a = a + 1
        ++a; // a = a + 1
        System.out.println(a);

        a--; // a = a - 1;
        --a;

        a += 10; // a = a + 10;
        a -= 10;
        a *= 10;
        a %= 10; // a = a % 10
    }

}