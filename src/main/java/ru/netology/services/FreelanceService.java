package ru.netology.services;

public class FreelanceService {
    public long calculate(long income, long expenses, long threshold) {
        long balance = 0;
        long count = 0;
        for (long i = 0; i < 12; i++) {
            if (balance >= threshold) {
                // отдых
                balance -= expenses;
                balance /= 3;
                count ++;
            } else {
                // работа
                balance += income;
                balance -= expenses;

            }

        }
        return count;
    }
}
