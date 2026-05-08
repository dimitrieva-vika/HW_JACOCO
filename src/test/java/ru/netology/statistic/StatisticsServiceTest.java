package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMaxStandard() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxFirstElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {100, 1, 2, 3, 4};
        long expected = 100;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxLastElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 2, 3, 4, 100};
        long expected = 100;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxAllEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 5, 5, 5, 5};
        long expected = 5;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {42};
        long expected = 42;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxMiddleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 3, 7, 2, 0};
        long expected = 7;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxRepeatedValue() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {50, 30, 50, 20, 50};
        long expected = 50;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}