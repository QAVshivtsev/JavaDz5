package ru.netology.JavaDz5Z1.service;

public class Metod2 {
    public int calculate(int income, int expense, int threshold) {
        // income - доход от работы
        // expense - месячные обязательные траты
        // threshold - денег на счету
        // money - необходимое количество денег на счету
        int count = 0; // счётчик месяцев отдыха изначально
        for (int month = 0; month < 12; month++) {   // с 1 по 12 месяц цикл с увеличением на 1 месяц
            // можем ли отдыхать?
            if (150_000 >= threshold) { // Если денег на ссчету меньше чем нужно для отдыха тогда:
                threshold = threshold + income - expense; // Денег на счету + доход - расходы
            } else {  // Если денег больше на счету чем нужно для отдыха тогда:
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = (threshold - expense) / 3; //Денег на счету - траты на отдых
            }
        }
        return count;  // верни количество месяцев отдыха
    }

}