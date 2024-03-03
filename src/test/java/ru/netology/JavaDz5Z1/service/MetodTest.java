package ru.netology.JavaDz5Z1.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class MetodTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dannue.csv")
    // dannue.csv
    // 10000,3000,0,3

    public void numberOfMonthsOfRest(int income, int expense, int threshold, int expected) {
        Metod service = new Metod();

        // вызываем целевой метод:
        //int actual = service.calculate(income, expense, threshold);
        int actual = service.calculate(income, expense, threshold);
        System.out.println(actual); // сли есть желание проверить в ручную
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dannue2.csv")

    // 10000,3000,0,3

    public void numberOfMonthsOfRest2(int income, int expense, int threshold, int expected) {
        Metod2 service = new Metod2();
        // dannue.csv
        // 100000, 60000, 0, 2
        // вызываем целевой метод:
        //int actual = service.calculate(income, expense, threshold);
        int actual = service.calculate(income, expense, threshold);
        System.out.println(actual); // сли есть желание проверить в ручную
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}