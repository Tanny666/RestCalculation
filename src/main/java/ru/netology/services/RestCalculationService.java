package ru.netology.services;

public class RestCalculationService {
    public int calculate(int income, int expenses, int threshold) {// параметры
        int Rest = 0; //отдых
        int Money = 0; //деньги

        for (int month = 1; month <= 12; month++) {
            if (Money >= threshold) { //если на счету есть хотя бы threshold денег, то выбираем отдых, иначе — работу.
                Money = Money - expenses;//деньги - расходы
                Money = (Money - expenses) / 4; // то за месяц его деньги уменьшаются на expense, а затем остаток накоплений ещё уменьшается в три раза — траты на отдых;
                Rest++;
                if (Money < threshold) { // остаток денег после отдыха
                    Money = Money + income - expenses; // Если денег нет, работаем
                }
            } else {
                Money = Money + income - expenses;
            }
        }
        return Rest;
    }
}
