package ru.netology.stats;

public class StatsService {

    //1. Сумма всех продаж
    public int getSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    //2. Средняя сумма продаж
    public double getAverage(int[] sales) {
        double aver = getSum(sales);
        double average = aver / sales.length;
        return average;
    }

    //3. Номер месяца с максимальными продажами
    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int iMax = 0; iMax < sales.length; iMax++) {
            if (sales[iMax] >= sales[maxMonth]) {
                maxMonth = iMax;
            }
        }
        maxMonth += 1;
        return maxMonth;
    }

    //4. Номер месяца с минимальными продажами
    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int iMin = 0; iMin < sales.length; iMin++) {
            if (sales[iMin] <= sales[minMonth]) {
                minMonth = iMin;
            }
        }
        minMonth += 1;
        return minMonth;
    }

    //5. Количество месяцев с продажами ниже среднего
    public int getMonthSalesMinAverage(int[] sales) {
        int minMonthAvertage = 0;
        double sumAvertage = getAverage(sales);
        for (int sale : sales) {
            if (sale < sumAvertage) {
                minMonthAvertage +=1;
            }
        }
        return minMonthAvertage;
    }

    //6. Количество месяцев с продажами выше среднего
    public int getMonthSalesMaxAverage(int[] sales) {
        int maxMonthAvertage = 0;
        double sumAvertage = getAverage(sales);
        for (int sale : sales) {
            if (sale > sumAvertage) {
                maxMonthAvertage +=1;
            }
        }
        return maxMonthAvertage;
    }

}