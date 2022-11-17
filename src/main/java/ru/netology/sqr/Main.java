package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int a = 150;
        int b = 500;
        System.out.println("Количество чисел, квадраты которых входят в отрезок [" + a + ";" + b + "]: - " + service.calcSqrt(a, b, 99, 0));
    }
}