package ru.netology;

public class StatsService {

    public static int sum(int[] sales) { // сумма всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public static int average(int[] sales) { // средняя сумма продаж в месяц
        int average = StatsService.sum(sales) / sales.length;
        return average;
    }

    public static int monthMaxSale(int[] sales) { // номер месяца с максимальной продажей
        int month = 0;
        int maxMonth = 0;
        int max = sales[0];
        for (int sale : sales) {
            month++;
            if (max <= sale) {
                max = sale;
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public static int monthMinSale(int[] sales) { // номер месяца с минимальной продажей
        int month = 0;
        int maxMonth = 0;
        int max = sales[0];
        for (int sale : sales) {
            month++;
            if (max >= sale) {
                max = sale;
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public static int countMonthSaleLessAverage(int[] sales) { // количество месяцев, где продажа была ниже сренего
        int count = 0;
        for (int sale : sales){
            if (sale < StatsService.average(sales)){
                count++;
            }
        }
        return count;
    }

    public static int countMonthSaleMoreAverage(int[] sales) { // количество месяцев, где продажа была выше сренего
        int count = 0;
        for (int sale : sales){
            if (sale > StatsService.average(sales)){
                count++;
            }
        }
        return count;
    }

}
