package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class StatsServiceTest {

    //1. Параметризированный тест подсчёта общей суммы
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/values.csv")
    void shouldSusPar(String test, int monthOne, int monthTwo, int monthThree, int monthFour, int monthFive, int monthSix, int monthSeven, int monthEight, int monthNine, int monthTen, int monthEleven, int monthTwelve, int expectedSum, double expectedAverage, int expectedMaxMonth, int expectedMinMonth, int expectedMonthsMinAverage, int expectedMonthsMaxAverage) {
        StatsService service = new StatsService();

        int[] salesM = {
                monthOne, monthTwo, monthThree, monthFour, monthFive, monthSix, monthSeven, monthEight, monthNine, monthTen, monthEleven, monthTwelve
        };

        int actualSum = service.getSum(salesM);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    //2. Параметризированный тест рассчёта средней суммы продаж
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/values.csv")
    void shouldAveragePar(String test, int monthOne, int monthTwo, int monthThree, int monthFour, int monthFive, int monthSix, int monthSeven, int monthEight, int monthNine, int monthTen, int monthEleven, int monthTwelve, int expectedSum, double expectedAverage, int expectedMaxMonth, int expectedMinMonth, int expectedMonthsMinAverage, int expectedMonthsMaxAverage) {
        StatsService service = new StatsService();

        int[] salesM = {
                monthOne, monthTwo, monthThree, monthFour, monthFive, monthSix, monthSeven, monthEight, monthNine, monthTen, monthEleven, monthTwelve
        };

        double actualAverage = service.getAverage(salesM);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    //3. Параметризированный тест поиска номера месяца с максимальными продажами
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/values.csv")
    void getMaxMonthPar(String test, int monthOne, int monthTwo, int monthThree, int monthFour, int monthFive, int monthSix, int monthSeven, int monthEight, int monthNine, int monthTen, int monthEleven, int monthTwelve, int expectedSum, double expectedAverage, int expectedMaxMonth, int expectedMinMonth, int expectedMonthsMinAverage, int expectedMonthsMaxAverage) {
        StatsService service = new StatsService();

        int[] salesM = {
                monthOne, monthTwo, monthThree, monthFour, monthFive, monthSix, monthSeven, monthEight, monthNine, monthTen, monthEleven, monthTwelve
        };

        int actualMaxMonth = service.getMaxMonth(salesM);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    //4. Параметризированный тест поиска номера месяца с минимальными продажами
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/values.csv")
    void getMinMonthPar(String test, int monthOne, int monthTwo, int monthThree, int monthFour, int monthFive, int monthSix, int monthSeven, int monthEight, int monthNine, int monthTen, int monthEleven, int monthTwelve, int expectedSum, double expectedAverage, int expectedMaxMonth, int expectedMinMonth, int expectedMonthsMinAverage, int expectedMonthsMaxAverage) {
        StatsService service = new StatsService();

        int[] salesM = {
                monthOne, monthTwo, monthThree, monthFour, monthFive, monthSix, monthSeven, monthEight, monthNine, monthTen, monthEleven, monthTwelve
        };

        int actualMinMonth = service.getMinMonth(salesM);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    //5. Параметризированный тест рассчёта количества месяцев с продажами ниже среднего
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/values.csv")
    void getMonthSalesMinAveragePar(String test, int monthOne, int monthTwo, int monthThree, int monthFour, int monthFive, int monthSix, int monthSeven, int monthEight, int monthNine, int monthTen, int monthEleven, int monthTwelve, int expectedSum, double expectedAverage, int expectedMaxMonth, int expectedMinMonth, int expectedMonthsMinAverage, int expectedMonthsMaxAverage) {
        StatsService service = new StatsService();

        int[] salesM = {
                monthOne, monthTwo, monthThree, monthFour, monthFive, monthSix, monthSeven, monthEight, monthNine, monthTen, monthEleven, monthTwelve
        };

        int actualMonthsMinAverage = service.getMonthSalesMinAverage(salesM);

        Assertions.assertEquals(expectedMonthsMinAverage, actualMonthsMinAverage);
    }

    //6. Параметризированный тест рассчёта количества месяцев с продажами выше среднего
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/values.csv")
    void getMonthSalesMaxAveragePar(String test, int monthOne, int monthTwo, int monthThree, int monthFour, int monthFive, int monthSix, int monthSeven, int monthEight, int monthNine, int monthTen, int monthEleven, int monthTwelve, int expectedSum, double expectedAverage, int expectedMaxMonth, int expectedMinMonth, int expectedMonthsMinAverage, int expectedMonthsMaxAverage) {
        StatsService service = new StatsService();

        int[] salesM = {
                monthOne, monthTwo, monthThree, monthFour, monthFive, monthSix, monthSeven, monthEight, monthNine, monthTen, monthEleven, monthTwelve
        };

        int actualMonthsMaxAverage = service.getMonthSalesMinAverage(salesM);

        Assertions.assertEquals(expectedMonthsMaxAverage, actualMonthsMaxAverage);
    }

    //1. НеПараметризированный тест подсчёта общей суммы
    @Test
    public void shouldSum() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSum = 180;
        int actualSum = service.getSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    //2. НеПараметризированный тест рассчёта средней суммы продаж
    @Test
    public void shouldAverage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        double expectedAverage = 15.0;
        double actualAverage = service.getAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    //3. НеПараметризированный тест поиска номера месяца с максимальными продажами
    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    //4. НеПараметризированный тест поиска номера месяца с минимальными продажами
    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    //5. НеПараметризированный тест рассчёта количества месяцев с продажами ниже среднего
    @Test
    public void shouldMonthsMinAvertage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonthsMinAverage = 5;
        int actualMonthsMinAverage = service.getMonthSalesMinAverage(sales);

        Assertions.assertEquals(expectedMonthsMinAverage, actualMonthsMinAverage);
    }

    //6. НеПараметризированный тест рассчёта количества месяцев с продажами выше среднего
    @Test
    public void shouldMonthsMaxAvertage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonthsMaxAverage = 5;
        int actualMonthsMaxAverage = service.getMonthSalesMaxAverage(sales);

        Assertions.assertEquals(expectedMonthsMaxAverage, actualMonthsMaxAverage);
    }

}