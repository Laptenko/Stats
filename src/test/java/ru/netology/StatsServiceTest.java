package ru.netology;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void calculateSum(){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = StatsService.sum(sales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateAverage(){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = StatsService.average(sales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateMonthMaxSale(){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = StatsService.monthMaxSale(sales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateMonthMinSale(){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = StatsService.monthMinSale(sales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateCountMonthSaleLessAverage(){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = StatsService.countMonthSaleLessAverage(sales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateCountMonthSaleMoreAverage(){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = StatsService.countMonthSaleMoreAverage(sales);
        assertEquals(expected,actual);
    }

}
