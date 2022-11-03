import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {

        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int sum = service.getSum(sales);
        System.out.println("1. Сумма всех продаж = " + sum);

        double average = service.getAverage(sales);
        System.out.println("2. Средняя сумма продаж в месяц = " + average);

        int maxMonth = service.getMaxMonth(sales);
        System.out.println("3. Номер месяца с максимальными продажами: " + maxMonth);

        int minMonth = service.getMinMonth(sales);
        System.out.println("4. Номер месяца с минимальными продажами: " + minMonth);

        int minMonthAvertage = service.getMonthSalesMinAverage(sales);
        System.out.println("5. Количество месяцев с продажами ниже среднего: " + minMonthAvertage);

        int maxMonthAvertage = service.getMonthSalesMaxAverage(sales);
        System.out.println("6. Количество месяцев с продажами выше среднего: " + maxMonthAvertage);

    }
}