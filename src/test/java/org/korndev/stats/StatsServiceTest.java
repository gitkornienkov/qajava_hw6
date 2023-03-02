package org.korndev.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void summaryCountTest() {

        long actual = service.summaryCount(sales);
        long expected = 180;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void avarageCountTest() {

        long actual = service.avarageCount(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonthTest() {

        int actual = service.minMonth(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthTest() {

        int actual = service.maxMonth(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
   public void salesLowerAverage() {

        int actual = service.salesLowerAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void salesHigherAverage() {

        int actual = service.salesHigherAverage(sales);
        int expected = 5;
    }
}