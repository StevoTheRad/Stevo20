package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int bottomBound, int upperBound, int maxNumber, int counter) {
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


