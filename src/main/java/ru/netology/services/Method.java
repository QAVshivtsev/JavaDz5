package ru.netology.services;

public class Method {
    public int calculate(int income, int expense, int threshold) {
        // income - доход от работы
        // expense - месячные обязательные траты
        // threshold - необходимое количество денег на счету
        int money = 0; // денег на счету изначально
        int count = 0; // счётчик месяцев отдыха изначально
        for (int month = 0; month < 12; month++) {   // с 1 по 12 месяц цикл с увеличением на 1 месяц
            // можем ли отдыхать?
            if (threshold >= money) { // Если денег на счету меньше чем нужно для отдыха тогда:
                money = money + income - expense; // Денег на счету + доход - расходы
            } else {  // Если денег больше на счету чем нужно для отдыха тогда:
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expense) / 3; //Денег на счету - траты на отдых
            }
        }
        return count;  // верни количество месяцев отдыха
    }
}