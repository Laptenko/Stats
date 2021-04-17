package ru.netology;

public class StatsService {

    public int sum(int[] sales) { // сумма всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int average(int[] sales) { // средняя сумма продаж в месяц
        StatsService service = new StatsService();
        int average = service.sum(sales) / sales.length;
        return average;
    }

    public int monthMaxSale(int[] sales) { // номер месяца с максимальной продажей
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

    public int monthMinSale(int[] sales) { // номер месяца с минимальной продажей
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

    public int countMonthSaleLessAverage(int[] sales) { // количество месяцев, где продажа была ниже сренего
        int count = 0;
        for (int sale : sales){
            StatsService service = new StatsService();
            int average = service.average(sales);
            if (sale < average){
                count++;
            }
        }
        return count;
    }

    public int countMonthSaleMoreAverage(int[] sales) { // количество месяцев, где продажа была выше сренего
        int count = 0;
        for (int sale : sales){
            StatsService service = new StatsService();
            int average = service.average(sales);
            if (sale > average){
                count++;
            }
        }
        return count;
    }

}
