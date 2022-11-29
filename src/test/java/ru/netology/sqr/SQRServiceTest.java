package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/borders.csv")
    public void testValueLimits(int expected, int bottomBound, int upperBound) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(bottomBound, upperBound, 99, 0);

        Assertions.assertEquals(expected, actual);
    }
}
