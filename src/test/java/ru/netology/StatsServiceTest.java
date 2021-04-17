package ru.netology;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void calculateSum(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sum(sales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateAverage(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.average(sales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateMonthMaxSale(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.monthMaxSale(sales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateMonthMinSale(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.monthMinSale(sales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateCountMonthSaleLessAverage(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthSaleLessAverage(sales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateCountMonthSaleMoreAverage(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthSaleMoreAverage(sales);
        assertEquals(expected,actual);
    }

}
