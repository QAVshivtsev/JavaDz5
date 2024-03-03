package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MethodTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dannue.csv")
    // dannue.csv
    // 10000,3000,0,3
    public void numberOfMonthsOfRest(int income, int expense, int threshold, int expected) {
        Method service = new Method();
        // вызываем целевой метод:
        //int actual = service.calculate(income, expense, threshold);
        int actual = service.calculate(income, expense, threshold);
        System.out.println(actual); // сли есть желание проверить в ручную
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}