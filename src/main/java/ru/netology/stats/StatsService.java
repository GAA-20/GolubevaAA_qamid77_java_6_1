package ru.netology.stats;

public class StatsService {

    public long totalOfAllSales(long[] sales) {
        long allSales = 0; // сумма всех продаж

        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[i];
        }

        return allSales;
    }

    public double averageSalesPerMonth(long[] sales) {
        return totalOfAllSales(sales) / (double) sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как махстмальное
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthsNumWithSalesBelowAverage(long[] sales) {
        int monthsNumWithSalesBelowAverage = 0; // количество месяцев, в которых продажи были ниже среднего

        double averageSales = averageSalesPerMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                monthsNumWithSalesBelowAverage = monthsNumWithSalesBelowAverage + 1;
            }
        }
        return monthsNumWithSalesBelowAverage;
    }

    public int monthsNumWithSalesAboveAverage(long[] sales) {
        int monthsNumWithSalesBelowAverage = 0; // количество месяцев, в которых продажи были ниже среднего

        double averageSales = averageSalesPerMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                monthsNumWithSalesBelowAverage = monthsNumWithSalesBelowAverage + 1;
            }
        }
        return monthsNumWithSalesBelowAverage;
    }
}
