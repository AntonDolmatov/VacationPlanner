package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationPlannerTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/testdata.csv")
    public void testExample(int income, int expenses, int threshold, int expected) {
        VacationPlanner planner = new VacationPlanner();
        int actual = planner.calculateVacationMonths(income, expenses, threshold);
        assertEquals(expected, actual);
    }

}