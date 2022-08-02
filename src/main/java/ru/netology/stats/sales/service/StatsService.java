package ru.netology.stats.sales.service;

public class StatsService {

    //Рассчет месяца минимальных продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Рассчет месяца максимальных продаж
    public int maxSales(long[] maxsales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : maxsales) {
            if (sale >= maxsales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Рассчет средней суммы продаж
    public int averageamount(int[] average) {
        int sum = 0;
        for (int i = 0; i < average.length; i++) {
            sum = sum + average[i];
        }
        int arithmeticmean = sum / average.length;
        return arithmeticmean;
    }

    //Рассчет суммы всех продаж
    public int totalamount(int[] total) {
        int sum = 0;
        for (int i = 0; i < total.length; i++) {
            sum = sum + total[i];
        }
        return sum;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int belowaverage(int[] below) {
        int sum = 0;
        int months = 0;
        for (int i = 0; i < below.length; i++) {
            sum = sum + below[i];
        }
        int arithmeticmean = sum / below.length;
        // for (int i = 0; i < arithmeticmean; i++);

        for (long lowsales : below) {
            if (lowsales < arithmeticmean) {
                months++;
            }
        }
        return months;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int highsales(int[] high) {
        int sum = 0;
        int months = 0;
        for (int i = 0; i < high.length; i++) {
            sum = sum + high[i];
        }
        int arithmeticmean = sum / high.length;
        for (long lowsales : high) {
            if (lowsales > arithmeticmean) {
                months++;
            }
        }
        return months;
    }
}
