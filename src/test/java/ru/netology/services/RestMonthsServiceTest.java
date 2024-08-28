package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestMonthsServiceTest {

    @Test
    void testFirst () {
        RestMonthsService service = new RestMonthsService();

        int income = 10;
        int expenses = 3;
        int threshold = 20;

        int expected = 3;
        int actual = service.calculate (income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testSecond () {
        RestMonthsService service = new RestMonthsService();

        int income = 100;
        int expenses = 60;
        int threshold = 150;

        int expected = 2;
        int actual = service.calculate (income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }


}