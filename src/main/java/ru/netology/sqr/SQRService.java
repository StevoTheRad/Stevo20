package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int a, int b, int x, int c) {
        int i;
        System.out.println("Числа, квадраты которых входят в отрезок [" + a + ";" + b + "]:");
        for (i = 10; i <= x; i++) {
            if (i * i <= b && i * i >= a) {
                c = c + 1;
                System.out.println(i);
            }
        }
        return c;
    }
}


