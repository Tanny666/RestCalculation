package ru.netology.services;

public class RestCalculationService {
    public int calculate(int income, int expenses, int threshold) {
        int rest = 0; // отдых
        int money = 0; // деньги

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { //денег больше чем остаток
                rest++; // отдых увеличивается
                money = money - expenses; // деньги - расходы
                if (money - expenses > 0) { //деньги - расходы > 0
                    money = (money - expenses) / 3; // затем остаток накоплений ещё уменьшается в три раза — траты на отдых;
                } else {
                    money = 0;
                }
            } else {
                money = money + income - expenses; // тогда работаем:  доход + расходы
            }
        }
        return rest;
    }
}