package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int bottomBound, int upperBound) {
        int counter = 0;
        int maxNumber = 99;
        int i;
        System.out.println("Числа, квадраты которых входят в отрезок [" + bottomBound + ";" + upperBound + "]:");
        for (i = 10; i <= maxNumber; i++) {
            if (i * i <= upperBound && i * i >= bottomBound) {
                counter = counter + 1;
                System.out.println(i);
            }
        }
        return counter;
    }
}


