package ru.netology.JavaDz5Z1.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class metodTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dannue.csv")
    // dannue.csv
    // 10000,3000,0,3,20000
    // 100000,60000,0,2,150000
    public void numberOfMonthsOfRest(int income, int expense, int threshold, int expected, int money) {
        metod service = new metod();

        // вызываем целевой метод:
        int actual = service.calculate(income, expense, threshold, money);
        System.out.println(actual); // сли есть желание проверить в ручную
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
