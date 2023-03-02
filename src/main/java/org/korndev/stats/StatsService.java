package org.korndev.stats;

public class StatsService {

    public long summaryCount(long[] sales) {
        long sumSales = 0;
        for (int month = 0; month < sales.length; month++) {
            sumSales += sales[month];
        }
        return sumSales;
    }

    public long avarageCount(long[] sales) {
        long sumSales = 0;
        long average = 0;
        for (int month = 0; month < sales.length; month++) {
            sumSales += sales[month];
            average = sumSales / sales.length;
        }
        return average;
    }

    public int minMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int salesLowerAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < avarageCount(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int salesHigherAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > avarageCount(sales)) {
                counter++;
            }
        }
        return counter;
    }
}