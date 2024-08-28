package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestMonthsServiceTest {

    @ParameterizedTest
//    @CsvSource( {
//            "3, 10, 3, 20",
//            "2, 100, 60, 150"
//    })
    @CsvFileSource(files = "src/test/resources/restmonths.csv")
    public void testFirst (int expected, int income, int expenses, int threshold) {
        RestMonthsService service = new RestMonthsService();

//        int income = 10;
//        int expenses = 3;
//        int threshold = 20;

       // int expected = 3;
        int actual = service.calculate (income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
//    @Test
//    void testSecond () {
//        RestMonthsService service = new RestMonthsService();
//
//        int income = 100;
//        int expenses = 60;
//        int threshold = 150;
//
//        int expected = 2;
//        int actual = service.calculate (income, expenses, threshold);
//
//        Assertions.assertEquals(expected, actual);
//    }


}