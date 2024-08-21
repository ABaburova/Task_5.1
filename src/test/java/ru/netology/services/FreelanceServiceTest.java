package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FreelanceServiceTest {

    @Test
    void  TestFreelanceService1() {
          FreelanceService service = new FreelanceService();

          // подготавливаем данные
          long income = 10_000;
          long expense = 3_000;
          long threshold = 20_000;
          long expected = 3;
          // вызываем целевой метод
          long actual = service.calculate(income, expense, threshold);
          // производим проверку
          Assertions.assertEquals(expected, actual);
    }

    @Test
    void  TestFreelanceService2() {
        FreelanceService service = new FreelanceService();

        // подготавливаем данные
        long income = 100_000;
        long expense = 60_000;
        long threshold = 150_000;
        long expected = 2;
        // вызываем целевой метод
        long actual = service.calculate(income, expense, threshold);
        // производим проверку
        Assertions.assertEquals(expected, actual);
    }

}