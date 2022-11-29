package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        System.out.println("Количество чисел, квадраты которых входят в отрезок - " + service.calcSqrt(150, 500, 99, 0));
    }
}