package ru.netology.services;
public class VacationPlanner {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int i = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money > threshold) {
                i++;
                money = money - expenses;
                money = money - expenses * 3;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return i;
    }
}