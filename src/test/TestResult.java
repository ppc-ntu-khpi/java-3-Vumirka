package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        int maxNumber = 100000;

        int result = Exercise.Calculate(maxNumber);

        System.out.println("Кількість номерів, які потрібно виключити: " + result);
    }
}
