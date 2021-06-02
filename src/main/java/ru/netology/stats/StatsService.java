package ru.netology.stats;

public class StatsService {
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;


    }

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum = sum + purchase;
        }
        return sum;
    }

    public long mediumSum(long[] sales) {
        long averageSale = calculateSum(sales) / sales.length;
        return averageSale;
    }

    public long belowAverageSales(long[] sales) {
        long monthsAmount = 0;
        long sum = 0;
        for (long monthSale : sales) {
            sum += monthSale;
        }
        for (long monthSale : sales) {
            if (monthSale < mediumSum(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }

    public long aboveAverageSales(long[] sales) {
        long monthsAmount = 0;
        long sum = 0;
        for (long monthSale : sales) {
            sum += monthSale;
        }

        for (long monthSale : sales) {
            if (monthSale > mediumSum(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;

    }

}
