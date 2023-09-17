package ru.coldsun.lesson3;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{
    private double ratePerHour;

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * ratePerHour;
    }

    private Freelancer(String surName, String name, double salary, double ratePerHour){
        super(surName, name, salary);

    }

    public Freelancer(String surName, String name, double ratePerHour) {

        this(surName, name, 20.8 * 8 * ratePerHour, ratePerHour);

    }

    public static Employee getInstance(){
        //double calculateRate = random.nextInt(3000, 25000));
        return new Freelancer(
                surNames[random.nextInt(surNames.length)],
                names[random.nextInt(surNames.length)],
                random.nextInt(1000, 9000));
    }

    public static List<Employee> getEmployees(int count){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++)
            employees.add(getInstance());
        return employees;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (20.8 * 8 * %.2f): %.2f (руб.)",
                surName, name, salary/166.4, salary);
    }
}
