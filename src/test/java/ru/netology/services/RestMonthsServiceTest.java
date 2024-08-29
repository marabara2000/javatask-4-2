package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestMonthsServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/months.csv")
    public void testFirst(int expected, int income, int expenses, int threshold) {
        RestMonthsService service = new RestMonthsService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}